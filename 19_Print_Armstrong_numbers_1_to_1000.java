class Q19{
 public static boolean isArmstrong(int n){
  int sum=0,x=n; while(x>0){ int d=x%10; sum+=d*d*d; x/=10; }
  return sum==n;
 }
 public static void main(String[]a){
  for(int i=1;i<=1000;i++) if(isArmstrong(i)) System.out.println(i);
 }
}
/* OUTPUT:
1
153
370
371
407
*/