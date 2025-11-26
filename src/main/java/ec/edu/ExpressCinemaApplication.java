package ec.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExpressCinemaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpressCinemaApplication.class, args);
		System.out.println("ADC = " + System.getenv("GOOGLE_APPLICATION_CREDENTIALS"));
	}

}
