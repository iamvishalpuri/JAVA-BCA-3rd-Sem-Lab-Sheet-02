import java.util.Scanner;
class Q25{
 public static void main(String[]a){
  int[][] marks = {{80,70,90},{60,75,85}}; // rows = students
  double total=0; int count=0;
  for(int[] student: marks){ for(int m: student){ total+=m; count++; } }
  System.out.println("Average = "+(total/count));
 }
}
/* OUTPUT:
Average = 76.66666666666667
*/