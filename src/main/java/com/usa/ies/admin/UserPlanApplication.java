package com.usa.ies.admin;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.usa.ies.admin.entity.Address2;
import com.usa.ies.admin.entity.Course;
import com.usa.ies.admin.entity.Customer;
import com.usa.ies.admin.entity.Movie;
import com.usa.ies.admin.entity.CartOrder;
import com.usa.ies.admin.entity.Student;
import com.usa.ies.admin.entity.Theatre;
import com.usa.ies.admin.entity.User2;
import com.usa.ies.admin.repo.CustomerRepository;
import com.usa.ies.admin.repo.OrderRepository;
import com.usa.ies.admin.repo.StudentRepository;
import com.usa.ies.admin.repo.TheartreRepository;
import com.usa.ies.admin.repo.User2Repository;

@SpringBootApplication
public class UserPlanApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ac = SpringApplication.run(UserPlanApplication.class, args);

		
TheartreRepository theartreRepository=(TheartreRepository)ac.getBean("theartreRepository") ;
Movie movie=new Movie();
movie.setMovieName("dukudu");
movie.setTprice(200);

Movie movie1=new Movie();
movie1.setMovieName("bahubali1");
movie1.setTprice(250);
Movie movie2=new Movie();
movie2.setMovieName("bahubali12");
movie2.setTprice(300);
List<Movie> movileList=new ArrayList<Movie>();
movileList.add(movie);
movileList.add(movie2);
movileList.add(movie1);
Theatre t=new Theatre();
t.setTname("Asian LaxmiKala");
t.setTplace("musapet");
t.setMovieList(movileList);

theartreRepository.save(t);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * StudentRepository
		 * studentRepository=(StudentRepository)ac.getBean("studentRepository"); Course
		 * course=new Course(); course.setCourseName("kks");
		 * //course.setStudents(student); Course c=new Course();
		 * c.setCourseName("jddld"); List<Course> courseList=new ArrayList<Course>();
		 * courseList.add(course); courseList.add(c);
		 * 
		 * Student student=new Student(); student.setStudentName("mastanva");
		 * student.setCourses(courseList); studentRepository.save(student);
		 */

//	User2Repository user=(User2Repository)ac.getBean("user2Repository");
//		/*
//		 * User2 user2=new User2(); user2.setUserName("Mastanvali"); Address2 add2=new
//		 * Address2(); user2.setAddress(add2); user.save(user2);
//		 */
//Iterable<User2> userList=	user.findAll();
//for(User2 u:userList) {
//	System.out.println(u.getUserId()+""+u.getUserName()+u.getAddress().getAddressId());
//}

		
		/*
		 * CustomerRepository
		 * customerRepository=(CustomerRepository)ac.getBean("customerRepository");
		 * Customer customer=new Customer(); customer.setCustomerName("mastanvali");
		 * 
		 * CartOrder order=new CartOrder(); order.setOrderName("Books");
		 * order.setOrderdate(new Date()); CartOrder order1=new CartOrder();
		 * order.setOrderName("Mobiles"); order.setOrderdate(new Date());
		 * List<CartOrder> orders=new ArrayList<CartOrder>(); orders.add(order);
		 * orders.add(order1);
		 * 
		 * customer.setOrders(orders); order.setCustomer(customer);
		 * customerRepository.save(customer);
		 * 
		 * 
		 */	  
		 
	}

}
