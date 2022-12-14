package de.szut.customer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerManagementApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerManagementApplication.class);

	public static void main(String[] args) {
        LOGGER.info("Hello customer-management-service");

		SpringApplication.run(CustomerManagementApplication.class, args);
	}

}
