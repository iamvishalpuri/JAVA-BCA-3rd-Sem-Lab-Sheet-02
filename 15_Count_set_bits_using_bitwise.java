import java.util.Scanner;
class Q15{
 public static void main(String[]a){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter integer: ");
  int n=sc.nextInt();
  int count=0;
  int x=n;
  while(x!=0){ count += x & 1; x = x >>> 1; }
  System.out.println("Set bits = "+count);
 }
}
/* OUTPUT (example):
Enter integer: 13
Set bits = 3
*/