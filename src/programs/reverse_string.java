package programs;

import java.util.Scanner;

public class reverse_string {
    String name="yogesh";
    String rev="";
    String name1="yogesh bhosale";
    String b[]=name1.split(" ");
	public void rev () {
		
		for(int i=name.length()-1;i>=0;i--) {
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
	}
	
	public void rev_scanner() {
		
	Scanner sc=new Scanner(System.in);
	String a=sc.next();
	for(int j=a.length()-1;j>=0;j--) {
		System.out.print(a.charAt(j));
	}
}
    public void rev_sentence() {
	 	for(int k=b.length-1;k>=0;k--) {
	 		System.out.print(b[k]+" ");
	 	}
	}
	
	public static void main(String[] args) {
		reverse_string obj=new reverse_string();
		obj.rev();
        obj.rev_scanner();
        obj.rev_sentence();
	}

}
