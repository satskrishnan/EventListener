package com.digital.core.banking.api;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.digital.core.banking.model.Events;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Events", description = "Receive the core banking events")
public interface EventApi {

	default EventApiDelegate getDelegate() {
		return new EventApiDelegate() {
		};
	}

	@Operation(summary = "Receive Events", tags = { "Events" })
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "successful operation") })
	@PostMapping(value = "/events", consumes = { "application/json" })
	default ResponseEntity<Void> receiveEvents(
			@Parameter(description = "Receive Core Banking Events", required = true) @Valid @RequestBody Events events) {
		return getDelegate().receiveEvent(events);
	}

}
