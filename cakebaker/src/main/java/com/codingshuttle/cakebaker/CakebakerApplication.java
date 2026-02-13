package com.codingshuttle.cakebaker;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CakebakerApplication implements CommandLineRunner {

	private final CakeBaker cakeBaker;

    public CakebakerApplication(CakeBaker cakeBaker) {
        this.cakeBaker = cakeBaker;
    }

    public static void main(String[] args) {
		SpringApplication.run(CakebakerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		cakeBaker.bakeCake();


	}
}
