package com.infosys.educationConsultancyApplication.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import com.infosys.educationConsultancyApplication.bean.Student;

@Service
@Repository
public class StudentDaoImpl implements StudentDao {
    @Autowired
    private StudentRepository repository;

    @Override
    public void save(Student student) {
        repository.save(student);
    }

    @Override
    public Student getStudentById(String id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

  

    @Override
    public String generateNewRegistrationNum() {
    	Long id=0L;
		String val=repository.getMaxRegistrationNum();
		if(val==null)
			id=100001L;
		else {
			id=Long.parseLong(val.substring(1));
			id++;
		}
		String newId="S"+id;  	
		return newId;
    }

	@Override
	public List<Student> getCurrentStudents() {
		return repository.getCurrentStudents();
	}

	@Override
	public String getStudentStatusByUserName(String userName) {
		return repository.getStudentStatusByUserName(userName);
	}

	@Override
	public Student getStudentByUserName(String userName) {
		return repository.getStudentByUserName(userName);
	}
}