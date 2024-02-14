package DAO;

import Config.ConnConfig;
import Entities.Student;

import java.io.ObjectInputFilter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDao {
    public static String insert(Student student)
            throws SQLException {
        Connection conn1= ConnConfig.create();
        String qString = "insert " +
                "into student(id,name,city) values(?,?,?)";
        PreparedStatement smt = conn1.prepareStatement(qString);
        smt.setInt(1,student.getId());
        smt.setString(2,student.getName());
        smt.setString(3,student.getCity());
        smt.executeUpdate();
        return "student added";
    }

}
