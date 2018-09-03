package be.bt.domain;

import java.math.BigDecimal;

public class Produit {
private String productId;
private String name;
private BigDecimal uniPrice;

public Produit() {

}
public Produit(String productId, String name, BigDecimal uniPrice) {
	super();
	this.productId = productId;
	this.name = name;
	this.uniPrice = uniPrice;
}
public String getProductId() {
	return productId;
}
public void setProductId(String productId) {
	this.productId = productId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public BigDecimal getUniPrice() {
	return uniPrice;
}
public void setUniPrice(BigDecimal uniPrice) {
	this.uniPrice = uniPrice;
}
@Override
public String toString() {
	return "Produit [productId=" + productId + ", name=" + name + ", uniPrice=" + uniPrice + "]";
}

}
