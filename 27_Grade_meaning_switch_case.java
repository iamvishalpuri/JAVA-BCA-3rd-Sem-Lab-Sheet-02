import java.util.Scanner;
class Q27{
 public static void main(String[]a){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter grade (A-F): "); char g=sc.next().charAt(0);
  switch(g){
    case 'A': case 'a': System.out.println("Excellent"); break;
    case 'B': case 'b': System.out.println("Good"); break;
    case 'C': case 'c': System.out.println("Average"); break;
    case 'D': case 'd': System.out.println("Below Average"); break;
    case 'E': case 'e': System.out.println("Poor"); break;
    case 'F': case 'f': System.out.println("Fail"); break;
    default: System.out.println("Invalid grade");
  }
 }
}
/* OUTPUT (example):
Enter grade (A-F): A
Excellent
*/