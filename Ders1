package first;
//9 Mart 2017
import java.util.Scanner;


public class workshop {

	
	public static void main(String[] args) {
	//Hello World	
	System.out.println("Hello World");
	
	//Değişken Tanımlama
	String kelime ="Cansu Arslan";
	int numb1 = 10;
	int numb2 = 20;
	char ch= 'A';
	double numb3= 3.5;
	
	//Kontrol Yapıları if-switch
	if (numb1==numb2) {
		System.out.println("Sayilar esittir.");
	}
	else System.out.println("Sayilar esit degildir.");
	
	switch(numb1)
	{
	case 1: System.out.println("Bir");
	break;
	case 2: System.out.println("İki");
	break;
	default: System.out.println("Diger");
	break;
	}
	
	//Döngüler for-while-do,while
	//syso+Ctrl+Space
	//syso içerisinde + ile değişkenleri birbirine bağlarsın.
		for (int i = 0; i < numb1; i++) {
			System.out.println("i> " + i);
		}
		
		while(numb1<20)
		{
			numb1++;
			System.out.println("numb1>> " + numb1);
		}
		
		do
		{
			numb1++;
			System.out.println("numb1>> " +numb1);
		}while(numb1==numb2);
		
		//Dizi Tanımlama
		String[] kelimeler = new String[2];
		kelimeler[0]="Habitat";
		kelimeler[1]="Dernegi";
		
		//Dizi elemanlarını for ile yazdırma
		for (int i = 0; i < kelimeler.length; i++) {
			System.out.println("Kelimemiz> " +kelimeler[i]);
		}
		//Çok boyutlu dizi tanımlama
		int[][] sayilar = new int[2][2];
		sayilar[0][0] = 3;
		sayilar[1][0] = 2;
		sayilar[0][1] =1;
		sayilar[1][1] =10;
		
		//Çok boyutlu dizinin elemanlarını for ile yazdırma
		for (int i = 0; i < sayilar.length; i++) {
			for (int j = 0; j < sayilar.length; j++) {
				System.out.print(sayilar[i][j]+ " ");
			}
			 System.out.println();
		}
		
		//Kullanıcıdan değişken alma
		//import java.util.Scanner;  eklemeyi unutmayın.
		Scanner keyboard = new Scanner(System.in);
		
		//Kullanıcıdan int bir değişken alma
		System.out.println("İnt bir değer giriniz..");
		int sayi = keyboard.nextInt() ;
		
		//Kullanıcıdan string bir değişken alma
		System.out.println("String iki değeri boşluk bırakarak giriniz...");
		String value1 = keyboard.next();
		System.out.println();
		String value2 = keyboard.nextLine();
		
		//İkisi arasındaki farkı incelemeyi unutmayın.
		System.out.println("1.>>" + sayi + " " + value1 + " " + value2);
		System.out.println("2.>>" + sayi);
	    System.out.println("3.>>" +value1);
	    System.out.println("4.>>" +value2);
	    
	    //Çarpım tablosu
	    for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(i +"*" +j +": " + i*j + " ");
			}
			System.out.println();
		}
	    
	    //Ders Sonu Çalışma Kodları
	   /*UYG: Kullanıcıdan aldığınız cümlenin karakter sayısı kadar kenar uzunluğu olan bir kare oluşturunuz…(5 karakterliyse satır ve sütunlarda 5 uzunluğunda * olmalıdır. )
*Noktalama işaretleri kontrolü yaptırmayınız.
*Boşluk kontrolü yaptırmayı unutmayın.*/
 System.out.println("Uygulama için string giriniz...");
	    int sayac = 0;
		
		Scanner keyboard2 = new Scanner(System.in);
		String cümle = keyboard2.nextLine();
		
		for (int i = 0; i < cümle.length(); i++) {
			if(cümle.charAt(i) == ' ')
				{
				sayac++;
				}
			
		}
		int kenarUzunlugu = cümle.length() -sayac;
		System.out.println("Cümleniz" + " " + kenarUzunlugu +" " + "karaktere sahiptir.");
		
		for (int i = 0; i < kenarUzunlugu; i++) {
			
				
				for (int j = 0; j < kenarUzunlugu-1; j++) {
					System.out.print("*");
				}
			
				System.out.println("*");
		}
	    
	}
}


