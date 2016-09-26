import java.util.LinkedList;
import java.util.List;

public class Display {
    public static void display(List<List<Integer>> triangle){
    	for(List<Integer> lt : triangle){
    		for(Integer it :lt){
    			System.out.print(it+"   ");
    		}
    		System.out.println();
    	}
    }
    public static void display(LinkedList<Integer>lt){
    	
    		for(Integer it :lt){
    			System.out.print(it+"   ");
    		}
    		System.out.println();
    	
    }
    public static void display(int nums[][]){
		
		   for(int i=0;i<nums.length;i++){
			   
		      for(int j=0;j<nums[0].length;j++){
			        System.out.print(nums[i][j]+"   ");
		         }
		      System.out.println();
		   }
	   }
    public static void display(int nums[]){
		
		   for(int i=0;i<nums.length;i++){
			   
		     
			        System.out.print(nums[i]+"   ");
		         }
		      System.out.println();
		   }

}
	    

