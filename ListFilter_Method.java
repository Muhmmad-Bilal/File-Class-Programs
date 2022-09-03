import java.io.*;
public class ListFilter_Method
{
	public static void main(String arg[])
	{
		try
		{
		File f=new File("C:\\Users\\Muhammad bilal\\Desktop\\java_prog\\Input_Out\\File_Class");
		FilenameFilter filter=new FilenameFilter()
		{
			public boolean accept(File f,String name)
			{
				return name.startsWith("CanRead");
			}
		};
		String[] file=f.list(filter);
		System.out.println("Files are");
		for(int i=0;i<=file.length;i++)
		{
			System.out.println(file[i]);
			
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}