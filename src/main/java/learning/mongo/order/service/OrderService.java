package learning.mongo.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import learning.mongo.order.dto.OrderDto;
import learning.mongo.order.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	public OrderDto findOrderById(String orderId){
		return repository.findOrderById(orderId);
	}
}
