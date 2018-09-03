package be.bt.Repository;

import java.util.List;

import be.bt.domain.Order;

public interface IOrderRepository {
	//CRUD
	 void create(Order o);
	 Order findById(String id);
	 List<Order> findAll();
	 Order update (Order o);
	 void delete(String id);

}
