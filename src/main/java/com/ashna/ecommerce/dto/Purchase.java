package com.ashna.ecommerce.dto;

import com.ashna.ecommerce.entity.Address;
import com.ashna.ecommerce.entity.Customer;
import com.ashna.ecommerce.entity.Order;
import com.ashna.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {
    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItem;

    public Order getOrder() {
        return getOrder();
    }

    public Set<OrderItem> getOrderItems() {
        return getOrderItems();
    }

    public Object getBillingAdrress() {
        return billingAddress;
    }

    public Object getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
