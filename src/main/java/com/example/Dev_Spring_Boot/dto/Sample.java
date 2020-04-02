package com.example.Dev_Spring_Boot.dto;



import lombok.Data;

@Data
public class Sample {

private int order_id;
private String cust_name;
public int getOrder_id() {
	return order_id;
}
public void setOrder_id(int order_id) {
	this.order_id = order_id;
}
public String getCust_name() {
	return cust_name;
}
public void setCust_name(String cust_name) {
	this.cust_name = cust_name;
}


}
