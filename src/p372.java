
public class p372 {
   public static int superPow(int a, int[] b) {
       if (a % 1337 == 0)
           return 0;
       a = a % 1337;
       int[] next = new int[1337];
       int count = 0;
       int val = a;
       while (next[val] == 0) {
           next[val] = val * a % 1337;
           val = next[val];
           count++;
       }
       int m = mod(b, count);
       while (--m > 0)
           a = next[a];
       return a;
   }

   private static int mod(int[] b, int c) {
       int m = 0;
       for (int i = 0; i < b.length; i++) {
           m = (m * 10 + b[i]) % c;
       }
       return m;
   }
  /*One knowledge: ab % k = (a%k)(b%k)%k
Since the power here is an array, we'd better handle it digit by digit.
One observation:
a^1234567 % k = (a^1234560 % k) * (a^7 % k) % k = (a^123456 % k)^10 % k * (a^7 % k) % k
Looks complicated? Let me put it other way:
Suppose f(a, b) calculates a^b % k; Then translate above formula to using f :
f(a,1234567) = f(a, 1234560) * f(a, 7) % k = f(f(a, 123456),10) * f(a,7)%k
    * */
   public static int superPow2(int a, int[] b) {
	   return 0;
   }
   
   public static void main(String args[]){
	   int b[]={2,0,0};
	   System.out.println(superPow(2147483647,b));
   }
}
