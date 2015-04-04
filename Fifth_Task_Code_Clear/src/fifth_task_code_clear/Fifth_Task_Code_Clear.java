/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




package fifth_task_code_clear;



import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */

class Check
{
    
    
    private ArrayList<String> arr;
    
    public Check()
    {
        
        fileInput();
        Parse(arr);
        
       
        
        fileOutput(arr);
    }
    
    
    private void fileOutput(List<String> arr)
    {
        FileOutputStream fout;
       
       
        try 
        {
          
            
            fout = new FileOutputStream("output.java");
            BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(fout));
           
            
            for(int i=0;i<arr.size();i++)
            {
                bw.write(arr.get(i));
                bw.newLine();
                
            }
          
            bw.close();
        }
        
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(Check.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(Check.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    private void fileInput()
    {
        arr=new ArrayList<String>();
        String str=new String();
        try 
        {
            FileInputStream fin;
           
            fin = new FileInputStream("data1.java");
            BufferedReader br=new BufferedReader(new InputStreamReader(fin, "windows-1251"));
            while((str=br.readLine())!=null)
            {
                arr.add(str.trim());
            }
           
            fin.close();
        }
            
            
            
        
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(Number.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (UnsupportedEncodingException ex) 
        {
            Logger.getLogger(Number.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(Number.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    
        
    }
    
    
    
    
    public void Parse(List<String> arr)
    {
        boolean flag=false;
        Pattern p = Pattern.compile("/|\\*");  
        
        
        
        while(true)
        {
            for(int i=0;i<arr.size();i++)
            {
                Matcher m = p.matcher(arr.get(i));
                if(m.find()==true)
                {
                    //System.out.println("---------------------");
                    //System.out.println("found on "+i);
                    arr.remove(i);
                    flag=true;
                    /*for(int j=0;j<arr.size();j++)
                    {
                        System.out.println(j+" "+(arr.get(j)));
                    }*/
                }
            }
            
            
            
            
            if(flag==false)
            {
                break;
            }
            
            
            flag=false;
            
        }
        
        
        
    }
    
    
}





public class Fifth_Task_Code_Clear 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Check ch=new Check();
      
        // TODO code application logic here
    }
    
}
