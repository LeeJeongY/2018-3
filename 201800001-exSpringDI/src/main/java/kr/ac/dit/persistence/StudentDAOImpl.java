package kr.ac.dit.persistence;
import org.springframework.stereotype.Repository;
import kr.ac.dit.domain.StudentVO;
@Repository
public class StudentDAOImpl implements StudentDAO {
	@Override
	public void insertStudent(StudentVO studentVO) throws Exception {
		System.out.println("Spring DI pattern~!");
	}
}
