import Config.ConnConfig;
import DAO.StudentDao;
import Entities.Student;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Student st1 = new Student(2,"raj","indore");

        System.out.println(StudentDao.insert(st1));
    }

}