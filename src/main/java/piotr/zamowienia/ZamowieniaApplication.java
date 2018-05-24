package piotr.zamowienia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("piotr.zamowienia")
public class ZamowieniaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZamowieniaApplication.class, args);
	}
}
