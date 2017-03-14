package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;

public class Money {
	public BigDecimal totalCost;
	public String currency;

	public Money(BigDecimal totalCost, String currency) {
		this.totalCost = totalCost;
		this.currency = currency;
	}
}