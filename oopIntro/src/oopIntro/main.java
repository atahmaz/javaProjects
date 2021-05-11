package oopIntro;

import java.util.Iterator;

public class main {

	public static void main(String[] args) {
		
		//Artık string vs. veri tipi kullanmamıza gerek yok
		//Product class'ını oluştururken aslında product diye bir veri tipi oluşturduk.
		
		//Product product1 = new Product (); //örnek oluşturma, referans oluşturma, instance oluşturma		
		//product1.id=1;
		//product1.name="Lenovo v14";
		//product1.unitPrice=15000;
		//product1.detail="16 GB Ram";
		
		//constructor bloğu oluşturduğumuz için üstteki ifadeyi aşağıdaki gibi de yazabiliriz artık.	
		Product product1 = new Product (1,"Lenovo V14",15000,"16 GB Ram",10);
		
		Product product2 = new Product (); //örnek oluşturma, referans oluşturma, instance oluşturma
		product2.setId(2);
		product2.setName("Lenovo V15");
		product2.setDetail("16 GB Ram");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		
		Product product3 = new Product (); 		//constructorlar bu parantez içine tanımlanıyor. boş bırakırsan default olur.
		
		
		Product [] products= {product1,product2,product3};
		
		
		 for (Product product : products) {
			 
			 System.out.println(product.getName());
			
		}
		
		System.out.println(products.length);
	
		//category veri tipini de tanımladık class olarak.
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Bilgisayar");
		
		Category category2 = new Category();
		//category2.id=2;   getter ve setter eklediğimiz için böyle yazamayız artık
		category2.setId(2);
		category2.setName("Ev/Bahçe");
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());
		
		
		
		ProductManager productManager= new ProductManager();
		productManager.addToCart(product1);     //metot bir dataya ihtiyaç duyuyorsa parantezin içine yazarız.Sepete ne ekleneceği gibi.
		productManager.addToCart(product2);
		productManager.addToCart(product3);  //aynı sayfada bile istdiğim kadar çağırabilirm
	
	}

}
