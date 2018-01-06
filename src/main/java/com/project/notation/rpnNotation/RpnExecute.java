package com.project.notation.rpnNotation;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@ComponentScan(basePackages = { "com.project.notation.rpnNotation" })
public class RpnExecute {
	public static void main(String arg[]) {
		SpringApplication.run(RpnExecute.class, arg);
	}

}
