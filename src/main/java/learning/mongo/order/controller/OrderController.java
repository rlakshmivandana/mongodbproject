package learning.mongo.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import learning.mongo.order.dto.OrderDto;
import learning.mongo.order.service.OrderService;

@RestController(value="/orders")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@GetMapping(value="/{orderId}")
	public OrderDto findOrderById(@PathVariable String orderId){
		return orderService.findOrderById(orderId);
	}

}
