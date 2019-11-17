package com.digital.core.banking.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;

@Controller
@RequestMapping("/event}")
public class EventApiController implements EventApi {

	private final EventApiDelegate delegate;

	public EventApiController(
			@org.springframework.beans.factory.annotation.Autowired(required = false) EventApiDelegate delegate) {
		this.delegate = Optional.ofNullable(delegate).orElse(new EventApiDelegate() {
		});
	}

	@Override
	public EventApiDelegate getDelegate() {
		return delegate;
	}

}
