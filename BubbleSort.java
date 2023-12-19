import java.util.ArrayList;

public class BubbleSort 
{
    public static void Bsort(ArrayList<Integer> list)
    {
        for(int i=0; i<list.size()-1; i++)
        {
            for(int j=i+1; j<list.size(); j++)
            {
                if(list.get(i) > list.get(j))
                {   
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j,temp);
                    System.out.print("\nIn Sorting : "+list+"\n");
                }
            }
        }
    }
    public static void main(String[] args)
    {
         ArrayList<Integer> arr = new ArrayList<>();

         arr.add(20);
         arr.add(30);
         arr.add(10);
         arr.add(40);
         arr.add(80);
         arr.add(60);
         arr.add(90);
         arr.add(70);
         arr.add(50);

         System.out.print("\nBefore Sorting : "+arr+"\n\n");

         Bsort(arr);

          System.out.print("\nAfter Sorting : "+arr+"\n\n\n");
    }

}
