import java.util.ArrayList;

public class SelectionSort 
{
    public static void Ssort(ArrayList<Integer> list)
    {
        for(int i=0; i<list.size()-1; i++)
        {
            int item = i;
            for(int j=i+1; j<list.size(); j++)
            {
                if(list.get(j) < list.get(item))
                {   
                    item = j;
                }
            }
                int temp = list.get(i);
                list.set(i, list.get(item));
                list.set(item,temp);
                System.out.print("\nIn Sorting : "+list+"\n");
        }
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

         Ssort(arr);

          System.out.print("\nAfter Sorting : "+arr+"\n\n\n");
    }
}
