import java.util.LinkedList;

public class p60 {
   public static String getPermutation(int n, int k) {
       int num[]=new int[n];
       num[0]=1;
       for(int i=1;i<n;i++){
    	   num[i]=(i)*num[i-1];
       }
     //  Display.display(num);
       StringBuilder st=new StringBuilder();
       LinkedList<Integer> numb=new LinkedList<>();
       for(int i=0;i<n;i++)
    	   numb.add(i+1);
       k--;
       int j=n-1;
       while(j>=0){
            int a=k/num[j];
            st.append(numb.get(a));
            numb.remove(a);
            k-=a*num[j];
          //  System.out.println(st);
            j--;
       }
	   return st.toString();
    }
   
   public static void main(String args[]){
	   System.out.println(getPermutation(9,40321));
   }
}
