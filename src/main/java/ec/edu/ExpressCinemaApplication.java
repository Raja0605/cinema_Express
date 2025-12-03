package ec.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ExpressCinemaApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ExpressCinemaApplication.class, args);
		System.out.println("ADC = " + System.getenv("GOOGLE_APPLICATION_CREDENTIALS"));
	}

}
