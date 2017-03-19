//static final değişkenler ve static metot çalışmaları bulunmaktadır.
//main.java kodları

package Ders2;

public class ana {

	public static void main(String[] args) {
	
		Class1 c1 = new Class1();
		c1.sayi1 =5;
		System.out.println(c1.sayi1);
		
		c1.sayi2 =10;
		System.out.println(c1.sayi2);
		
		//c1.sayi3 =15; //final olduğu için atama yapmana izin vermiyor.
		System.out.println(c1.sayi3);
		
		int sonuc = Class1.Böl(3, 2); //static metotlarınız varsa nesne oluşturmadan Class1.MetotAdi yazabilirsiniz.
		System.out.println(sonuc);
	}

}

//Class1.java

package Ders2;

public class Class1 {

	public int sayi1 = 0;
	public static int sayi2 = 0;
	public static final int sayi3 = 0;
	
	public static int Topla(int sayi1, int sayi2)
	{
		return sayi1 + sayi2;
	}
	public static int Cikar(int sayi1, int sayi2)
	{
		return sayi1 - sayi2;
	}
	public static int Carp(int sayi1, int sayi2)
	{
		return sayi1 * sayi2;
	}
	public static int Böl(int sayi1, int sayi2)
	{
		return sayi1 / sayi2;
	}
	
	
	
	
	
}
