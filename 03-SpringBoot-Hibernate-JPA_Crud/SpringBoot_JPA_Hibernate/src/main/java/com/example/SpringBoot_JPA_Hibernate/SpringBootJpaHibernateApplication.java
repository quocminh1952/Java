package com.example.SpringBoot_JPA_Hibernate;

import com.example.SpringBoot_JPA_Hibernate.DAO.studentDAO;
import com.example.SpringBoot_JPA_Hibernate.DAO.studentDAOimpl;
import com.example.SpringBoot_JPA_Hibernate.Entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication //Đánh dâu lớp chính của SpringBoot
public class SpringBootJpaHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaHibernateApplication.class, args);
	}

	@Bean // đánh dấu được thêm vào context và tự động được gọi khi main được khởi động
	public CommandLineRunner commandLineRunner(studentDAO studentDAO){
		return runner -> {
//			createStudent(studentDAO);
//			findAll(studentDAO);
//			findByLastName(studentDAO);
//			updateStudent(studentDAO);
			deleteStudent(studentDAO);
		};
	}

	// CRUD : Create - Read - Update - Delete


	//CREATE
	private void createStudent(studentDAO studentDAO) {
		//create student object:
		System.out.println("creating student: .... ");
		// Student student = new Student("Le Tien","D","LeD@gmail.com");
		Student student2 = new Student("Nguyen Van","C","NguyenC@gmail.com");
		Student student3 = new Student("Tran Thi ","B","LeD@gmail.com");
		Student student4 = new Student("Ngo Van","A","LeD@gmail.com");
		//save object to database:
		System.out.println("saving student : ");
		//studentDAO.save(student);
		studentDAO.save(student2);
		studentDAO.save(student3);
		studentDAO.save(student4);
	}

	//READ
	private void findById(studentDAO studentDAO){
		studentDAO.findById(2);
	}
	private void findAll(studentDAO studentDAO){
		List<Student> studentList = studentDAO.findAll();
		for(Student student : studentList){
			System.out.println(student);
		}
	}

	 private void findByLastName(studentDAO studentDAO){
		List<Student> studentList = studentDAO.findByLastName("A");
		for(Student student : studentList){
			System.out.println(student);
		}
	 }


	//Update:
	public void updateStudent(studentDAO studentDAO){
		//Getting information of student on the id : primary key;
		int studentId = 1 ;
		System.out.println("Getting student with id "+studentId);
		Student student = studentDAO.findById(1);

		//Update student:
		System.out.println("Updating student: ");
		student.setFirst_name("Trinh Xuan");
		studentDAO.update(student);

		//Display updated student;
		System.out.println(studentDAO.findById(1));
	}

	public void deleteStudent(studentDAO studentDAO){
		int studentId = 2;
		System.out.println("Getting student with id = 2 : "+studentId);
		Student student = studentDAO.findById(2);

		//Delete student :
		System.out.print("Deleting student : ....");
		studentDAO.delete(studentId);
		System.out.println("Delete Success !");
	}


}
