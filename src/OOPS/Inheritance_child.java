package OOPS;

public class Inheritance_child extends Inheritance_parent {
        
	public void Test() {
		System.out.println("its test");
	}
	
	
	public static void main(String[] args) {
		Inheritance_child z= new Inheritance_child();
		z.Test();
		z.M1();
		z.M2();
		z.M4();
		System.out.println(z.b);
         System.out.println(z.a);
     
	}

}
