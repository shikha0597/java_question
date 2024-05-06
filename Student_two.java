package five_programs;

public class Student_two {

	    int rn_sam=10;
	    int rn_john=12;
	    long pn_sam= 937483282L;
	    long pn_john=584782378L;
	    String add_sam="abcd";
	    String add_john="pqrs";
	    
	public static void main(String[] args) {
		
		Student_two sam=new Student_two();
	    Student_two john=new Student_two();
	    
	       System.out.println("Sam's roll number is " + sam.rn_sam);
	       System.out.println("john's roll number is "+ john.rn_john);
	       System.out.println("Sam's phone number is " + sam.pn_sam);
	       System.out.println("john's phone number is " + john.pn_john);
	       System.out.println("Sam's address is " + sam.add_sam);
	       System.out.println("john's address is " + john.add_john);
	}

}
