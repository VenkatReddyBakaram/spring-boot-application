package com.vtech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.vtech.service.Laptop;

/*@EnableAutoConfiguration
@Configuration
@ComponentScan(basePackages = "com.vtech.*")*/
@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		System.out.println("Welcome To Spring Boot Development");

		// StudentService studentService = new StudentService();

		// Object object = context.getBean(StudentService.class);
		// StudentService studentService = (StudentService) object;
		/*
		 * StudentService studentService = context.getBean(StudentService.class);
		 * studentService.printStudentDetails();
		 */

		// Laptop laptop = context.getBean(Laptop.class);
		// Object beanObject = context.getBean("laptop");
		// If there is no component name defined then default name will be as it's class
		// name

		Object beanObject = context.getBean("laptopDell");
		Laptop laptop1 = (Laptop) beanObject;
		laptop1.laptopDetails("Dell", "Inspiron", 90000.00);

		Laptop laptop2 = (Laptop) context.getBean("laptopDell");
		laptop2.laptopDetails("Dell", "Super", 92000.00);

		Laptop laptop3 = (Laptop) context.getBean("laptopDell");
		laptop3.laptopDetails("Dell", "Xtreme", 93000.00);

	}
}
