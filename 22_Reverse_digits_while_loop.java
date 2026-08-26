import java.util.Scanner;
class Q22{
 public static void main(String[]a){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter integer: "); int n=sc.nextInt();
  int rev=0; int x=n;
  while(x!=0){ int d=x%10; rev = rev*10 + d; x/=10; }
  System.out.println("Reversed = "+rev);
 }
}
/* OUTPUT (example):
Enter integer: 12345
Reversed = 54321
*/