import java.io.*;
class ByteArrayOutputStreamBasic
{
	public static void main(String args[]) throws Exception
	{
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		String s1="I am Vijay Kumar Shaw";
		byte b[]=s1.getBytes();//There is no need for a for loop beacause it takes a whole array as input
		baos.write(b);
		baos.writeTo(new FileOutputStream("Vijay1.txt"));
		baos.writeTo(new FileOutputStream("Vijay2.txt"));
		baos.writeTo(new FileOutputStream("Vijay3.txt"));
		baos.writeTo(new FileOutputStream("Vijay4.txt"));
		baos.writeTo(new FileOutputStream("Vijay5.txt"));
		System.out.println(baos.toString());
		ByteArrayInputStream bais=new ByteArrayInputStream(b);
		int i=0;
		while((i=bais.read())!=-1)
		{
			System.out.print((char)i);
		}
	}
}