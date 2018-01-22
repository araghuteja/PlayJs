package com.playJs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlayJsApplication {

	public static void main(String[] args) throws Exception {
		String env;
		if (args.length > 0 && args[0].equals("PROD")) {
			// PROD PROPS
			System.out.println("PROD Mode");
			
			String url = System.getenv().get("SQL.HOST");
			System.out.println("URL - " + url);
			System.setProperty("sql.url", url);
			
			String uname = System.getenv().get("SQL.UNAME");
			System.out.println("UNAME - " + uname);
			System.setProperty("sql.username", uname);
			
			String pass = System.getenv().get("SQL.PASS");
			System.out.println("PASS - " + pass);
			System.setProperty("sql.password", pass);
			
			System.out.println("-----------");
			System.out.println("Variables set");
			System.out.println(System.getProperty("sql.url"));
			System.out.println(System.getProperty("sql.username"));
			System.out.println(System.getProperty("sql.password"));
			System.out.println("-----------");
			
			env = "PROD";
		} else if (args.length > 0 && args[0].equals("DEV")) {
			// DEV PROPS
			System.out.println("DEV Mode");
			
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
