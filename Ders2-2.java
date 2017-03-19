//Constructor, nesne kavramı ve uygulama kodlarını içermektedir.
//main kodları 
package Ders2;

public class ana {

	public static void main(String[] args) {
		Class1 c1 = new Class1();
		c1.numb1 = 3;
		c1.numb2 =4;
		c1.word1 ="cansu";
		
		c1.setNumb3(2);
		c1.getNumb3();
		
		Class1 c2 = new Class1(2,1,"arslan");
	}

}



//Class1.java kodları

package Ders2;

public class Class1 {

	public int numb1 ;
	public int numb2 ;
	public String word1 ;
	
	private int numb3 ;
	private int numb4 ;
	private String word2;
	
	
	public int getNumb3() {
		return numb3;
	}
	public void setNumb3(int numb3) {
		this.numb3 = numb3;
	}
	public int getNumb4() {
		return numb4;
	}
	public void setNumb4(int numb4) {
		this.numb4 = numb4;
	}
	public String getWord2() {
		return word2;
	}
	public void setWord2(String word2) {
		this.word2 = word2;
	}
	
	public Class1()
	{
		
	}
	
	public Class1(int numb3, int numb4, String word2) {
		
		this.numb3 = numb3;
		this.numb4 = numb4;
		this.word2 = word2;
	}
	
	
	
	
	
	
}
