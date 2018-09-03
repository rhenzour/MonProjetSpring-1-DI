package be.bt.business;

import java.math.BigDecimal;

import be.bt.Repository.IOrderRepository;
import be.bt.domain.Order;

public class OrderBusinessImpl implements IOrdersbusiness{
private IOrderRepository repo;


public IOrderRepository getRepo() {
	return repo;
}


public void setRepo(IOrderRepository repo) {
	this.repo = repo;
}


@Override
public BigDecimal computeTotalPrice(String id) {
	// TODO Auto-generated method stub
Order order= repo.findById(id);
return order.getProducts().stream().map(p->p.getUniPrice()).reduce(BigDecimal.ZERO, BigDecimal::add);
}
}
