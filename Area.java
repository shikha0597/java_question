package five_programs;

import java.util.Scanner;

public class Area {
	int length,breadth; 
	void setDim(int l, int b){ 
		length=l;
		breadth=b; 
		} 
	int getArea(){
		
	return length*breadth;
		} 
	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in); 
		
		int length,breadth; 
		System.out.println("Enter length :"); 
		
		length=obj.nextInt(); 
		
		System.out.println("Enter breadth :"); 
		breadth=obj.nextInt(); 
		
		Area rect=new Area(); 
		rect.setDim(length,breadth); 
		
		System.out.println("Area is : "+rect.getArea()); 
		obj.close();
		
	}
}