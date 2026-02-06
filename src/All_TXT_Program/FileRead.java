import java.io.BufferedInputStream;
import java.io.FileInputStream;

class FileRead
{
    public static void main(String args[])
    {
try{
        FileInputStream file=new FileInputStream("D:\npkey.txt");

    BufferedInputStream input=new BufferedInputStream(file);

    int i=input.read();    

    while(i!=-1)
    {
        System.out.print((char)i);
    
        i=input.read();
    }
    input.close();
}}

catch(Exception e)
{
System.out.print("Exception occure");
}
}