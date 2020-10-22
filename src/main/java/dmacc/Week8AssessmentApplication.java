package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Computer;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.ComputerRepository;

@SpringBootApplication
public class Week8AssessmentApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Week8AssessmentApplication.class, args);
	}

	@Autowired
	ComputerRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Computer c = appContext.getBean("computer", Computer.class);
		c.setBrand("Apple");
		repo.save(c);
		
		Computer d = new Computer("Samsung", 500.99, true);
		repo.save(d);
		
		List<Computer> allMyComputers = repo.findAll();
		for(Computer computer: allMyComputers) {
			System.out.println(computer.toString());
		}
		((AbstractApplicationContext) appContext).close();
	}

}
