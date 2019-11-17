package com.digital.core.banking.api;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class UserApiController implements UserApi {

	private final UserApiDelegate delegate;

	public UserApiController(
			@org.springframework.beans.factory.annotation.Autowired(required = false) UserApiDelegate delegate) {
		this.delegate = Optional.ofNullable(delegate).orElse(new UserApiDelegate() {
		});
	}

	@Override
	public UserApiDelegate getDelegate() {
		return delegate;
	}

}
