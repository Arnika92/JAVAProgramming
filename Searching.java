package Day7;
//Write a Java program to test if an array contains a specific value
public class Searching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
          int a[]= {1,2,3,4,5,6,7,8,9};
          int y=10;
          for(int u:a) {
        	  if(u==y) {
        		  System.out.println("found");
        		  count++;
        	  }
           }
          if(count==0) {
        	  System.out.println("not found");
          }
       
        	  
	}

}
