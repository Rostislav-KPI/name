/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fourth_task_phone_number;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 * 
 */



class Number
{
    
    
    private String[] check_arr={"+0","+1","+2","+3","+4","+5","+6","+7","+8","+9"};
    
    
    private String result;
    private ArrayList<String> arr;
    
    
    private void ConsoleInput()
    {
        arr=new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        System.out.print("Введите номер телефона:");
        result=sc.nextLine();
        
        for(String res:result.split(" "))
        {
            arr.add(res);
        }
        for(int i=0;i<arr.size();i++)
        {
            System.out.println(arr.get(i));
        }
        
        
        
    }
    
    
    
    
    
    private void FileInput(String name)
    {
        arr=new ArrayList<String>();
        
                  
        try 
        {
            FileInputStream fin;
             fin = new FileInputStream(name);
            //fin = new FileInputStream("data.txt");
            BufferedReader br=new BufferedReader(new InputStreamReader(fin, "windows-1251"));
           
                    result=br.readLine();
                    System.out.println("Телефон: "+result);
                    //br.close();
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
           
        
        
        for(String res:result.split(" "))
        {
            arr.add(res);
        }
        for(int i=0;i<arr.size();i++)
        {
            //System.out.println(arr.get(i));
        }
       
        
    }
    
    
    
    private boolean check()
    {
        
        
        boolean code_flag=false;
        
        
        if(arr.size()!=5)
        {
            return false;
        }
        
        
       
            
        //1   
        for(int i=0;i<9;i++)
        {
            if(arr.get(0).equals(check_arr[i])==true)
            {
                code_flag=true;
                break;
            }
        }

        if(code_flag==false)
        {
            return false;
        }
        
            
            
        //number_check     
        for(int i=1;i<arr.size();i++)
        {
            try
            {
                Integer.parseInt(arr.get(i));
            }
            catch(Exception e)
            {
                return false;
            }
        }
                
            
        
        //2
        if((arr.get(1).length()<3)||(arr.get(1).length()>4))
        {
            return false;
        }
        
        //2
        if((arr.get(2).length()>3)||(arr.get(2).length()<2))
        {
            return false;
        }
        
            
        if((arr.get(3).length()!=2)||(arr.get(4).length()!=2))
        {
            return false;
        }
        
        
        
        
        return true;
    }
    
    
    
    
    
    
    
    public Number()
    {
        /*int choose=0;
        Scanner s=new Scanner(System.in);
        System.out.println("читать из файла - нажмите 1");
        System.out.println("читать из консоли - нажмите 2");
        System.out.print("выбор:");

        try
        {
            choose=s.nextInt();
        }
        catch(Exception e)
        {
            System.out.println("Ошибка ввода. Завершение программы.");
            System.exit(1);
        }
        
        
        if(choose==1)
        {
            FileInput();
        }
        if(choose==2)
        {
            ConsoleInput();
        }
        if((choose!=1)&&(choose!=2))
        {
            System.out.println("Ошибка ввода. Завершение программы.");
            System.exit(1);
        }*/
        
        FileInput("Data.txt");
        
      
        boolean res=check();
        if(res==false)
        {
            System.out.println("Неверный формат телефона");
        }
        else
        {
            System.out.println("Формат телефона правильный.");
        }
        
        
        FileInput("Data2.txt");
        
      
        res=check();
        if(res==false)
        {
            System.out.println("Неверный формат телефона");
        }
        else
        {
            System.out.println("Формат телефона правильный.");
        }
        
        
        FileInput("Data3.txt");
        
      
        res=check();
        if(res==false)
        {
            System.out.println("Неверный формат телефона");
        }
        else
        {
            System.out.println("Формат телефона правильный.");
        }
        
       
        
      
      
       
    }
    

}


public class Fourth_Task_Phone_Number {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        System.out.println("Формат телефона должен быть следующим:");
        System.out.println("+1..+9  - код расположения.");
        System.out.println("3 либо 4 цифры - код населенного пункта.");
        System.out.println("9 или 8 цифр (формата 3-2-2 или 2-2-2).");
        System.out.println("Все группы цифр должны быть разделены только пробелами.");
        System.out.println("При несоответствии формату ввода будет выведено сообщение об ошибке.");
        
        
        
        Number n=new Number();
        // TODO code application logic here
    }
    
}
