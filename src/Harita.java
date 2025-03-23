import java.util.Scanner;

public class Harita {
	static Oyun oyun = new Oyun();
	static Envanter envanter = new Envanter();
	static int Anahasar = oyun.hasarbilgisi();
	static int Anasağlık = oyun.sağlıkbilgisi();
	static int Anapara = oyun.parabilgisi();
	static int samurayozel = oyun.samuraybilgisi();
	static int sniperozel = oyun.sniperbilgisi();
	static int şovalyeozel = oyun.şovalyebilgisi();
	static String karakter = oyun.karakterbilgisi();
	int sağlık = Anasağlık;
	int hasar = Anahasar;
	int para = Anapara;
	int ozelsans = 0;
	int sovalyesans = 0;
	String düsman="";

	public void harita() {
		Scanner scan = new Scanner(System.in);
		String haritalar = "\n--------------------------------------------------------------------------"
				+ "\n 1)Yardım>>>>>>>>Karakterler ve Canavarlar hakkında detaylı bilgi "
				+ "\n 2)Restoran>>>>>>Zombiler var" + "\n 3)Orman>>>>>>>>>Vampirler var"
				+ "\n 4)Nehir>>>>>>>>>Ayılar var" + "\n 5)Dükkan>>>>>>>>Eşya satın alabilirsiniz"
				+ "\n 6)Tarayıcı>>>>>>Anlık özelliklerinizi gösterir"
				+ "\n--------------------------------------------------------------------------";
while (sağlık > 0) {
			System.out.println("Hangi haritaya gideceğinizi seçin" + haritalar);
			int sec = scan.nextInt();
			switch (sec) {
			case 1: {
				System.out.println("Samuray'ın özel yeteneği:Bazı turlar 2 defa üst üste vurabilir"
						+ "\nSniper'in özel yeteneği:Bazı turlar vurduğu hasarın 3 katını vurabilir veya 0 hasar verebilir"
						+ "\nŞovalye'nin özel yeteneği:Bazı turlar hiç hasar almaz"
						+ "\nZombi'nin yeteneği %30 şans ile öldükten sonra yeniden doğar"
						+ "\nVampir'in yeteneği Her tur vurduğu hasar kadar can yeniler"
						+ "\nAyı'nın yeteneği: Canı 20 nin altına düştükten sonra hasarı iki katına çıkar");
				break;
			}
			case 2: {
				System.out.println("Zombilerle karşılaştınız\nZombinin özellikleri: " + "\nHasar:3" + "\nSağlık:10"
						+ "\nZombi öldükten sonra %30 ihtimalle yeniden doğar");
				düsman="zombi";
				int zombihasar = 3;
				int zombisağlık = 10;
				boolean kac = true;
				while (sağlık > 0 && zombisağlık > 0 && kac) {
					System.out.println("Normal saldırmak için 1'e Şans vuruşu için 2'ye Kaçmak için 3'e basın");
					int tercih = scan.nextInt();
					switch (tercih) {
					case 1: {						
						zombisağlık=saldiri(zombisağlık);
						if (zombisağlık <= 0) {
							if (4 > (Math.random() * 10)) {
								System.out.println("Zombi tekrar dirildi");
								zombisağlık = 10;
							} else {
								para += 10;
								System.out.println(
										"Tebrikler zombiyi öldürdünüz 10 para kazandınız yeni paranız  " + para);
								System.out.println("Kalan sağlığınız" + sağlık);
								break;
							}
						}
						savunma(zombihasar);
						if (sağlık <= 0) {
							para = 0;
							System.out.println("Zombi sizi öldürdü tüm paranızı kaybettiniz");
							break;
						}
						break;
					}
					case 2:{
						if(samurayozel==1) {
							System.out.println("Samuray Odak vuruşuna hazırlanıyor\nBaşarılı olursa bu tur hasar yemeyecek"
									+ "\nBaşarısız olursa hasar vuramayacak ");
							System.out.println("1 ila 2 arasında bir sayı yazınız");
							int odak=scan.nextInt();
							if(odak==(int) (Math.random()*2)+1) {
								System.out.println("TEBRİKLER ODAK VURUŞU BAŞARILI");
								int Vurulanhasar=(int) (Math.random()*hasar);
								zombisağlık-=Vurulanhasar*2;
								System.out.println("Vurulan hasar: "+Vurulanhasar+ "X2 Zombinin kalan sağlığı: "+zombisağlık);
							}
							else {
								System.out.println("ODAK VURUŞU BAŞARISIZ hasar vuramadınız");
								int Alınanhasar=(int) (Math.random()*zombihasar);
								sağlık-=Alınanhasar;
								System.out.println("Zombinin hasarı: "+Alınanhasar+"Kalan sağlığınız "+sağlık);
							}
						}
						else if (sniperozel==1) {
							System.out.println("Sniper odak vuruşuna hazırlanıyor\nBaşarılı olursa bu tur 3 kat fazla hasar vuracak "
									+ "\n Başarısız olursa hasar");
							System.out.println("1 ila 3 arasında bir sayı yazınız");
							int odak=scan.nextInt();
							if(odak==(int) (Math.random()*3)+1) {
								System.out.println("TEBRİKLER ODAK VURUŞU BAŞARILI");
								int Vurulanhasar=(int) (Math.random()*hasar);
								zombisağlık-=Vurulanhasar*3;
								System.out.println("Vurulan hasar: "+Vurulanhasar+ "X3 Zombinin kalan sağlığı: "+zombisağlık);
						}
							else {
								System.out.println("ODAK VURUŞU BAŞARISIZ hasar vuramadınız");
								int Alınanhasar=(int) (Math.random()*zombihasar);
								sağlık-=Alınanhasar;
								System.out.println("Zombinin hasarı: "+Alınanhasar+"Kalan sağlığınız "+sağlık);
								
							}
					}
						else if(şovalyeozel==1) {
							System.out.println("Şovalye çift el saldırısına hazırlanıyor \nBaşarılı olursa zombi ölecek"
									+ "\nBaşarısız olursa hasar vuramayacak");
							System.out.println("1 ila 4 arasında bir sayı yazınız");
							int odak=scan.nextInt();
							if(odak==(int) (Math.random()*4)+1) {
								System.out.println("TEBRİKLER ÇİFT EL VURUŞ BAŞARILI");
								zombisağlık=0;
								System.out.println("ZOMBİYİ ÖLDÜRDÜNÜZ");
							}
						
							else {
								System.out.println("ODAK VURUŞU BAŞARISIZ hasar vuramadınız");
								int Alınanhasar=(int) (Math.random()*zombihasar);
								sağlık-=Alınanhasar;
								System.out.println("Zombinin hasarı: "+Alınanhasar+"Kalan sağlığınız "+sağlık);	
							}
							}
							if(zombisağlık<=0) {
								if(3>Math.random()*10) {
									System.out.println("Zombi tekrar dirildi");
									zombisağlık=10;
								}
								else {
								para+=10;
								System.out.println("Zombiyi öldürdünüz 10 para kazandınız yeni paranız "+para
										+" Kalan sağlığınız "+sağlık);
								break;
								}
							}
							else if(sağlık<=0) {
								System.out.println("Zombi sizi öldürdü kaybettiniz");
								break;
							}
							break;
						}
					
				
					
					case 3: {
						System.out.println("Kaçıyorsunuz kaçarken paranın yarısını düşürdün");
						para -= para / 2;
						System.out.println("Kalan sağlığınıız: " + sağlık);
						System.out.println("Yeni paran : " + para);
						kac = false;
						break;
					} 
					default:
						System.out.println("Lütfen yalnızca 1 2 veya 3 tuşlayın");
						break;
					}
				}
				break;
			}
			case 3: {
				düsman="vampir";
				int vampirhasar = 10;
				int vampirsağlık = 35;
				System.out.println("Vampirlerle karşılaştınız\nVampirin özellikleri: " + "\nHasar:10" + "\nSağlık:35"
						+ "\nVampir vurduğu hasar kadar can yeniler");
				boolean kac = true;
				while (sağlık > 0 && vampirsağlık > 0 && kac) {
					System.out.println("Saldırmak için 1 e Kaçmak için 2 ye basın");
					int tercih = scan.nextInt();
					switch (tercih) {
					case 1: {
						vampirsağlık=saldiri(vampirsağlık);
						if (vampirsağlık <= 0) {
							para += 20;
							System.out.println("Tebrikler Vampiri öldürdünüz 20 para kazandınız yeni paranız " + para);
							break;
						}
						savunma(vampirhasar);						
						if (sağlık <= 0) {
							para = 0;
							System.out.println("Vampir sizi öldürdü tüm paranızı kaybettiniz");
							break;
						}
						break;
					}				
			
					case 2: {
						System.out.println("Kaçıyorsunuz kaçarken paranın yarısını düşürdün");
						para -= para / 2;
						System.out.println("Kalan sağlığınıız: " + sağlık);
						System.out.println("Yeni paran : " + para);
						kac = false;
						break;
					}
					default:
						System.out.println("Lütfen yalnızca 1 veya 2 tuşlayın");
						break;
					}
				}
				break;
			}
			case 4: {
				düsman="Ayı";
				System.out.println("Ayılarla karşılaştınız\nAyıların özellikleri: " + "\nHasar:15" + "\nSağlık:50"
						+ "\nAyı 20 canın altına düştüğünde Hasarı ikiye katlanır ");
				int ayıhasar = 15;
				int ayısağlık = 50;
				boolean kac = true;
				int ayıcount = 0;
				while (sağlık > 0 && ayısağlık > 0 && kac) {
					System.out.println("Saldırmak için 1 e Kaçmak için 2 ye basın");
					int tercih = scan.nextInt();
					switch (tercih) {
					case 1: {
						ayısağlık=saldiri(ayısağlık);
						if (ayısağlık < 20 && ayıcount == 0) {
							System.out.println("Ayı hayatta kalma içgüdüsüne girdi ve hasarı iki katına çıktı");
							ayıhasar += 15;
							System.out.println("Yeni ayıhasarı " + ayıhasar);
							ayıcount++;
						}
						if (ayısağlık <= 0) {
							para += 30;
							System.out.println("Tebrikler Ayı öldürdünüz 30 para kazandınız yeni paranız " + para);
							break;
						}
						savunma(ayıhasar);
						if (sağlık <= 0) {
							para = 0;
							System.out.println("Ayı sizi öldürdü tüm paranızı kaybettiniz");
							break;

						}
						break;
					}
					case 2: {
						System.out.println("Kaçıyorsunuz kaçarken paranın yarısını düşürdün");
						para -= para / 2;
						System.out.println("Kalan sağlığınıız: " + sağlık);
						System.out.println("Yeni paran : " + para);
						kac = false;
						break;
					}
					default:
						System.out.println("Lütfen yalnızca 1 veya 2 tuşlayın");
						break;
					}
				}
				break;
			}
			case 5: {
				System.out.println("Dükkana hoşgeldiniz hangi dükkana gitmek istediğinizi seçin, paranız:"+ para);
				System.out.println("1)>>>>Silah dükkanı\n2)>>>>Zırh Dükkanı\n3)>>>>>İksir dükkanı");
				int secim = scan.nextInt();
				switch (secim) {
				case 1: {
					envanter.silah(para, hasar);
					hasar = envanter.yenihasar();
					para = envanter.yenipara();
					break;
				}

				case 2: {
					envanter.zırh(para, Anasağlık);
					para = envanter.yenipara();
					Anasağlık = envanter.yenisağlık();
					break;
				}
				case 3: {
					envanter.iksir(para, sağlık, Anasağlık);
					para = envanter.yenipara();
					sağlık = envanter.anlıksağlık();
				}
				default: {
					System.out.println("Lütfen yalnızca belirtilen aralıkta seçim yapınız Çıkış için 5'i tuşlayın");
					break;
				}
				}
			}
			case 6: {
				System.out.println("Hasarınız: " + hasar + "Sağlığınız: " + sağlık + "Paranız: " + para
						+ "Karakteriniz " + karakter);
			}
			default:

			}
		}
	}
	public int saldiri(int düsmansağlık) {
		if (3 < (Math.random() * ozelsans) && samurayozel == 1) {
			System.out.println("Samurayın özel yeteneği devreye girdi çift vuruş yaptı");
			int Vurulanhasar = (int) (Math.random() * hasar);
			düsmansağlık -= (Vurulanhasar * 2);
			System.out.println("Vurduğunuz hasar: " + (Vurulanhasar * 2) + " "+düsman+"nın kalan sağlığı: "
					+ düsmansağlık);
			ozelsans = 0;
		} else if (3 < (Math.random() * ozelsans) && sniperozel == 1) {
			System.out.println("Sniper kritik vuruş vurmak için hazırlanıyor");
			if (3 < (Math.random() * 7)) {
				System.out.println("Tam isabet Sniper 3 kat fazla hasar vurdu");
				int Vurulanhasar = (int) (Math.random() * hasar);
				düsmansağlık -= (Vurulanhasar * 3);
				System.out.println("Vurduğunuz hasar: " + (Vurulanhasar * 3)
						+" "+ düsman+"nın kalan sağlığı: " + düsmansağlık);
				ozelsans = 0;
			} else {
				System.out.println("Şanssızlık Sniper vuruşunu kaçırdı herhangi bir hasar vuramadı");
				System.out.println(düsman+"nın kalan sağlığı: " + düsmansağlık);
				ozelsans = 0;
			}
		}
		else {
		int Vurulanhasar = (int) (Math.random() * hasar);
		düsmansağlık -= Vurulanhasar;
		System.out.println("Vurduğunuz hasar: " + Vurulanhasar + " "+düsman+"nın kalan sağlığı: " + düsmansağlık);
		ozelsans+=2;
		}
		return düsmansağlık;
	}
	public void savunma(int düsmanhasar) {
		if (3 < Math.random() * sovalyesans && şovalyeozel == 1) {
			System.out.println("Şövalyenin özelliği devreye girdi bu tur hiç hasar almadı");
			System.out.println("Alınan hasar 0 Kalan sağlığınız" + sağlık);
			sovalyesans=0;
		}
		else {
		int Alınanhasar = (int) (Math.random() * düsmanhasar);
		sağlık -= Alınanhasar;
		System.out.println("Alınan hasar: " + Alınanhasar + " Kalan sağlığınız: " + sağlık);
		sovalyesans+=1;
		}
		
	}
}
