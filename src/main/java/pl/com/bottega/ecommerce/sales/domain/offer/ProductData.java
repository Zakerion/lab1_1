package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;
import java.util.Date;

public class ProductData {
	public String productId;
	public BigDecimal productPrice;
	public String productName;
	public Date productSnapshotDate;
	public String productType;

	public ProductData(String productId, BigDecimal productPrice, String productName, Date productSnapshotDate,
			String productType) {
		this.productId = productId;
		this.productPrice = productPrice;
		this.productName = productName;
		this.productSnapshotDate = productSnapshotDate;
		this.productType = productType;
	}
}