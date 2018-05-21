package problems;

public class CountsToBeFlipped {

	public static void main(String[] args) {
	    
	    int x = 10, y = 20;
	    
	    int z = x ^ y ;
	    
	    int count = 0;
	    
	     while (z>0){
	            count += z & 1;
	            z >>= 1;
	        }
	    
	     System.out.println("Number of times is "+count);
	  }
}
