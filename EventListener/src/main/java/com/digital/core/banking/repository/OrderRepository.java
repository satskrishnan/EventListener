package com.digital.core.banking.repository;

import org.springframework.stereotype.Repository;

import com.digital.core.banking.model.Order;

@Repository
public class OrderRepository extends HashMapRepository<Order, Long> {

	@Override
	<S extends Order> Long getEntityId(S order) {
		return order.getId();
	}
}
