/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package third_task_threads;

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
 */

class ThreadPool extends Thread
{
    private double result;
    private int count;
    private int thread_count=0;
    
    
    public int get()
    {
        return thread_count;
    }
    
    
    
    
    
    
    public ThreadPool(int n)
    {
        count=n;
        start();
    }
    
    
    
    
    
    @Override
    public void run()
    {
        System.out.println("Дочерний поток начал работу: "+new Date());
        result=expression(count);
        System.out.println("Результат: "+ result);
        System.out.println("Дочерний поток закончил работу: "+new Date());
    }
    
    
    
    
    
    
    
    
    
    
    
    public double expression(int n)
    {
        double frame=2;
        double power=0;
        double res=0;
        
        for(int i=0;i<n;i++)
        {
            power=Math.pow(-1,i);
            power=i-power;
            res+=Math.pow(frame, power);
            
        }
        
        return res;
    }
    
    
    
    
    
    
    
    
    
}



public class Third_Task_Threads_Pool {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       /* System.out.println("Ручное создание потоков:");
        System.out.println("Главный поток начал работу: "+new Date());
        
        int ammount=0;
        int a=0;
        int n=0;
        
        int choose=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Считать из файла - нажмите 1");
        System.out.println("Считать из консоли - нажмите любую другую цифру");
        System.out.print("Выбор:");
      
        try
        {
            choose=s.nextInt();
        }
        catch(Exception e)
        {
            System.out.println("Неправильный ввод. Завершение программы.");
            System.exit(1);
        }
        
        
        
        if(choose==1)
        {
            
            
            
            try 
            {
                FileInputStream fin=new FileInputStream("data.txt");
                BufferedReader br=new BufferedReader(new InputStreamReader(fin, "windows-1251"));
                String str=br.readLine();
                System.out.println(str);
                n=Character.getNumericValue(str.charAt(0));
                ammount=Character.getNumericValue(str.charAt(2));
                System.out.println(n);
                System.out.println(ammount);
               
            } 
            
            
            
            
            catch (FileNotFoundException ex) 
            {
                Logger.getLogger(Third_Task_Threads_Pool.class.getName()).log(Level.SEVERE, null, ex);
            } 
            catch (UnsupportedEncodingException ex) 
            {
                Logger.getLogger(Third_Task_Threads_Pool.class.getName()).log(Level.SEVERE, null, ex);
            } 
            catch (IOException ex) 
            {
                Logger.getLogger(Third_Task_Threads_Pool.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        else
        {
            

            Scanner sc=new Scanner(System.in);
            System.out.print("Введите количество потоков:");
            try
            {
                a=sc.nextInt();
            }
            catch(Exception e)
            {
                System.out.println("Неправильный ввод. Завершение программы.");
                System.exit(1);
            }
            ammount=a;


            System.out.println();

            System.out.print("Введите параметр n:");
            try
            {
                a=sc.nextInt();
            }
            catch(Exception e)
            {
                System.out.println("Неправильный ввод. Завершение программы.");
                System.exit(1);
            }
            n=a;


            
        }*/
        
        
        int ammount=5;
        int n=5;
        
        
        for(int i=0;i<ammount;i++)
        {
            System.out.println("Поток номер "+i);

            try 
            {
                new ThreadPool(n).join();
            } 
            catch (InterruptedException ex) 
            {
                Logger.getLogger(Third_Task_Threads_Pool.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        
        
        System.out.println("Главный поток закончил работу: "+new Date());
        // TODO code application logic here
    }
    
}
