package com.russ;

import com.russ.calculator.Calculator;
import com.russ.enums.City;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RussProjApplication {

	public static void main(String[] args) throws Exception {
		ApplicationContext container = SpringApplication.run(RussProjApplication.class, args);
		Calculator calculator = container.getBean("calculator", Calculator.class);
		System.out.println(calculator.getTotalCarpetCost(City.MCLEAN));

	}

}
