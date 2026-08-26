import java.util.Scanner;
class Q18{
 public static void main(String[]a){
  int n1=0,n2=1; System.out.print(n1+" "+n2);
  for(int i=3;i<=20;i++){ int n3=n1+n2; System.out.print(" "+n3); n1=n2; n2=n3; }
  System.out.println();
 }
}
/* OUTPUT:
0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181
*/