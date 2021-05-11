package oopIntro;
// önceden tanımladığımız product ve category class!ları özellik tutan classlardı.
// bir kod bloğunu birden fazla yerde çalıştıracaksan kendini tekrar etmemek için metot classları oluşturursun.
// yani kod satırlarını paketlersin ve kullanacağın yerlerde o paketi çağırırsın. 
// ProductManager kod bloğu classına bir örnek

public class ProductManager {
	public void addToCart (Product product) {   //burada kodun hangi dataya ihtiyacı olduğu yazılır parantez içine. Sepete ne ekleneceği gibi.
		System.out.println("Sepete eklendi : "  + product.getName());
	}
	
	}
