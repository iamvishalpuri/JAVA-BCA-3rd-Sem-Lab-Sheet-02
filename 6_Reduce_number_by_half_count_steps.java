import java.util.Scanner;
class Q6{
 public static void main(String[]a){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter number (>0): ");
  double n=sc.nextDouble();
  int steps=0;
  while(n>=1){ n/=2; steps++; }
  System.out.println("Steps until <1: "+steps);
 }
}
/* OUTPUT (example):
Enter number (>0): 16
Steps until <1: 5
*/