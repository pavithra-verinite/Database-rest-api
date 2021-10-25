package com.example.demo;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class SpringJdbcTemplate2PostgresSqlApplication implements CommandLineRunner{
	@Autowired
	private StudentRepository StuRepo;
	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcTemplate2PostgresSqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Student>st=StuRepo.findAll();
		st.forEach(System.out::println);
		System.exit(0);
	}
}
