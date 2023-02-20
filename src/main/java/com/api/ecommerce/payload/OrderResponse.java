package com.api.ecommerce.payload;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderResponse {
	private String orderTrackingNumber;
	private String status;
	private String message;
}
