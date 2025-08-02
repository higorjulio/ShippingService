package shipping.service.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import shipping.service.model.Order;

@Repository
public class OrderRepository {
	private final Map<Long, Order> store = new HashMap<>();
	private long nextId = 1L;
	
	public synchronized Order save(Order order) {
		if(order.getId().equals(null)) {
			order.setId(nextId++);
		}
		store.put(order.getId(), order);
		return order;
	}
	public List<Order> findAll(){
		return new ArrayList<>(store.values());
	}
	public Order findById(Long id) {
		if(store.get(id).equals(null)) {
			System.out.println("Enter a valid id!");
		}
		return store.get(id);
	}
}
