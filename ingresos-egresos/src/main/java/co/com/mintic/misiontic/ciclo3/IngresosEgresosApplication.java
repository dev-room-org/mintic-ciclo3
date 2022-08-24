package co.com.mintic.misiontic.ciclo3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication (exclude ={SecurityAutoConfiguration.class})
public class IngresosEgresosApplication {


	public static void main(String[] args) {
		SpringApplication.run(IngresosEgresosApplication.class, args);
	}

}
