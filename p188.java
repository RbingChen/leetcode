import java.util.ArrayList;
import java.util.List;

public class p188 {
     public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> re=new ArrayList();
    	 for(int i=0;i<numRows;i++){
    		ArrayList<Integer> lt=new ArrayList();
        	for(int j=0;j<=i;j++){
        		if(j==0) lt.add(0,1);
        		else if(j==i) lt.add(1);
        		else lt.add(re.get(i-1).get(j-1)+re.get(i-1).get(j));
        	}
        	re.add(lt);
    	}
		return re;
    }
     public static void display(List<List<Integer>> dis){
    	 for(List<Integer> t:dis){
    		 for(Integer f:t){
    			 System.out.print(f+" ");
    		 }
    		 System.out.println();
    	 }
     }
     public static void main(String args[]){
    	 display(generate(6));
     }
}
