package utils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DbUtils {

    public static List<Map<String, String>> fetchData(String query) {

        String dbUrl =  ConfigReader.read("dbUrl");
        String dbUser = ConfigReader.read("dbUser");
        String dbPassword = ConfigReader.read("dbPassword");

        List<Map<String, String>> tableData = new ArrayList<>();


        try {

            Connection connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            ResultSetMetaData metaData = resultSet.getMetaData();

            while (resultSet.next()) {

                Map<String, String> row = new java.util.LinkedHashMap<>();


                for (int i = 1; i <= metaData.getColumnCount(); i++) {
                    String columnName = metaData.getColumnName(i);
                    String value = resultSet.getString(i);
                    row.put(columnName, value);
                }

                tableData.add(row);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
            return tableData;
    }
}