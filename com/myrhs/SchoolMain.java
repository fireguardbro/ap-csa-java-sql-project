package com.myrhs;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.myrhs.Student;
import java.time.LocalDateTime;


public class SchoolMain {

    public static void main(String[] args) {

        List<Student> result = new ArrayList<>();

        String SQL_SELECT = "Select * from student";

        // auto close connection and preparedStatement
        // 127.0.0.1 is localhost! We could use localhost too.
        // We can remove hardcoded DBname and user as well as enhancement.
        try (Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://127.0.0.1:5432/myDB", "myuser", "mypassword");
             PreparedStatement preparedStatement = conn.prepareStatement(SQL_SELECT)) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                long id = resultSet.getLong("ID");
                String name = resultSet.getString("NAME");
                Double gpa = resultSet.getDouble("GPA");
                Timestamp createdDate = resultSet.getTimestamp("CREATED_DATE");

                Student obj = new Student();
                obj.setId(id);
                obj.setName(name);
                obj.setGpa(gpa);
                // Timestamp -> LocalDateTime
                obj.setCreatedDate(createdDate.toLocalDateTime());

                result.add(obj);

            }
            result.forEach(my_val -> System.out.println(my_val));

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
