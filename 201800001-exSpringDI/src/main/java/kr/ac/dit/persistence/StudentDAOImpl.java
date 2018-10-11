package kr.ac.dit.persistence;
import java.sql.*;

import org.springframework.stereotype.Repository;

import kr.ac.dit.domain.StudentVO;

@Repository

public class StudentDAOImpl implements StudentDAO {

@Override

public void insertStudent(StudentVO studentVO) throws Exception {

String no = studentVO.getNo();

String name = studentVO.getName();

Class.forName("oracle.jdbc.driver.OracleDriver");

Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "201800001", "201800001");

PreparedStatement pstmt = conn.prepareStatement("insert into student values(?,?)");

pstmt.setString(1, no);

pstmt.setString(2, name);

pstmt.executeUpdate();

pstmt.close();

conn.close();
	}
}
