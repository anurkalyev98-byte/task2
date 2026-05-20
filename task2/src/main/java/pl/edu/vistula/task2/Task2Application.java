package pl.edu.vistula.task2;

import pl.edu.vistula.task2.model.Product;
import pl.edu.vistula.task2.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Task2Application {

	public static void main(String[] args) {
		SpringApplication.run(Task2Application.class, args);
	}

	@Bean
	public CommandLineRunner loadData(ProductRepository repository) {
		return (args) -> {
			repository.save(new Product(null, "Gaming Laptop"));
			repository.save(new Product(null, "Wireless Mouse"));
		};
	}
}