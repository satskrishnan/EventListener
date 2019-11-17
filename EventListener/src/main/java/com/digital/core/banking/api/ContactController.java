package com.digital.core.banking.api;

import java.net.URISyntaxException;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digital.core.banking.model.Contact;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api")
@Tag(name = "contact", description = "the Contact API")
public class ContactController {

	@Operation(summary = "Find contact by ID", description = "Returns a single contact", tags = { "contact" })
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = Contact.class))),
			@ApiResponse(responseCode = "404", description = "Contact not found") })
	@GetMapping(value = "/contacts/{contactId}", produces = { "application/json", "application/xml" })
	public ResponseEntity<Contact> findContactById(
			@Parameter(description = "Id of the contact to be obtained. Cannot be empty.", required = true) @PathVariable long contactId) {

		return new ResponseEntity<Contact>(null);
	}

	@Operation(summary = "Add a new contact", description = "", tags = { "contact" })
	@ApiResponses(value = {
			@ApiResponse(responseCode = "201", description = "Contact created", content = @Content(schema = @Schema(implementation = Contact.class))),
			@ApiResponse(responseCode = "400", description = "Invalid input"),
			@ApiResponse(responseCode = "409", description = "Contact already exists") })
	@PostMapping(value = "/contacts", consumes = { "application/json", "application/xml" })
	public ResponseEntity<Contact> addContact(
			@Parameter(description = "Contact to add. Cannot null or empty.", required = true, schema = @Schema(implementation = Contact.class)) @Valid @RequestBody Contact contact)
			throws URISyntaxException {

		return new ResponseEntity<Contact>(null);
	}

}
