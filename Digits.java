import   java.util.ArrayList;

public class Digits

{
 
    
   private ArrayList<Integer> digitList;    
 


    
   public Digits(int num)
   {
       digitList = new ArrayList<Integer>();
       int  x=num;
       
       if (num==0)
           digitList.add(new Integer (0));
       else   
       {
           while (num>0)
           {
               digitList.add(0,new Integer(num%10));
               num = num/10;
            }
       }
        System.out.println(digitList);
    }

    public boolean isStrictlyIncreasing()
    {
        int x=0;
        
        for (int i=0 ; i<digitList.size();i++)
        {
            if (digitList.get(i).intValue() < digitList.get(i+1))
            {
                x++;
            }
        }
        
        if (x == digitList.size())
            return true;
            
        return false;
    }
  
}