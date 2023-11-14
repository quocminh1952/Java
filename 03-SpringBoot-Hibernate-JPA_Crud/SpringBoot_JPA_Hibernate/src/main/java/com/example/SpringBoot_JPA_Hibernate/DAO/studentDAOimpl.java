package com.example.SpringBoot_JPA_Hibernate.DAO;

import com.example.SpringBoot_JPA_Hibernate.Entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.swing.text.html.parser.Entity;
import java.util.List;

@Repository
public class studentDAOimpl implements studentDAO{

    // Define field for entiry manager:
    private EntityManager entityManager;

    // inject entity manager using constructor injection :
    @Autowired
    public studentDAOimpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    //implement save method :
    @Override
    @Transactional
    public void save(Student student) {
        entityManager.persist(student); //persist : add record to database
    }

    @Override
    public Student findById(int id) {
      return entityManager.find(Student.class, id) ;
    }

    public List<Student> findAll(){
        //create Query:
        TypedQuery<Student> Query = entityManager.createQuery("From Student order by last_name" , Student.class);
        //TypeQuery<Student> truy vấn lấy kiểu dữ liệu Student
        return Query.getResultList();
    }

    public List<Student> findByLastName(String the_Last_Name){
        //create Query
        TypedQuery<Student> Query = entityManager.createQuery("From Student where last_name =:theData ", Student.class);
        //Set parameter:
        Query.setParameter("theData",the_Last_Name);
        //return query result:
        return Query.getResultList();
    }

    //When creating methods related to adding, editing, and deleting, @transactional is required
    @Override
    @Transactional
    public void update(Student student) {
        entityManager.merge(student);
    }

    @Override
    @Transactional
    public void delete(int id) {

        //retrieve the student:
        Student student = entityManager.find(Student.class , id);

        //delete student:
        entityManager.remove(student);
    }


}
