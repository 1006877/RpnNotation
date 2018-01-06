package com.project.notation.rpnNotation;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RpnNotationConfig {

	@Bean(name = "rpnNotation")
	public RpnNotation getRpnNotation() {
		return new RpnNotation();
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext context) {
		return arg -> {
			System.out.println("CommandLineRunner");
			RpnNotation RpnNotation = context.getBean("rpnNotation", RpnNotation.class);
			Scanner sc = new Scanner(System.in);
			System.out.println("Info : enter your expression for example {13 2 +},{8 3 *}");
			String result = RpnNotation.executeCode(sc.nextLine());
			System.out.println(result);
			sc.close();
		};
	}
}
