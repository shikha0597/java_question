package five_programs;

public class Triangle {
int a=3;
int b=4;
int c=5;

	public static void main(String[] args) {
		Triangle t= new Triangle ();
		
		int perimeter = (t.a+t.b+t.c);
		System.out.println("Perimeter is "+ perimeter);
		
        int sp = (perimeter/2);
        int Area = ((((sp*(sp-t.a))*(sp-t.b))*(sp-t.c)));
        int area = (int) Math.sqrt(Area);
        
		System.out.println("Area is "+ area);
		

}
}