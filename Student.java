import java.io.*;

class Student
{
	int marksEnglish=95;
	int marksHindi=90;
	int marksMaths=97;
	int marksScience=80;
	int marksJava=85;
	
	void Result(int percentageMarks) throws Exception
	{
		if(percentageMarks<90)
		{
			throw new resultException("Sorry,you result is not upto the mark.");
		}
	}
	public static void main(String args[]) throws Exception
	{
		Student s1=new Student();
		int avgMarks=(s1.marksEnglish+s1.marksHindi+s1.marksMaths+s1.marksScience+s1.marksJava)/5;
		s1.Result(avgMarks);
	}
}

class resultException extends Exception
{
	resultException(String str)
	{
		super(str);
	}
}