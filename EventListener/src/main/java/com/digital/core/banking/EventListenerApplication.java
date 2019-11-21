package com.digital.core.banking;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digital.core.banking.config.AppUtils;

@SpringBootApplication
@RestController
public class EventListenerApplication {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(EventListenerApplication.class);
		// app.setBannerMode(Banner.Mode.CONSOLE);
		app.run(args);
	}

	@RequestMapping("/")
	public ResponseEntity<String> index(HttpServletRequest request) {
		logger.info("Ip Address:" + request.getLocalAddr());
		AppUtils.printRequest(request);
		return ResponseEntity.status(HttpStatus.OK).body("Event Processing Service");

	}

}
