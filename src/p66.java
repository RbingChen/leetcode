
public class p66 {
    public static int[] plusOne(int[] digits) {
        if(digits.length==0) return digits;
        int flag=1;
        for(int i=digits.length-1;i>=0;i--){
        	if(flag==1){
        		if(digits[i]+flag==10)
        		{
        			digits[i]=0;
        			flag=1;
        		}else{
        			flag=0;
        			digits[i]=digits[i]+1;
        		}
        	}
        }
        if(flag==1){
        	int re[]=new int[digits.length+1];
        	re[0]=1;
        	Display.display(re);
        	return re;
        }else{
        	return digits;
        }
        
    }
    public static void main(String args[]){
    	int nums[]={9,8,3};
    	Display.display(plusOne(nums));
    }
}
