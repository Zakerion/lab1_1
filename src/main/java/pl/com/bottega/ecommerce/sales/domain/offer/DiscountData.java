package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;

public class DiscountData {
	public String discountCause;
	public BigDecimal discount;

	public DiscountData(String discountCause, BigDecimal discount) {
		this.discountCause = discountCause;
		this.discount = discount;
	}
}