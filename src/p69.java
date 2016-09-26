
public class p69 {
     public static int mySqrt1(int x) {
    	double g=1;
    	while((g*g)-x>0.00001){
    		g=(g+x/g)/2;
    	}
    	return (int)g;
    }
     public static int mySqrt(int x) {
        if(x<=1) return x;
        int left=0,right=x;
        while(left<right){
        	int mid=(left+right)/2;
        	if(mid==left) return left; 
        	if(mid>46340) {
        		mid=46340;
        		if(mid*mid<x) return mid;
        	  } 
        	if(mid*mid==x) return mid;
        	
        	else if(mid*mid>x) right=mid;
        	else left=mid;
        }
        return right;
     }
     public static int mySqrt2(int x) {
         if(x<=1) return x;
         int left=0,right=x;
         int mid=(left+right)/2;
         if(mid>46340) {
         	mid=46340;
            if(mid*mid<x) return mid;
         } 
        
         while(left<right){
             if(mid*mid==x) return mid;
         	if(mid==left) return left; 
         	else if(mid*mid>x) right=mid;
         	else left=mid;
         	mid=(left+right)/2;
         }
         return right;
     }
     /*使用了除法  避免了判断*/
     public int sqrt3(int x) {
    	    if (x == 0)
    	        return 0;
    	    int left = 1, right = Integer.MAX_VALUE;
    	    while (true) {
    	        int mid = left + (right - left)/2;
    	        if (mid > x/mid) {
    	            right = mid - 1;
    	        } else {
    	            if (mid + 1 > x/(mid + 1))
    	                return mid;
    	            left = mid + 1;
    	        }
    	    }
    	}
     public static void main(String args[]){
    	 System.out.println(mySqrt(0));
    	 System.out.println(mySqrt(4));
    	 System.out.println(mySqrt(9));
    	 System.out.println(mySqrt(16));
    	 System.out.println(mySqrt(25));
    	 System.out.println(mySqrt(30));
    	 System.out.println(mySqrt2(2147395599));
    	 System.out.println(Math.sqrt(Integer.MAX_VALUE));
    	 System.out.println(46339*46339);
     }
}
