package dev.mohammad.mirzakhani.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AutowiringSpringBeansApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AutowiringSpringBeansApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Controller controller = new Controller();
		controller.login();
	}
}
