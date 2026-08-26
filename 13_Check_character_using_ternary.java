import java.util.Scanner;
class Q13{
 public static void main(String[]a){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter a character: ");
  char ch=sc.next().charAt(0);
  String res = Character.isDigit(ch)?"Digit" :
    ("AEIOUaeiou".indexOf(ch)>=0?"Vowel": (Character.isLetter(ch)?"Consonant":"Special symbol"));
  System.out.println(res);
 }
}
/* OUTPUT (example):
Enter a character: A
Vowel
*/