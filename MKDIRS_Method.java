import java.io.*;
class MKDIRS_Method
{
public static void main(String arg[])
{
	try
	{
File folder=new File("D:\\word");
folder.mkdirs();
for(int i=0;i<1000;i++)
{
	File f=File.createTempFile("sachal",".txt",folder);
	FileOutputStream fo=new FileOutputStream(f.getAbsolutePath(),true);
	PrintStream out=new PrintStream(fo);
	out.println("Hello:"+i);
	fo.close();
}
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
}