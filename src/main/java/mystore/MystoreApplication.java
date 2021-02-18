package mystore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Charles Curi
 * Classe que starta a aplicação no tomcat embarcado do springboot
 */

@SpringBootApplication
public class MystoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(MystoreApplication.class, args);
	}

}
