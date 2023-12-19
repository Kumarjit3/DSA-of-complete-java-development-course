import java.util.ArrayList;

public class BinarySearch 
{
	public static int BSearch(ArrayList<Integer> list,int target)
	{
		int start=0,end=0,mid=0;
		end=list.size();
		mid=((start+end)/2);
		
		while(start<=end)
		{
			if(list.get(mid) == target)
			{
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
    	
    	System.out.print("\n"+BSearch(arr,12)+"\n\n");
    }
}