package DBO.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan({"services"})
@ComponentScan(basePackageClasses=ClientsController.class)
@EntityScan("entities")
@EnableJpaRepositories("repositories")
public class RunApp {
	public static void main(String[] args) {
		SpringApplication.run(RunApp.class, args);

	}

}