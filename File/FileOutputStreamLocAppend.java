import java.io.*;
class FileOutputStreamLocAppend
{
	public static void main(String args[]) throws Exception
	{
		FileOutputStream fos=new FileOutputStream("C:/Users/lenovo/Desktop/Java/File/Data.txt",true);
		String s1="I am working in Ducat.";
		byte b[]=s1.getBytes();
		for(int i=0;i<b.length;i++)
		{
			fos.write(b[i]);
		}
		System.out.println("File Created Successfully");
	}
}