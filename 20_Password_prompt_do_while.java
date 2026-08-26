import java.util.Scanner;
class Q20{
 public static void main(String[]a){
  Scanner sc=new Scanner(System.in);
  final String correct = "secret123";
  String pwd;
  do{
    System.out.print("Enter password: "); pwd=sc.nextLine();
  }while(!pwd.equals(correct));
  System.out.println("Access granted");
 }
}
/* OUTPUT (example):
Enter password: secret123
Access granted
*/