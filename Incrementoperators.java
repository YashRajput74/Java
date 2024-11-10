//Increment and Decrement Operators
class Incrementoperators
{
    public static void main(String args[]) {
        
        // Local variables
        int a = 10,b = 20,x = 5,y = 10;
        int result;
		
        // Pre-increment
        result = ++a;
        System.out.println(a);
        System.out.println(result);
        // Post-increment
        result = b++;
        System.out.println(b);
        System.out.println(result);
        // Reset values
        a = 10; 
        b = 20;
        // Pre-decrement
        result = --a;
        System.out.println(a);
        System.out.println(result);
        // Post-decrement
        result = b--;
        System.out.println(b);
        System.out.println(result);
        // Using increment operators in expressions
        result = x++ + ++y;
        System.out.println(result);
        System.out.println(x);
        System.out.println(y);
        x = 5;
        y = 10;

        // Using decrement operators in expressions
        result = --x + y--;
        System.out.println(result);
        System.out.println(x);
        System.out.println(y);
    }
}
