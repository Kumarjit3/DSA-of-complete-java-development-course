import java.util.ArrayList;

public class QuickSort 
{

    public static void Qsort(ArrayList<Integer> list,int low,int heigh)
    {
        if(low<heigh)
        {
           int pivot = Partition(list,low,heigh);
           Qsort(list,low,pivot-1);
           Qsort(list,pivot+1,heigh);
        }
    }

    private static int Partition(ArrayList<Integer> list,int low,int heigh)
    {
         int pivot = list.get(heigh);
         int i=low-1;

         for(int j=low; j<heigh; j++)
         {
            if(list.get(j) < pivot)
            {
                i++;
                int temp=list.get(i);
                list.set(i,list.get(j));
                list.set(j,temp);
            }
         }
          int t=list.get(i+1);
          list.set(i+1,list.get(heigh));
          list.set(heigh,t);
          return i+1;
    }
    public static void main(String[] args) 
    {
        ArrayList<Integer> arr = new ArrayList<>();

         arr.add(100);
         arr.add(10);
         arr.add(40);
         arr.add(80);
         arr.add(60);
         arr.add(20);
         arr.add(90);
         arr.add(70);
         arr.add(50);
         arr.add(30);

         System.out.print("\nBefore Sorting : "+arr+"\n\n");

         Qsort(arr,0,arr.size()-1);

          System.out.print("\nAfter Sorting : "+arr+"\n\n\n");
    }
}
