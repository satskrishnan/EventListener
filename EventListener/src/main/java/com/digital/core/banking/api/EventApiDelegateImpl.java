package com.digital.core.banking.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.digital.core.banking.model.Events;

@Service
public class EventApiDelegateImpl implements EventApiDelegate {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public ResponseEntity<Void> receiveEvent(Events event) {
		logger.debug("Receive Core Banking Events: \n {}", event.toString());
		return ResponseEntity.ok().build();
	}

}