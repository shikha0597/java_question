package five_programs;

public class Triangle_2 {
	int s1,s2,s3;
    public Triangle_2 (int side1,int side2,int side3)
     {
        s1=side1;
        s2=side2;
        s3=side3;
     }
	public static void main(String[] args) {
		
		Triangle_2 t=new Triangle_2 (3,4,5);
        int peri=(t.s1+t.s2+t.s3);
        System.out.println("perimeter is:"+peri);
        
        int sp=(peri/2);
        int ar=((((sp*(sp-t.s1))*(sp-t.s2))*(sp-t.s3)));       
        int area=(int)Math.sqrt(ar);   
        System.out.println("Area is:"+area);
	}

}
