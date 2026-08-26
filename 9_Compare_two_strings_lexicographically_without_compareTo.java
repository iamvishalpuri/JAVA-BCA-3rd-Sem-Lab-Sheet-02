import java.util.Scanner;
class Q9{
 public static void main(String[]a){
  Scanner sc=new Scanner(System.in);
  System.out.print("String 1: "); String s1=sc.nextLine();
  System.out.print("String 2: "); String s2=sc.nextLine();
  int n=Math.min(s1.length(), s2.length());
  int res=0; // -1 if s1<s2, 0 equal, 1 if s1>s2
  for(int i=0;i<n;i++){
    char c1=s1.charAt(i), c2=s2.charAt(i);
    if(c1<c2){ res=-1; break; }
    else if(c1>c2){ res=1; break; }
  }
  if(res==0){
    if(s1.length()<s2.length()) res=-1;
    else if(s1.length()>s2.length()) res=1;
  }
  if(res<0) System.out.println(s1+" comes before "+s2);
  else if(res>0) System.out.println(s1+" comes after "+s2);
  else System.out.println("Strings are equal");
 }
}
/* OUTPUT (example):
String 1: apple
String 2: banana
apple comes before banana
*/