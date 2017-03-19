//ArrayList ve Uygulama 1 kodlarını içermektedir.
//main.java kodları


package Ders3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Proje3 {

	public static void main(String[] args) {
		
		/*int toplamSonucu = Class1.Topla(3, 2);
		
		Class2 c1 = new Class2();
		Class2 c2 = new Class2();
		
		c1.sayi1 = 5;
		System.out.println("public int sayi1: " + c1.sayi1 );
		System.out.println("public int sayi1: " + c2.sayi1);
		
		c1.sayi2 = 5;
		System.out.println("public static int sayi2: " + c1.sayi2);
		System.out.println("public static int sayi2: " + c2.sayi2);

		System.out.println(c1.sayi3) ;*/
	/*	Scanner keyboard = new Scanner(System.in);
		String sayi1 = keyboard.nextLine();
		String sayi2 = keyboard.nextLine();
		int sayi3 =0;
		int sayi4 =0;
		try {
		    sayi3 = Integer.parseInt(sayi1);
			sayi4 = Integer.parseInt(sayi2);
			System.out.println(Class1.Topla(sayi3, sayi4));
		} catch (Exception e) {
			System.out.println("Lütfen sayi giriniz!");
		}*/
		ArrayList<String> listem= new ArrayList<String>();
		listem.add("merve");
		listem.add("beyza");
		listem.add("aaaaaa");
		listem.add("zzz"
				+ "zzz");
		//listem.clear();
		//Collections.sort(listem);
		Collections.reverse(listem);
		System.out.println(listem);
		//listem.set(1, "cansu");
		//System.out.println(listem.get(1));
		//listem.remove(0);
		//System.out.println(listem.get(0));
	//	listem.add("beyza");
		
	}

}
//Class1.java kodları

package Ders3;

public class Class1 {

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
	
