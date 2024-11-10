import java.io.*;

class CustomException
{
	int marksEnglish=95;
	int marksHindi=80;
	int marksMaths=97;
	int marksScience=80;
	int marksJava=91;
	
	void Result(int percentageMarks, int JavaMarks) throws Exception
	{
		if(percentageMarks<90)
		{
			throw new resultException("Sorry,you average marks are not upto the mark.");
		}
		else if(JavaMarks<90)
		{
			throw new resultException("Sorry,your Java is too weak");	
		}
		else
		{
			System.out.println("Congratulations");
		}
	}
	public static void main(String args[]) throws Exception
	{
		CustomException s1=new CustomException();
		int avgMarks=(s1.marksEnglish+s1.marksHindi+s1.marksMaths+s1.marksScience+s1.marksJava)/5;
		s1.Result(avgMarks, s1.marksJava);
	}
}

class resultException extends Exception
{
	resultException(String str)
	{
		super(str);
	}
}