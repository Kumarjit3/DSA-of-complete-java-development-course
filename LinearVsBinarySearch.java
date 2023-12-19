import java.util.ArrayList;

public class LinearVsBinarySearch 
{
	
   public static int LSearch(ArrayList<Integer> list,int target)
   {
	   int start=0,end=list.size()-1;
       int count=0;
	   
	   while(start<=end)
	   {
           count++;
		   if(list.get(start) == target)
		   {
               System.out.print("\nSteps taken by Linear Search : "+count+"\n");
			   return list.indexOf(target);
		   }
		   else
		   {
			   start++;
		   }
	   }
	   return -1;
   }

   public static int BSearch(ArrayList<Integer> list,int target)
	{
		int start=0,end=0,mid=0;
		end=list.size();
		mid=((start+end)/2);
        int count=0;
		
		while(start<=end)
		{
            count++;
			if(list.get(mid) == target)
			{
                System.out.print("\nSteps taken by Binay Search : "+count+"\n");
				return list.indexOf(target); 
			}
			else if(target > list.get(mid))
			{
				start=mid+1;
				mid=((start+end)/2);
			}
			else
			{
				end=mid-1;
				mid=((start+end)/2);
			}
		}
		return -1;
	}
	
   public static void main(String[] args)
   {
	   ArrayList<Integer> arr = new ArrayList<Integer>();
   	
   	arr.add(3);
   	arr.add(5);
   	arr.add(7);
   	arr.add(9);
   	arr.add(12);
   	arr.add(15);
   	arr.add(19);
   	
   	System.out.print("\n"+arr+"\n");
   	
   	LSearch(arr,19);
    BSearch(arr,19);
	
   }
}

