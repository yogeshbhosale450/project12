package programs;

public class string {
	String a="akshay raje";
	String[] reverse=a.split(" ");
	int y=reverse.length;
	String s = "akshay";
	 String rev="";
	public void m1() {
		
		for(int i=s.length()-1;i>=0;i--){
			rev=rev+s.charAt(i);
			
		}if(s.equals(rev)) {
			System.out.println("its pallindrome");
		}else {
			System.out.println("its not pallindrome");
		}
	}
	
	public void m2() {
		 for(int j=reverse.length-1;j>=0;j--) {
			 System.out.print(reverse[j]+" ");
		 }
		
		
		
	}
	

	public static void main(String[] args) {
		string z=new string();
		z.m1();
		z.m2();
		//System.out.println(z.y);

	}

}
