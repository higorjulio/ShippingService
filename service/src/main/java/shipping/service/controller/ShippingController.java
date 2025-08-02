package shipping.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import shipping.service.model.Order;
import shipping.service.repository.OrderRepository;

@RestController
@RequestMapping("/shipping")
public class ShippingController {
	@Autowired
	private OrderRepository orderRepository;
	
	@PostMapping("/orders")
	public Order createOrder(@RequestBody Order order) {
		return orderRepository.save(order);
	}
	
	@GetMapping("/orders")
	public List<Order> findOrders(){
		return orderRepository.findAll();
	}
}
