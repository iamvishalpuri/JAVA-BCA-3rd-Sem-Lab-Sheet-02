import java.util.Scanner;
class Q3{
 public static void main(String[]a){
  Scanner sc=new Scanner(System.in);
  System.out.print("x1 y1: "); double x1=sc.nextDouble(), y1=sc.nextDouble();
  System.out.print("x2 y2: "); double x2=sc.nextDouble(), y2=sc.nextDouble();
  double d=Math.hypot(x2-x1,y2-y1);
  System.out.println("Distance = "+d);
 }
}
/* OUTPUT (example):
x1 y1: 0 0
x2 y2: 3 4
Distance = 5.0
*/