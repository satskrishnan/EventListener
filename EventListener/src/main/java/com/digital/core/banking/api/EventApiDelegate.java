package com.digital.core.banking.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.digital.core.banking.model.Event;
import com.digital.core.banking.model.EventResponse;

/**
 * A delegate to be called by the {@link EventApiController}}. Implement this
 * interface with a {@link org.springframework.stereotype.Service} annotated
 * class.
 */
public interface EventApiDelegate {

	/**
	 * @see UserApi#createUser
	 */
	default ResponseEntity<EventResponse> receiveEvent(Event events) {
		return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

	}

}
