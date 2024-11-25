import java.io.*;
class FileInputStreamBasic
{
	public static void main(String args[]) throws Exception
	{
		FileInputStream fis=new FileInputStream("C:/Users/lenovo/Desktop/Java/File/Data.txt");
		int i=0;
		while((i=fis.read())!=-1)
		{
			System.out.print((char)i);
		}
	}
}