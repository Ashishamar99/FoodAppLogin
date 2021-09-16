package com.brillio.foodapp.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class LoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginApplication.class, args);
		BCryptPasswordEncoder bCrypt = new BCryptPasswordEncoder();
		System.out.println(bCrypt.encode("1234"));
		System.out.println(bCrypt.encode("admin"));
		//Adding this change to dev branch to trigger the webhook.
	}

}
