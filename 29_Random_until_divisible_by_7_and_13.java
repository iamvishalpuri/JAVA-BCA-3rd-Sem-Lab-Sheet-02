import java.util.Random;
class Q29{
 public static void main(String[]a){
  Random r=new Random();
  while(true){
    int n = r.nextInt(100)+1;
    System.out.println("Generated: "+n);
    if(n%7==0 && n%13==0){ System.out.println("Found divisible by both 7 and 13: "+n); break; }
  }
 }
}
/* OUTPUT (example run):
Generated: 57
Generated: 22
Generated: 91
Found divisible by both 7 and 13: 91
*/