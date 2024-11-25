import java.io.*;
class FileOutputStreamBasic
{
	public static void main(String args[]) throws Exception
	{
		FileOutputStream fos=new FileOutputStream("Data.txt");
		String s1="I am Vijay Shaw.";
		byte b[]=s1.getBytes();
		for(int i=0;i<b.length;i++)
		{
			fos.write(b[i]);
		}
		System.out.println("File Created Successfully");
	}
}