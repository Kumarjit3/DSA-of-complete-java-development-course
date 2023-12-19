import java.util.ArrayList;

public class RecursiveBinarySearch 
{
    public static int BinarySearch(ArrayList<Integer> list,int target,int start,int end)
    {
        if(start<=end)
        {
            int mid = ((start+end)/2);
            if(list.get(mid) == target)
            {
                return list.indexOf(target);
            }
            else if(list.get(mid) > target)
            {
                return BinarySearch(list,target,start,mid-1);
            }
            else
            {
                return BinarySearch(list,target,mid+1,end);
            }
        }
         return -1;
    }
    public static void main(String[] args)
    {
           
            ArrayList<Integer> arr = new ArrayList<>();

            arr.add(10);
            arr.add(20);
            arr.add(30);
            arr.add(40);
            arr.add(50);
            arr.add(60);
            arr.add(70);

            System.out.print("\n"+arr+"\n");

            int result = BinarySearch(arr,700,0,arr.size()-1);

            if(result == -1)
            {
                System.out.print("\nItem not found\n");
            }
            else
            {
                System.out.print("\nItem found at : "+result+" index\n\n");
            }
    }
}
