import java.util.Scanner;
class Q2{
 public static void main(String[]a){
  Scanner sc=new Scanner(System.in);
  System.out.print("Principal: "); double p=sc.nextDouble();
  System.out.print("Rate (%) per annum: "); double r=sc.nextDouble();
  System.out.print("Time (years): "); double t=sc.nextDouble();
  double amount=p*Math.pow(1+r/100.0,t);
  double ci=amount-p;
  System.out.println("Compound Interest = "+ci);
 }
}
/* OUTPUT (example):
Principal: 1000
Rate (%) per annum: 5
Time (years): 2
Compound Interest = 102.5
*/