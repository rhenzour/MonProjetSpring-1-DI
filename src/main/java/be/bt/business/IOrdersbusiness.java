package be.bt.business;

import java.math.BigDecimal;

public interface IOrdersbusiness {
	// retourner le montant total de la commande 
	
BigDecimal computeTotalPrice(String id);
}
