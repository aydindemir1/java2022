package oopWithNLayerdApp.dataAccess;

import oopWithNLayerdApp.entities.Product;

public class HibernatePorductDao implements ProductDao {
	  public void add(Product product) {
		   // sadece ve sadece db erişim kodları buraya yazılır.. Sql
		   System.out.println("Hibernate ile veritabanına eklendi.");
	   }
}
