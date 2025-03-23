import java.util.Scanner;


public class Envanter {
	static Oyun  oyun=new Oyun();
	static int Anahasar=oyun.hasarbilgisi();
	  static int Anasağlık=oyun.sağlıkbilgisi();
	  static int Anapara=oyun.parabilgisi();
	  static int sonhasar;
	  static int sonpara;
	  static int sonsağlık;
	  static int şimdisağlık;
	Scanner scan=new Scanner(System.in);
		
	public void silah(int para, int hasar) {
		boolean kac=true;
		System.out.println("Silah dükkanına hoşgeldiniz dükkanımızda bulunan eşyalar: "+"paranız: "+para);
		String silahlar="1) Sopa  >>>+3 HASAR  FİYAT: 20"
				+ "\n2) Kalas  >>>> +6 HASAR  FİYAT: 35"
				+ "\n3) Hançer >>>>> +9 HASAR   FİYAT: 50"
				+ "\n4) Kılıç  >>>>> +12 HASAR  FİYAT: 75"
				+ "\n5) ÇIKIŞ YAPMAK İÇİN 5 e basınız";
		System.out.println(silahlar);
		System.out.println("Satın almak istediğinizi seçin");
		while(kac) {
		int sec = scan.nextInt();
		switch (sec) {
		case 1: {
			if(para>=20) {
			System.out.println("Sopa satın aldınız hasarınız 3 arttı hala dükkandasınız çıkış yapmak için 5 e basın");
			hasar+=3;
			para-=20;
			System.out.println("Yeni hasarınız"+hasar+"Yeni paranız"+para);
			sonhasar=hasar;
			sonpara=para;
			break;
			}
			else {
				System.out.println("Paranız sopa almaya yetmiyor");
				break;
			}
		}
		case 2:{
			if(para>=35) {
				System.out.println("Kalas satın aldınız hasarınız 6 arttı  hala dükkandasınız çıkış yapmak için 5 e basın ");
				hasar+=6;
				para-=35;
				System.out.println("Yeni hasarınız: "+hasar+"Yeni paranız: "+para);
				sonhasar=hasar;
				sonpara=para;
				break;
			}
			else {
				System.out.println("Paranız Kalas almaya yetmiyor");
				sonhasar=hasar;
				sonpara=para;
				break;
			}
		}
		case 3:{
			if(para>=50) {
				System.out.println("Hançer satın aldınız hasarınız 9 arttı hala dükkandasınız çıkış yapmak için 5 e basın ");
				hasar+=9;
				para-=50;
				System.out.println("Yeni hasarınız"+hasar+"Yeni paranız"+para);
				sonhasar=hasar;
				sonpara=para;
				break;
			}
			else {
				System.out.println("Paranız Hançer almaya yetmiyor");
				sonhasar=hasar;
				sonpara=para;
				break;
			}
			
		}
		case 4:{
			if(para>=75) {
				System.out.println("Kılıç satın aldınız hasarınız 12 arttı hala dükkandasınız çıkış yapmak için 5 e basın ");
				hasar+=12;
				para-=75;
				System.out.println("Yeni hasarınız"+hasar+"Yeni paranız"+para);
				sonhasar=hasar;
				sonpara=para;
				break;
			}
			else {
				System.out.println("Paranız Kılıç almaya yetmiyor");
				sonhasar=hasar;
				sonpara=para;
			break;
			}
			
		}
		case 5:{
			System.out.println("Çıkış yaptınız");
			kac=false;
			sonhasar=hasar;
			sonpara=para;
			break;
		}
		default:{System.out.println("Lütfen yalnızca belirtilen aralıkta tuşlayınız");
		sonhasar=hasar;
		sonpara=para;
		}
		}
		}	
				
	}
	public void zırh(int para, int Anasağlık) {
		boolean kac=true;
		System.out.println("Silah dükkanına hoşgeldiniz dükkanımızda bulunan eşyalar:  paranız: "+para);
		String zırhlar="1) Yün giysi  >>>+5 SAĞLIK  FİYAT: 20"
				+ "\n2) Demir giysi  >>>> +10 SAĞLIK  FİYAT: 35"
				+ "\n3) Altın giysi >>>>> +15 SAĞLIK   FİYAT: 50"
				+ "\n4) Elmas Giysi  >>>>> +20 SAĞLIK  FİYAT: 75"
				+ "\n5) ÇIKIŞ YAPMAK İÇİN 5 e basınız";
		System.out.println(zırhlar);
		System.out.println("Satın almak istediğinizi seçin");
		while(kac) {
		int sec = scan.nextInt();
		switch (sec) {
		case 1: {
			if(para>=20) {
			System.out.println("Yün giysi satın aldınız sağlığınız 5 arttı hala dükkandasınız çıkış yapmak için 5 e basın ");
			Anasağlık+=5;
			para-=20;
			System.out.println("Yeni Toplam sağlığınız"+Anasağlık+"Yeni paranız"+para);
			sonsağlık=Anasağlık;
			sonpara=para;
			break;
			}
			else {
				System.out.println("Paranız Yün giysi almaya yetmiyor");
				sonsağlık=Anasağlık;
				sonpara=para;
				break;
			}
		}
		case 2:{
			if(para>=35) {
				System.out.println("Demir giysi satın aldınız sağlığınız 10 arttı hala dükkandasınız çıkış yapmak için 5 e basın ");
				Anasağlık+=10;
				para-=35;
				System.out.println("Yeni Toplam sağlığınız: "+Anasağlık+"Yeni paranız: "+para);
				sonsağlık=Anasağlık;
				sonpara=para;
				break;
			}
			else {
				System.out.println("Paranız Demir giysi almaya yetmiyor");
				sonsağlık=Anasağlık;
				sonpara=para;
				break;
			}
		}
		case 3:{
			if(para>=50) {
				System.out.println("Altın giysi satın aldınız sağlığınız 15 arttı hala dükkandasınız çıkış yapmak için 5 e basın ");
				Anasağlık+=15;
				para-=50;
				System.out.println("Yeni hasarınız"+Anasağlık+"Yeni paranız"+para);
				sonsağlık=Anasağlık;
				sonpara=para;
				break;
			}
			else {
				System.out.println("Paranız Altın giysi almaya yetmiyor");
				sonsağlık=Anasağlık;
				sonpara=para;
				break;
			}
			
		}
		case 4:{
			if(para>=75) {
				System.out.println("Elmas giysi satın aldınız sağlığınız 20 arttı hala dükkandasınız çıkış yapmak için 5 e basın ");
				Anasağlık+=20;
				para-=75;
				System.out.println("Yeni hasarınız"+Anasağlık+"Yeni paranız"+para);
				sonsağlık=Anasağlık;
				sonpara=para;
				break;
			}
			else {
				System.out.println("Paranız Elmas giysi almaya yetmiyor");
				sonsağlık=Anasağlık;
				sonpara=para;
			break;
			}
			
		}
		case 5:{
			System.out.println("Çıkış yaptınız");
			kac=false;
			sonsağlık=Anasağlık;
			sonpara=para;
			break;
		}
		default:{System.out.println("Lütfen yalnızca belirtilen aralıkta tuşlayınız");
		sonsağlık=Anasağlık;
		sonpara=para;
		}
		}
		}
	}
	public void iksir(int para,int sağlık,int Anasağlık) {
		System.out.println("İksir canınızı doldurur fiyatı 10 Altın almak istiyor musun"
				+ "\n1) EVET"
				+ "\n2) HAYIR"+" \nparanız: "+para);
		int sec=scan.nextInt();
		switch (sec) {
		case 1: {
			if(para>=10) {
				sağlık=Anasağlık;
				şimdisağlık=sağlık;
				para-=10;
				sonpara=para;
				System.out.println("Sağlığınız yenilendi şuan ki sağlığınız: "+sağlık+" Kalan paranız: "+para);
				break;
			}
			else {
				System.out.println("Yeterli paranız yok");
				break;
			}
			
		}
		case 2:{
			System.out.println("İksir mağazasından çıktınız:");
			sağlık=Anasağlık;
			şimdisağlık=sağlık;
			para-=0;
			sonpara=para;
			break;
		}
		default:
			System.out.println("Lütfen belirtilen aralıkta değer yazınız");
			sağlık=Anasağlık;
			şimdisağlık=sağlık;
			para-=0;
			sonpara=para;
		}
	}
	public int yenihasar() {
		return sonhasar;
	}
	public int yenipara() {
		return sonpara;
	}
	public int yenisağlık() {
		return sonsağlık;
	}
	public int anlıksağlık() {
		return şimdisağlık;
	}
	
	
}
