/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first_task_array_shuffle;






/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */

import java.util.Random;
import java.util.*;



class TaskOne
{
   
    final static  private int size=16;
    private static List arr;
    private static int[] positions;
    
    
   
     
    
    
    
    
    
    
    
    
    
    
    public TaskOne()
    {
        arr=new ArrayList();
        arrayInput();
        positions=uniquePositionsGenerator(positions);
        shuffle(arr);
    }
    
    
    
    public static boolean Test()
    {
       arr=new ArrayList();
       
       arr.add(1);
       arr.add(2);
       arr.add(3);
       arr.add(4);
       arr.add(5);
       arr.add(6);
       arr.add(7);
       arr.add(8);
       arr.add(9);
       arr.add(10);
       arr.add(11);
       arr.add(12);
       arr.add(13);
       arr.add(14);
       arr.add(15);
       arr.add(16);
       
       positions=uniquePositionsGenerator(positions);
       shuffle(arr);
        
        
       arr=new ArrayList();
       
       arr.add(1);
       arr.add(22);
       arr.add(34);
       arr.add(564);
       arr.add(533);
       arr.add(698);
       arr.add(700);
       arr.add(82);
       arr.add(90);
       arr.add(101);
       arr.add(11);
       arr.add(134);
       arr.add(134);
       arr.add(144);
       arr.add(15);
       arr.add(16);
       
       positions=uniquePositionsGenerator(positions);
       shuffle(arr);
        
        
       arr=new ArrayList();
       
       arr.add(45);
       arr.add(241);
       arr.add(390);
       arr.add(400);
       arr.add(51);
       arr.add(6);
       arr.add(1);
       arr.add(8);
       arr.add(9);
       arr.add(987);
       arr.add(555);
       arr.add(12);
       arr.add(13);
       arr.add(14);
       arr.add(15);
       arr.add(167);
       
       positions=uniquePositionsGenerator(positions);
       shuffle(arr);
        
        return true;
    }
    
    
    private void arrayInput()
    {
        int cur=0;
        int p=0;
        
            
            
        
            for(int i=0;i<16;i++)
            {
                System.out.println("Размер массива - 16 ячеек.");
                System.out.print("Введите "+(cur+1)+" элемент:");
                Scanner sc=new Scanner(System.in);
                String st=sc.next();
                try
                {
                    p=Integer.parseInt(st);
                }
                catch(Exception e)
                {
                    System.out.println("Ошибка ввода. Исключительная ситуация. Аварийное завершение.");
                    System.exit(1);
                }
                cur++;
                arr.add(p);
                 

            }
        
       
        
    }
    
    
    
    
   
    
    
    
    private static void shuffle(List arr)
    {
        
        
       System.out.println();
       System.out.println("Введенный массив до изменений:");
       for(int i=0;i<size;i++)
       {
           System.out.print(arr.get(i)+" ");
           if((i+1)%4==0)
           {
               System.out.println();
           }

       } 
        
        
        
       
       List nums=new ArrayList();
       
       
       for(int i=0;i<positions.length;i++)
       {
           nums.add(arr.get(positions[i]));
       }
       
       
       Collections.shuffle(nums);
       
       
       for(int i=0;i<positions.length;i++)
       {
           arr.set(positions[i], nums.get(i));
       }
       
       
       
       
       System.out.println();
       System.out.println("Введенный массив после изменений:");
       for(int i=0;i<size;i++)
       {
           System.out.print(arr.get(i)+" ");
           if((i+1)%4==0)
           {
               System.out.println();
           }

       }
       
        
    }
    
    
    
    private static int[] uniquePositionsGenerator(int[]  arr)   
    {
        int sort_size=4;
        arr=new int[sort_size];
        int max=size-1;
        int min=0;
        
        
      
        
        
        while(true)
        {
            boolean ex_flag=true;
            for(int i=0;i<sort_size;i++)
            {
               arr[i]=(min+(int)(Math.random()*max));
            }
            
            for(int i=0;i<arr.length;i++)
            {
                for(int j=0;j<arr.length;j++)
                {
                    if((arr[i]==arr[j])&&(i!=j))
                    {
                        ex_flag=false;
                        arr[i]=(min+(int)(Math.random()*max));
                    }
                }
            }
                
            if(ex_flag==true)
            {
                break;
            }
            
        }
        
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
            if((i+1)%4==0)
            {
                System.out.println();
            }
        }
        
        
        return arr;
        
    }
    
   
}


public class First_Task_Array_Shuffle 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        TaskOne T=new TaskOne();
       
        // TODO code application logic here
    }
    
}
