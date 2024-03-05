package br.com.gomes.bankservicegateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BankServiceGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankServiceGatewayApplication.class, args);
	}

}
