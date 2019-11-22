package com.digital.core.banking.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

public class Event {

	@Schema(description = "")
	private String eventId = null;

	@Schema(description = "")
	private String eventData = null;

	@Schema(description = "")
	private String eventName = null;

	/**
	 * Get eventId
	 * 
	 * @return eventId
	 **/
	@JsonProperty("eventId")
	public String geteventId() {
		return eventId;
	}

	public void seteventId(String eventId) {
		this.eventId = eventId;
	}

	public Event eventId(String eventId) {
		this.eventId = eventId;
		return this;
	}

	/**
	 * Get eventData
	 * 
	 * @return eventData
	 **/
	@JsonProperty("eventData")
	public String getEventData() {
		return eventData;
	}

	public void setEventData(String eventData) {
		this.eventData = eventData;
	}

	public Event eventData(String eventData) {
		this.eventData = eventData;
		return this;
	}

	/**
	 * Get eventName
	 * 
	 * @return eventName
	 **/
	@JsonProperty("eventName")
	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public Event eventName(String eventName) {
		this.eventName = eventName;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(" {");
		sb.append("    eventId: ").append(toIndentedString(eventId)).append(",");
		sb.append("    eventName: ").append(toIndentedString(eventName)).append(",");
		sb.append("    eventData: ").append(toIndentedString(eventData)).append(",");
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
