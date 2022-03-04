package com.example.grocery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@SpringBootApplication
public class GroceryApplication implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(GroceryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String sql = "SELECT * FROM category";
		List<Category> categories = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Category.class));
		categories.forEach(System.out::println);
	}
}
