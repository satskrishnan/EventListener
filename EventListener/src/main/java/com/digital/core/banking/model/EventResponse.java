package com.digital.core.banking.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

public class EventResponse {

	@Schema(description = "")
	private String eventStatus = null;

	/**
	 * Get status
	 * 
	 * @return status
	 **/
	@JsonProperty("eventStatus")
	public String getEventStatus() {
		return eventStatus;
	}

	public void setEventStatus(String eventStatus) {
		this.eventStatus = eventStatus;
	}

	public EventResponse withEventStatus(String eventStatus) {
		this.eventStatus = eventStatus;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Published Event Status {\n");

		sb.append("    eventStatus: ").append(toIndentedString(eventStatus)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private static String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
