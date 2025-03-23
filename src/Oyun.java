import java.util.Scanner;

public class Oyun {
       static int hasar;
       static int sağlık;
       static int para;
       static String karakter="";
       static int samurayozel;
       static int sniperozel;
       static int şovalyeozel;
       public static int deneme;
       Envanter envanter=new Envanter();
       int ekstrahasar=envanter.yenihasar();
       
       
      public  void karakter() {
    	  Scanner scan = new Scanner(System.in);
    	  String karakterler="\n1)Samuray\n2)Sniper\n3)Şovalye";
    	  System.out.println("Karakterinizi seçiniz"+karakterler);
    	  int secim= scan.nextInt();
    	   
    	  switch (secim) {
    
		case 1: {
			hasar=7;
			sağlık=15;
			para=15;
			karakter="Samuray";
			samurayozel=0;
			samurayozel++;
			break;
		}
		case 2 :{
			hasar=10;
			sağlık=10;
			para=15;
			karakter="Sniper";
			sniperozel=0;
			sniperozel++;
			break;
		}
		case 3: {
			hasar=5;
			sağlık=20;
			para=15;
			karakter="Şovalye";
			şovalyeozel=0;
			şovalyeozel++;
			break;
		}
    	  
		default:
			System.out.println("Lütfen 1 ila 3 arasında bir sayı seçiniz");
			break;
		}
    	  
      }
      public  void goster(String ad) {
    	  System.out.println("Karakter isminiz: "+ad +" Karakteriniz "+karakter+"\nKarakterinizin özellikleri\nHasar: "+hasar +"\nSağlık: "+sağlık+"\nPara: "+para);
      }
      public int hasarbilgisi() {
    	  return (hasar);
    	  
      }
      public int sağlıkbilgisi() {
    	  return sağlık;  
      }
      public String karakterbilgisi() {
    	  return karakter;
      }
      public int parabilgisi() {
    	  return para;
	}
      public int samuraybilgisi() {
    	  return samurayozel;
	}
      public int sniperbilgisi() {
    	  return sniperozel;
	}
      public int şovalyebilgisi() {
    	  return şovalyeozel;
	}
}
