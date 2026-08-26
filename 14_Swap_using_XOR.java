import java.util.Scanner;
class Q14{
 public static void main(String[]a){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter two integers to swap: ");
  int x=sc.nextInt(), y=sc.nextInt();
  x = x ^ y;
  y = x ^ y;
  x = x ^ y;
  System.out.println("After swap: x="+x+" y="+y);
 }
}
/* OUTPUT (example):
Enter two integers to swap: 5 7
After swap: x=7 y=5
*/