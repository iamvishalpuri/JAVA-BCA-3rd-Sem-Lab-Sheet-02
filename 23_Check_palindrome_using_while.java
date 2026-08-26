import java.util.Scanner;
class Q23{
 public static void main(String[]a){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter integer: "); int n=sc.nextInt();
  int rev=0,x=n;
  while(x!=0){ int d=x%10; rev=rev*10+d; x/=10; }
  System.out.println(n==rev?"Palindrome":"Not Palindrome");
 }
}
/* OUTPUT (example):
Enter integer: 121
Palindrome
*/