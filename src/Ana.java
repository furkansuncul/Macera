import java.util.Scanner;

public class Ana {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Karakterinizin adını giriniz");
		String isim = scan.nextLine();
		Oyun oyun=new Oyun();
		oyun.karakter();
		oyun.goster(isim);
		Harita harita=new Harita();
		harita.harita();
	}

}
