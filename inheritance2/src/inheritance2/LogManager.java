package inheritance2;

public class LogManager {
	public void log(int logType) {
		if (logType==1) {
			System.out.println("Veritabanına loglandı.");
		} else if (logType==2) {
			System.out.println("Dosyaya loglandı.");
		} else {
			System.out.println("Email gönderildi.");
		}
		
	}

} // böyle bir yapıda bir gün gelip de veritabanına log yazmıyoruz dediklerinde bütün kodu değiştirmek zoerunda kalırsın


//1 - Database
//2 - File
//3 - Email