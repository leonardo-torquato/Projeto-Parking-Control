package com.api.parkingcontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


//classe raiz da aplicação
@SpringBootApplication
@RestController
public class ParkingControlApplication {
	public static void main(String[] args) {
		SpringApplication.run(ParkingControlApplication.class, args);

	}

}
