package zk.tinyUrl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
public class TinyUrlApplication {

	public static void main(String[] args) {

		System.setProperty("server.port", "80");
		SpringApplication.run(TinyUrlApplication.class, args);
	}

}
