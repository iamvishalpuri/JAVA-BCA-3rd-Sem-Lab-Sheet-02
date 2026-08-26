import java.util.Scanner;
class Q16{
 public static void main(String[]a){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter integer: "); int n=sc.nextInt();
  System.out.print("Power of two k (multiply by 2^k): "); int k=sc.nextInt();
  int mul = n << k;
  int div = n >> k;
  System.out.println(n+" * 2^"+k+" = "+mul);
  System.out.println(n+" / 2^"+k+" = "+div);
 }
}
/* OUTPUT (example):
Enter integer: 3
Power of two k (multiply by 2^k): 2
3 * 2^2 = 12
3 / 2^2 = 0
*/