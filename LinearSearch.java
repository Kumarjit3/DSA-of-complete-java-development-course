import java.util.ArrayList;

public class LinearSearch 
{
	
   public static int LSearch(ArrayList<Integer> list,int target)
   {
	   int start=0,end=list.size()-1;
	   
	   while(start<=end)
	   {
		   if(list.get(start) == target)
		   {
			   return list.indexOf(target);
		   }
		   else
		   {
			   start++;
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
   	
   	int result = LSearch(arr,19);

   	if(result != -1)
   	{
   	   System.out.print("\nItem found at index : "+result+"\n\n");
   	}
   	else
   	{
   		System.out.print("\nItem not found\n\n");
   	}  
   }
}
