package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Computer;

@Configuration
public class BeanConfiguration {
	@Bean
	public Computer computer(){
		Computer bean = new Computer();
		bean.setBrand("Apple");
		bean.setLaptop(true);
		bean.setPrice(999.99);
		return bean;
	}
}
