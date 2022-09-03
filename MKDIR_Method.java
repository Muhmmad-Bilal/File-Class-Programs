import java.io.*;
public class MKDIR_Method
{
	public static void main(String arg[])
	{
		File f=new File("D:\\Users\\Muhammad bilal\\Desktop\\java_prog\\Input_Out\\File_Class");
		if(f.mkdir())
		{
			System.out.println("Directory is Created");
		}
		else 
		{
			System.out.println("Also Created");
		}
	}
	
}