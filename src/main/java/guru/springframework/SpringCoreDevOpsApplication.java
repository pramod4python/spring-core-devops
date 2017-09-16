package guru.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCoreDevOpsApplication {

	public static void main(String[] args) {
		System.out.println("Starting the Spring Boot Application..");
		SpringApplication.run(SpringCoreDevOpsApplication.class, args);

		//Pramod Test CI build- Jenkins
		//Test webhook
		//Test local Jenkins build again..
	}
}
