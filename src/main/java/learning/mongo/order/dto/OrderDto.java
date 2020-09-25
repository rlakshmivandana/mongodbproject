package learning.mongo.order.dto;

import java.util.List;


public class OrderDto {
	
	
	
	private String orderId;
	private double totalAmount;
	
	private List<ItemDto> items;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public List<ItemDto> getItems() {
		return items;
	}

	public void setItems(List<ItemDto> items) {
		this.items = items;
	}

	
	
	

}
