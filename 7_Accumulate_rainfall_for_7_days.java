import java.util.Scanner;
class Q7{
 public static void main(String[]a){
  Scanner sc=new Scanner(System.in);
  double total=0;
  for(int i=1;i<=7;i++){
    System.out.print("Day "+i+" rainfall: ");
    total+=sc.nextDouble();
  }
  System.out.println("Total rainfall = "+total);
 }
}
/* OUTPUT (example):
Day 1 rainfall: 10
Day 2 rainfall: 10
Day 3 rainfall: 10
Day 4 rainfall: 10
Day 5 rainfall: 10
Day 6 rainfall: 10
Day 7 rainfall: 10
Total rainfall = 70.0
*/