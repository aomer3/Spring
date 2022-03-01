package com.spring.m.interfaceInjection.xml;

public class OrderBOImpl implements OrderBO {

	private OrderDAO dao;

	@Override
	public void placeOrder() {
		System.out.println("Inside Order BO placeOrder()");
		dao.createOrer();

	}

	public OrderDAO getDao() {
		return dao;
	}

	public void setDao(OrderDAO dao) {
		this.dao = dao;
	}

}
