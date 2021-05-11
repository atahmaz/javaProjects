package intro;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		//her satır sonuna ; koy. İki satırdan oluşuyorsa ikinci satırın sonuna ; koyarsın.
		//camelCase ilk harf küçük sonraki harfler büyük demek
		
		String internetSubeButonu = "İnternet Şubesi";
		
		
		//int dolarDun=8.15;
		//integer sadece tam sayı atayabilirsin
		
		double dolarDun = 8.20;
		double dolarBugun = 8.20;
		//ondalıklı sayıları double ile tanımlayabilirsin
		
		int vade =36; //int yerine byte da kullanabilirsin ama artık önemli değil.
		//Daha büyük sayılar için de long kullanabilirsin.
		
		boolean dustuMu = true;
		//boleean değeri true yada false olabilir.
		
		System.out.println(internetSubeButonu);
		
		if (dolarBugun<dolarDun) { 
			System.out.println("Dolar düştü resmi");
			}else if (dolarBugun>dolarDun) {               //eğer birden fazla şartın varsa else if kullanılırsın.
			System.out.println("Dolar yükseldi resmi");	
			}
		
		else {
			System.out.println("Dolar eşittir resmi");
			}

	//1.yöntem
		//String kredi1 = "Hızlı Kredi";                   
		//String kredi2 = "Mutlu Emekli Kredisi";
		//String kredi3 = "Konut Kredisi";
		//String kredi4 = "Çiftçi Kredisi";
		//String kredi5 = "Msb Kredisi";
		
		//System.out.println(kredi1);
		//System.out.println(kredi2);
		//System.out.println(kredi3);
		//System.out.println(kredi4);
		//System.out.println(kredi5); bütün bunlar yerine aşağıdakini yap!
		
	//2.yöntem
		String[] krediler =                   //stringin yanına [ kullanırsan bir veri dizisi tanımlayacaksın demektir.
			{		"Hızlı Kredi",
					"Mutlu Emekli Kredisi",
					"Konut Kredisi",
					"Çiftçi Kredisi",
					"Msb Kredisi",
					"Meb Kredisi"
					}; 
	//3.yöntem
		//foreach
		for(String kredi :krediler) {                                    //döngüler belirli işleri belirttiğin kadar çalıştır demektir.
			//(String kredi :krediler bu satır =benim elimde bir dizi var o dizideki bütün satırları tek tel dolaş demek.
			System.out.println(kredi);    
		}
		
		
		for(int i = 0; i<krediler.length;i++) {   // ilk noktalı virgüle olan kısm=start. ikinci noktalı=şart kalanı=arttırma şekli i++:i=+1
			System.out.println(krediler[i]);    
		}
		
	int sayi1 = 10;      //sayı1=20 oldu. sonra sayı2=100 dese bile sayı1 ile bağlantısı olmadığı için sayı1=20 kalır.
	int sayi2 = 20;
	sayi1 = sayi2;
	sayi2 = 100;
	System.out.println(sayi1);  	
	
	int[] sayilar1 = {1,2,3,4,5};        //sayılar1 dizisi artık sayılar2 dizisine sahip oldu. 
	int[] sayilar2 = {10,20,30,40,50};        //sayılar1 dizisi kullanılmıyorsa javanın gc(garbic collector) gelip o dizisi bellekten siler.
	sayilar1 = sayilar2;
	sayilar2[0] = 100;
	System.out.println(sayilar1[0]);  
	

	String sehir1="Ankara";          //stringlerde istisnai bir durum var. String referans tip olsa bile değer tip gibi çalışıyor.
	String sehir2="İstanbul";
	sehir1=sehir2;
	sehir2="İzmir";
	System.out.println(sehir1);  


		
	}

}
