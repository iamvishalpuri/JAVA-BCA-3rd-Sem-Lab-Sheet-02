class Q4{
 public static void main(String[]a){
  int visitors=0;
  System.out.println("Initial visitors: "+visitors);
  System.out.println("Visitor enters: "+(++visitors)); // prefix
  System.out.println("Visitor leaves (postfix show then decrement): "+(visitors--));
  System.out.println("Now visitors: "+visitors);
 }
}
/* OUTPUT:
Initial visitors: 0
Visitor enters: 1
Visitor leaves (postfix show then decrement): 1
Now visitors: 0
*/