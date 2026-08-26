import java.util.Scanner;
class Q11{
 public static void main(String[]a){
  Scanner sc=new Scanner(System.in);
  System.out.print("Theory marks (out of 100): "); double th=sc.nextDouble();
  System.out.print("Practical marks (out of 100): "); double pr=sc.nextDouble();
  double overall=(th+pr)/2.0;
  boolean pass = (th>=40 && pr>=50) || (overall>=50);
  System.out.println(pass?"Pass":"Fail");
 }
}
/* OUTPUT (example):
Theory marks (out of 100): 45
Practical marks (out of 100): 55
Pass
*/