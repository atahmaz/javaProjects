package inheritance2;

public class EmailLogger extends Logger {
		@Override //kendi email logumu yazabilmek için basedeki(loggerdaki) logu ezecem demek. Kodu okuyan kişi için yazılabilir.
		public void log() {
		System.out.println("Email yollandı.");
	}

}
