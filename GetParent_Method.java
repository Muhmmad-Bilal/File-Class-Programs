import java.io.*;
public class GetParent_Method
{
public static void main(String arg[])
{
	File file=new File("Input_Out\\File_Class\\File_Record.txt");
	String parent=file.getParent();
	System.out.println("File Parent Name:"+parent);
}

}