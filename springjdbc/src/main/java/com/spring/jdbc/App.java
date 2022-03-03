package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My Program started ........." );
        //spring jdbc=>JdbcTemplate
        
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        
//        JdbcTemplate template=context.getBean("jdbcTemplate",JdbcTemplate.class);
        
        
        // insert query  
        
//        String query="insert into student(id,name,city) values(?,?,?)";
        
        // fire the query 
        
//        int result = template.update(query,457,"Tech Soni","Punjab");
         StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
         // INSERT
         //       Student student = new Student();
//       student.setId(19);
//       student.setName("Rohan");
//       student.setCity("Banglore");
//       
//       int result = studentDao.insert(student);
//       
//       System.out.println("student added "+ result);
        
        // UPDATE
//        Student student =new Student();
//        student.setId(11);
//        student.setName("Raj Kumar");
//        student.setCity("Lucknow");
//        int result=studentDao.change(student);
//        System.out.println("data changed "+result);
         
        
        //        System.out.println("number of record inserted .." + result);
        //DELETE
         
//       int result=studentDao.delete(456);
//       System.out.println("deleted "+result);
         
        //
//         Student student=studentDao.getStudent(11);
//         System.out.println(student);
         
         List<Student> students=studentDao.getAllStudents();
         for(Student s:students) {
        	 System.out.println(s);
         }
        
    }
}
