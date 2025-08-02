package model;

import java.math.BigDecimal;

public class Order {
	private Long id;
	private BigDecimal total;
	private double distance;
	
	public Order() {}
	
	public Order(Long id, BigDecimal total, double distance) {
		this.id = id;
		this.total = total;
		this.distance = distance;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}
	
	
}
