import java.util.Scanner;
class Q24{
 public static void main(String[]a){
  int[] arr = {5,3,9,1,7};
  int max=arr[0], min=arr[0];
  for(int v: arr){ if(v>max) max=v; if(v<min) min=v; }
  System.out.println("Max="+max+" Min="+min);
 }
}
/* OUTPUT:
Max=9 Min=1
*/