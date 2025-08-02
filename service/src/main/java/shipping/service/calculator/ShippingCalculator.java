package shipping.service.calculator;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import shipping.service.model.Order;
@Service
public class ShippingCalculator {
	//TODO: create fast and cheap shipping
	
	public BigDecimal calculate(Order order) {
		return order.getTotal().multiply(BigDecimal.valueOf(0.20)).add(BigDecimal.valueOf((15)));
	}
}
