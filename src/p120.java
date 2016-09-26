import java.util.LinkedList;
import java.util.List;
/*题目是什么鬼
 * 1
 * 2 3
 * 4 5 6
 * 2只能到4,5。3到5,6
 * */
public class p120 {
   public static int minimumTotal(List<List<Integer>> triangle) {
	   if(triangle==null) return 0; 
	   
	   int width=triangle.get(triangle.size()-1).size();
	    int tmp[][]=new int[width][width];
	    tmp[0][0]=triangle.get(0).get(0);
	    if(triangle.size()==1) return tmp[0][0];
	    tmp[1][0]=tmp[0][0]+triangle.get(1).get(0);
	    tmp[1][1]=tmp[0][0]+triangle.get(1).get(1);
	    for(int i=2;i<width;i++)
	       for(int j=0;j<=i;j++){
	    	   if(j==0){
	    		  // System.out.println(i+" "+j);
	    		   tmp[i][j]=Math.min(tmp[i-1][j+1], tmp[i-1][j])+triangle.get(i).get(j);
	    	   }else if(j==i-1){
	    		  // System.out.println(i+" "+j);
	    		   tmp[i][j]=Math.min(tmp[i-1][j-1], tmp[i-1][j])+triangle.get(i).get(j);
	    	   }else if(j==i){
	    		  // System.out.println(i+" "+j);
	    		   tmp[i][j]=tmp[i-1][j-1]+triangle.get(i).get(j);
	    	   }else{	 
	    		   //System.out.println(i+" "+j);
	    		   tmp[i][j]=Math.min(tmp[i-1][j-1], Math.min(tmp[i-1][j+1], tmp[i-1][j]))+triangle.get(i).get(j);
	    	   }
	       }
	    int min=Integer.MAX_VALUE;
	    for(int i=0;i<width;i++){
	    	if(tmp[width-1][i]<min){
	    		min=tmp[width-1][i];
	    	}
	    }
	    Display.display(tmp);
        return min;
    }
   public static int minimumTotal2(List<List<Integer>> triangle) {
	   if(triangle==null) return 0; 
	   
	   int width=triangle.get(triangle.size()-1).size();
	    int tmp[][]=new int[width][width];
	    tmp[0][0]=triangle.get(0).get(0);
	    if(triangle.size()==1) return tmp[0][0];
	    tmp[1][0]=tmp[0][0]+triangle.get(1).get(0);
	    tmp[1][1]=tmp[0][0]+triangle.get(1).get(1);
	    for(int i=2;i<width;i++)
	       for(int j=0;j<=i;j++){
	    	   if(j==0){
	    		  // System.out.println(i+" "+j);
	    		   tmp[i][j]=tmp[i-1][j]+triangle.get(i).get(j);
	    	   }else if(j==i){
	    		  // System.out.println(i+" "+j);
	    		   tmp[i][j]=tmp[i-1][j-1]+triangle.get(i).get(j);
	    	   }else{	 
	    		   //System.out.println(i+" "+j);
	    		   tmp[i][j]= Math.min(tmp[i-1][j-1], tmp[i-1][j])+triangle.get(i).get(j);
	    	   }
	       }
	    int min=Integer.MAX_VALUE;
	    for(int i=0;i<width;i++){
	    	if(tmp[width-1][i]<min){
	    		min=tmp[width-1][i];
	    	}
	    }
        return min;
    }
   public static int minimumTotal3(List<List<Integer>> triangle) {
	   if(triangle==null) return 0; 
	   
	   int width=triangle.get(triangle.size()-1).size();
	    int tmp[]=new int[width];
	    tmp[0]=triangle.get(0).get(0);
	    if(triangle.size()==1) return tmp[0];
	    tmp[1]=tmp[0]+triangle.get(1).get(1);
	    tmp[0]=tmp[0]+triangle.get(1).get(0);

	    for(int i=2;i<width;i++)
	       for(int j=i;j>=0;j--){
	    	   if(j==0){
	    		   tmp[j]=tmp[j]+triangle.get(i).get(j);
	    	   }else if(j==i){
	    		   tmp[j]=tmp[j-1]+triangle.get(i).get(j);
	    	   }else{	  
	    		   tmp[j]= Math.min(tmp[j-1], tmp[j])+triangle.get(i).get(j);
	    	   }
	       }
	    int min=Integer.MAX_VALUE;
	    for(int i=0;i<width;i++){
	    	if(tmp[i]<min){
	    		min=tmp[i];
	    	}
	    }
	    //Display.display(tmp);
        return min;
    }
   public static void main(String args[]){
	   List<List<Integer>> triangle=new LinkedList<>();
	   LinkedList<Integer> lt=new LinkedList<>();
	   lt.add(-1);
	   LinkedList<Integer> lt1=new LinkedList<>();
	   lt1.add(2);lt1.add(3);
	   LinkedList<Integer> lt2=new LinkedList<>();
	   lt2.add(1);lt2.add(4);lt2.add(-1);
	   LinkedList<Integer> lt3=new LinkedList<>();
       lt3.add(4);lt3.add(8);lt3.add(8);lt3.add(3);
       triangle.add(lt);triangle.add(lt1);triangle.add(lt2);//triangle.add(lt3);
     Display.display(triangle);
       System.out.println(minimumTotal3(triangle));
       
   }
}
