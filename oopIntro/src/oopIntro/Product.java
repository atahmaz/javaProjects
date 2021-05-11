package oopIntro;

public class Product {
	
	private int id;            //private yerine final yazarsan sadece constructor da set edilebilir demektir.
	private String name;       // private sadece bu class içerisinde kullanılabilir demek
	private double unitPrice;
	private String detail;
	private double discount;
	//private double unitPriceAfterDiscount; getter yazdığımız için buna gerek yok
	
	//constructor bloğu(yapıcı)
	// class'ı oluşturuken çalışmasını istediğin bir kod varsa buraya yazarsın.
	
	public Product() {
		
	}
	
	//overloading. birden fazla metot oluşturma. AYnı constructor bloğundan bir tane daha yapıyoz.
	public Product(int id, String name, double unitPrice, String detail,double discount) {
		this();   // bunu yazarsan ben çalıştım imzasını çalıştırır. Çünkü parametresiz.
		this.id=id;
		this.name=name;
		this.unitPrice= unitPrice;
		this.detail=detail;
		this.discount=discount;
		//this.unitPriceAfterDiscount=unitPriceAfterDiscount; getter yazdığımız için buna da gerek yok
		//parantez içinde tanımladığımız ifadeleri aşağıdakilere tanımlara eşitlemek için this yazayırz.
		// birden fazla constructor varsa sadece biri bu yapıda çalışır.
	}
	
	
	//encapsulation
	//getter sadece read
	//setter sadece write	
	//constructor oluştururken okunabilir veya yazılabilir seçneği için sağ tık-source-generate getetr setter diyebilirsin
	//cons. oluşturmak için sağ tık-source-generate field and cons.
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getUnitPriceAfterDiscount() {
		return this.unitPrice-(this.unitPrice * this.discount/100);
	}
	
	
	

}
