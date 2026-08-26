import java.util.Scanner;
class Q1{
 public static void main(String[]a){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter side a: "); double a=sc.nextDouble();
  System.out.print("Enter side b: "); double b=sc.nextDouble();
  System.out.print("Enter side c: "); double c=sc.nextDouble();
  double s=(a+b+c)/2.0;
  double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
  System.out.println("Area = "+area);
 }
}
/* OUTPUT (example):
Enter side a: 3
Enter side b: 4
Enter side c: 5
Area = 6.0
*/