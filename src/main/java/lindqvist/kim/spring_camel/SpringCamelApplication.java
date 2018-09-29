package lindqvist.kim.spring_camel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication

@ImportResource("classpath:blueprint.xml")
public class SpringCamelApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCamelApplication.class, args);
	}
}
