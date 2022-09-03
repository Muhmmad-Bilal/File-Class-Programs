import java.io.*;
class getName_Method
{
	public static void main(String arg[])
	{
		//try
		
		File file=new File("File_Record.txt");
		String name=file.getName();
		System.out.println("File name:"+name);
		//file.close();
		
		
	}
}