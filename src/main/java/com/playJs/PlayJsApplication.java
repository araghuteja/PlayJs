package com.playJs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlayJsApplication {

	public static void main(String[] args) throws Exception {
		String env;
		if (args.length > 0 && args[0].equals("PROD")) {
			// PROD PROPS
			System.setProperty("sql.url", System.getenv().get("SQL.HOST"));
			System.setProperty("sql.username", System.getenv().get("SQL.UNAME"));
			System.setProperty("sql.password", System.getenv().get("SQL.PASS"));
			env = "PROD";
		} else if (args.length > 0 && args[0].equals("DEV")) {
			// DEV PROPS
			System.setProperty("sql.url", "jdbc:mysql://localhost:3306/play_js?verifyServerCertificate=false&useSSL=false&requireSSL=false");
			System.setProperty("sql.username", "root");
			System.setProperty("sql.password", "root");
			env = "DEV";
		} else {
			throw new RuntimeException("Please provide the type of ENV - DEV or PROD - as the first argument");
		}

		SpringApplication.run(PlayJsApplication.class, args);
		System.out.println("Application started in " + env + " environment");
	}
}
