import java.util.Scanner;
class Q17{
 public static void main(String[]a){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter integer: "); int n=sc.nextInt();
  int bits = Integer.SIZE; // 32
  int rotated = (n << 2) | (n >>> (bits-2));
  System.out.println("Rotated left by 2: "+rotated);
 }
}
/* OUTPUT (example):
Enter integer: 5
Rotated left by 2: 20
*/