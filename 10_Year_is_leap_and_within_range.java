import java.util.Scanner;
class Q10{
 public static void main(String[]a){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter year: "); int y=sc.nextInt();
  System.out.print("Range start: "); int s=sc.nextInt();
  System.out.print("Range end: "); int e=sc.nextInt();
  boolean leap = (y%4==0 && y%100!=0) || (y%400==0);
  boolean inRange = y>=s && y<=e;
  if(leap && inRange) System.out.println(y+" is a leap year within the range");
  else System.out.println(y+" is NOT both leap and in range");
 }
}
/* OUTPUT (example):
Enter year: 2020
Range start: 2019
Range end: 2021
2020 is a leap year within the range
*/