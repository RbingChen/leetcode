import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p119 {
	public static List<Integer> generate(int rowIndex) {
		int temp[]=new int[rowIndex+1];
         ArrayList<Integer> lt=new ArrayList();
    	 for(int i=0;i<=rowIndex;i++){
        	lt.clear();
    		 for(int j=0;j<=i;j++){
        		if(j==0) lt.add(j,1);
        		else if(j==i) lt.add(j,1);
        		else lt.add(j,temp[j-1]+temp[j]);
        	}
        	
        	for(int j=0;j<=i;j++){
        		temp[j]=lt.get(j);
        	}
        	System.out.println(lt.size());
    	}
		return lt;
    }
	public static List<Integer> getRow(int rowIndex) {
		List<Integer> list = new ArrayList<Integer>();
		if (rowIndex < 0)
			return list;

		for (int i = 0; i < rowIndex + 1; i++) {
			list.add(0, 1);//²åÈë×÷ÓÃ¡£
			System.out.println(i);
			System.out.println("befor do ...");
			display(list);
			System.out.println(" do for ...");
			for (int j = 1; j < i; j++) {
				list.set(j, list.get(j) + list.get(j+1));
				//System.out.print(j+" ");
				display(list);
				//System.out.println();
			}
			//System.out.println();
			
		}
		return list;
	}
	public static void display(List<Integer> list){  
   		 for(Integer f:list){
   			 System.out.print(f+" ");
   		 }
   		 System.out.println();
   	 }
    public static void main(String args[]){
   	    display(getRow(5));
    }
}
