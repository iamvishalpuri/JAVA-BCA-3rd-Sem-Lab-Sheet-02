import java.util.Scanner;
class Q12{
 public static void main(String[]a){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter four numbers: ");
  int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt(), d=sc.nextInt();
  int min = (a<b? (a<c? (a<d? a:d) : (c<d? c:d)) : (b<c? (b<d? b:d) : (c<d? c:d)));
  System.out.println("Smallest = "+min);
 }
}
/* OUTPUT (example):
Enter four numbers: 4 2 7 3
Smallest = 2
*/