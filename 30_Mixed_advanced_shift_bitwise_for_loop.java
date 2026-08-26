import java.util.Scanner;
class Q30{
 public static boolean isPowerOf4(int n){ if(n<=0) return false; while(n%4==0) n/=4; return n==1; }
 public static void main(String[]a){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter number: "); int n=sc.nextInt();
  System.out.println("Is power of 4? "+isPowerOf4(n));
  // toggle 3rd bit (bit index 2, counting from 0)
  int toggled = n ^ (1<<2);
  System.out.println("After toggling 3rd bit: "+toggled);
  // multiplication table of n, skip multiples of 6, stop if reach multiple of 48
  for(int i=1;i<=12;i++){
    int prod = n*i;
    if(prod%48==0){ System.out.println("Reached multiple of 48: "+prod+". Stopping."); break; }
    if(prod%6==0) continue;
    System.out.println(n+" x "+i+" = "+prod);
  }
 }
}
/* OUTPUT (example):
Enter number: 16
Is power of 4? true
After toggling 3rd bit: 20
16 x 1 = 16
16 x 2 = 32
Reached multiple of 48: 48. Stopping.
*/