package com.springinaction.pizza.domain;

import org.springframework.beans.factory.annotation.Configurable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Configurable("order")
public class Order implements Serializable {
   private static final long serialVersionUID = 1L;
   private Customer customer;  //顾客
   private List<Pizza> pizzas; //披萨
   private Payment payment;  //付款

   public Order() {
      pizzas = new ArrayList<Pizza>();  //list列表形式 添加多个披萨
      customer = new Customer();        //创建一个顾客
   }

   public Customer getCustomer() {
      return customer;
   }

   public void setCustomer(Customer customer) {
      this.customer = customer;
   }

   public List<Pizza> getPizzas() {
      return pizzas;
   }

   public void setPizzas(List<Pizza> pizzas) {
      this.pizzas = pizzas;
   }

   public void addPizza(Pizza pizza) {
      pizzas.add(pizza);
   }

   public float getTotal() {
      return 0.0f;//pricingEngine.calculateOrderTotal(this);
   }

   public Payment getPayment() {
      return payment;
   }

   public void setPayment(Payment payment) {
      this.payment = payment;
   }

//   // injected
//   private PricingEngine pricingEngine;
//   public void setPricingEngine(PricingEngine pricingEngine) {
//      this.pricingEngine = pricingEngine;
//   }
}
