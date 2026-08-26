import java.util.Scanner;
class Q8{
 public static void main(String[]a){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter angle1: "); int a=sc.nextInt();
  System.out.print("Enter angle2: "); int b=sc.nextInt();
  System.out.print("Enter angle3: "); int c=sc.nextInt();
  if(a+b+c==180) System.out.println("Valid triangle");
  else System.out.println("Not a valid triangle");
 }
}
/* OUTPUT (example):
Enter angle1: 60
Enter angle2: 60
Enter angle3: 60
Valid triangle
*/