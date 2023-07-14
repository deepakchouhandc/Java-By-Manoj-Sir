package IOExampleInputStream;

import java.io.File;


public class FileExample {
    
    public static void main(String[] args) {
        
                
       File f = new File("D:\\text file\\Java Data//demo.txt");
       
       
       if(f.isFile())
       {
                String[] name = f.list();

            for(String n:name)
            {
                System.out.println(n);
            }
       }
       else
       {
           System.out.println("Not a File");
       }
       
       
       
       
       /*
       if(f.isDirectory())
       {
                String[] name = f.list();

            for(String n:name)
            {
                System.out.println(n);
            }
       }
       else
       {
           System.out.println("Not a folder");
       }
       
        */
        
        
        /*
        //      boolean res =  f.isHidden();
        boolean res =  f.canWrite();
        System.out.println(res);
         */
        /*  if(f.exists())
        {
        long n= f.length();
        System.out.println("Length of Demo File is = "+n);
        }
        else
        {
        System.out.println("Not Available");
        }
         */
     
    }
    
}
