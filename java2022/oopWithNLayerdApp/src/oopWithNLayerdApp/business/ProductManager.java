package oopWithNLayerdApp.business;

import java.util.List;

import oopWithNLayerdApp.core.logging.Logger;
import oopWithNLayerdApp.dataAccess.HibernatePorductDao;
import oopWithNLayerdApp.dataAccess.JdbcProductDao;
import oopWithNLayerdApp.dataAccess.ProductDao;
import oopWithNLayerdApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	private Logger[] loggers;

	public ProductManager(ProductDao productDao, Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}

	public void add(Product product) throws Exception {
		// iş kuralları
		if (product.getUnitPrice() < 10) {
			throw new Exception("ürün fiyatı 10 dan küçük olamaz");
		}

		productDao.add(product);
		
		for (Logger logger : loggers) {
			logger.log(product.getName());
		}
	}
}
