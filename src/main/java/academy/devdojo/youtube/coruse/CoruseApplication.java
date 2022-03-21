package academy.devdojo.youtube.coruse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.sql.init.SqlInitializationAutoConfiguration;

@SpringBootApplication(exclude = SqlInitializationAutoConfiguration.class)
public class CoruseApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoruseApplication.class, args);
	}

}
