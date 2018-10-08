package kr.ac.dit.persistence;
import kr.ac.dit.domain.StudentVO;
public interface StudentDAO {
	public void insertStudent(StudentVO studentVO) throws Exception;
}
