package OOPS;

public class Encapsulation_base {

	int a=20;
	private String name;
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public static void main(String[] args) {
		Encapsulation_base obj=new Encapsulation_base();
		obj.setName("yogesh");
      System.out.println(obj.getName());
      obj.setName("nikita");
      System.out.println(obj.getName());
	}

}
