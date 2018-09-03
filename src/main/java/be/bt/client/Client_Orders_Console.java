package be.bt.client;

import java.math.BigDecimal;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import be.bt.business.IOrdersbusiness;
import be.bt.domain.Order;
import be.bt.domain.Produit;

public class Client_Orders_Console {
	private IOrdersbusiness business;
	
	
	
	public IOrdersbusiness getBusiness() {
		return business;
	}



	public void setBusiness(IOrdersbusiness business) {
		this.business = business;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 try(ConfigurableApplicationContext context= new ClassPathXmlApplicationContext("bean.xml")){
			// récupérer l'object à partir du conteneur
			 Client_Orders_Console client=context.getBean("client",Client_Orders_Console.class);
	       	Order order=context.getBean("order1",Order.class);
	       	BigDecimal total=client.getBusiness().computeTotalPrice("order1");
	       	
	       System.out.println("Got order from Spring factory  "+total);
		 }
			
	}

}
