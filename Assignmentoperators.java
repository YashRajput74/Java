//Java Assignmentoperators
class Assignmentoperators {
  public static void main(String args[]) {
    
    // local variables
    int a = 4;
    int var;

    // assign value using =
    var = a;
    System.out.println(var);

    // assign value using =+
    var += a;
    System.out.println("+=: " + var);

    // assign value using =*
    var *= a;
    System.out.println("*=: " + var);//how 32?...4*4 is 16
  }
}