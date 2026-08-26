import java.util.Scanner;
class Q5{
 public static void main(String[]a){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter integer: ");
  int n=sc.nextInt();
  int neg = -n; // unary
  System.out.println("Negative value = "+neg);
 }
}
/* OUTPUT (example):
Enter integer: 5
Negative value = -5
*/