package programs;

public class remove_duplicatearray {

	public static void main(String[] args) {

      int a[]= {1,2,3,3,3,4,5};
      int len=a.length;
      int temp[]=new int[a.length];
      int j=0;
      
      for(int i=0;i<len-1;i++) {
    	  if(a[i]!=a[i+1]) {
    		  temp[j++]=a[i];
    	  }
      }
          temp[j++]=a[len-1];
          for(int k=0;k<j;k++) {
        	  System.out.print(" "+temp[k]);
          }
      
	}

}
