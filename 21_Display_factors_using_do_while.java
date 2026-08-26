import java.util.Scanner;
class Q21{
 public static void main(String[]a){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter number: "); int n=sc.nextInt();
  int i=1;
  System.out.print("Factors: ");
  do{
    if(n % i == 0) System.out.print(i+" ");
    i++;
  }while(i<=n);
  System.out.println();
 }
}
/* OUTPUT (example):
Enter number: 28
Factors: 1 2 4 7 14 28 
*/