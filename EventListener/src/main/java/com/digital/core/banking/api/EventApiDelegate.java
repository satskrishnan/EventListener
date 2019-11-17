package com.digital.core.banking.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.digital.core.banking.model.Events;

/**
 * A delegate to be called by the {@link EventController}}. Implement this
 * interface with a {@link org.springframework.stereotype.Service} annotated
 * class.
 */
public interface EventApiDelegate {

	/**
	 * @see UserApi#createUser
	 */
	default ResponseEntity<Void> receiveEvent(Events events) {
		return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

	}

}
