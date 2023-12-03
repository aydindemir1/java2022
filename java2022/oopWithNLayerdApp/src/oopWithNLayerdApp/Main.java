package oopWithNLayerdApp;

import java.util.List;

import oopWithNLayerdApp.business.ProductManager;
import oopWithNLayerdApp.core.logging.DatabaseLogger;
import oopWithNLayerdApp.core.logging.FileLogger;
import oopWithNLayerdApp.core.logging.Logger;
import oopWithNLayerdApp.core.logging.MailLogger;
import oopWithNLayerdApp.dataAccess.HibernatePorductDao;
import oopWithNLayerdApp.dataAccess.JdbcProductDao;
import oopWithNLayerdApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1 = new Product(1, "iphone xr", 9000);
		
		Logger[] loggers = {};
		
		ProductManager productManager = new ProductManager(new HibernatePorductDao(), loggers);
		productManager.add(product1);
		

	}

}
