// Java Logical Operators
class Logicaloperators
{
  public static void main(String args[])
  {
	
	//local variables
	int a=5,b=3,c=8;
    // && operator
    System.out.println((a > b) &&(c > a));  
    System.out.println((a > b) &&(c < a));  

    // || operator
    System.out.println((a < b)|| (c > a));  
    System.out.println((a > b)|| (c < a));  
    System.out.println((a < b)|| (c < a));  

    // ! operator
    System.out.println(!(a== b));  
    System.out.println(!(a >b)); 
  }
}