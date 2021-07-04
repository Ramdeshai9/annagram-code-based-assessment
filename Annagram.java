import java.io.*;
import java.util.*;
import java.text.*;

public class Annagram {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("enter ur frist String");
        String str1 = sc.next();
      System.out.println("enter ur second String");
        String str2 = sc.next();
   Annagram an=new Annagram();
       an.annagramDelete(str1, str2);
    }
   public void annagramDelete(String str1, String str2) 
    {
    char[]a=str1.toCharArray();
  char[]b=str2.toCharArray();
  int size=a.length;
  int size1=b.length;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int count = 0;
        int i=0;
    
       while(i!=size)
         {
            if(!map.containsKey(a[i]))
              {

                map.put( a[i], 1);
            } else {
                int oldval = map.get(a[i]);
                map.put(a[i], oldval+1);
 
            }
            i++;
        }
         int j=0;
      while(j!=size1)
         {
            if(map.containsKey(b[j]))
              {
                int val = map.get(b[j]);
                if(val == 1)
                 {
                
                map.remove(b[j]); 
                } 
              else 
                {
                 
                    map.put(b[j], val-1);
                }
            } 
              else 
             {
                count++;
            }
           j++;
        }
         
        for(int d: map.values())
         {
            count=count+d;
        }
       
 System.out.println(" Total number of character that are to be deleted from two strings to become annagram are:");
        System.out.println( count);
     }
  
   
}
