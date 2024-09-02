package kennyboateng.u5w1d1;

import ENTITIES.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U5d1Application {

	public static void main(String[] args) {
		SpringApplication.run(U5d1Application.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(U5d1Application.class);
		Menu menu = context.getBean(Menu.class);

		menu.stampaMenu();
		context.close();
	}

}