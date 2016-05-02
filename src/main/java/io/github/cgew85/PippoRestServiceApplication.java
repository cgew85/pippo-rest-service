package io.github.cgew85;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ro.pippo.core.Pippo;

@SpringBootApplication
public class PippoRestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PippoRestServiceApplication.class, args);
		Pippo pippo = new Pippo(new PippoApplication());
        pippo.start();
	}
}
