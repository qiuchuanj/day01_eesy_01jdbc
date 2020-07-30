package cn.edu.cqupt;

import java.sql.*;

/**
 * @author qcj
 * @date 2020/7/24 - 20:48
 */
public class Jdbc {
    public static void main(String[] args) throws SQLException {
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/qcj?useUnicode=true&characterEncoding=utf8&serverTimezone=UTC&useSSL=false", "root", "19990508qcj");
        PreparedStatement preparedStatement=connection.prepareStatement("select * from functions");
        ResultSet resultSet=preparedStatement.executeQuery();
        while (resultSet.next()){
            System.out.println(resultSet.getString("functions_name"));
        }
        resultSet.close();
        preparedStatement.close();
        connection.close();
    }



}
