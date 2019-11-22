package com.digital.core.banking.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.digital.core.banking.model.Event;
import com.digital.core.banking.model.EventResponse;

@Service
public class EventApiDelegateImpl implements EventApiDelegate {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public ResponseEntity<EventResponse> receiveEvent(Event event) {
		logger.info("Received Core Banking Events: {}", event.toString());

		HttpHeaders headers = new HttpHeaders();
		headers.add(HttpHeaders.CONTENT_TYPE, "application/json; charset=UTF-8");

		EventResponse response = new EventResponse();
		response.setEventStatus("Event Published Successfully");
		return ResponseEntity.status(HttpStatus.OK).headers(headers).body(response);
	}

}