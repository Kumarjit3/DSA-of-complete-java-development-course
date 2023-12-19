import java.util.ArrayList;

public class InsertionSort 
{
    public static void Isort(ArrayList<Integer> list)  //my logic
    {
        for(int i=1; i<list.size(); i++)
        {
            int temp=list.get(i); 
            int index=i;
            for(int j=i-1; j>=0; j--)
            {
                if(temp < list.get(j))
                {
                    index--; 
                    list.set(j+1,list.get(j));
                }
            }
            list.set(index,temp);
            System.out.print("\nIn Sorting : "+list+"\n");
        }
    } 


    public static void IIsort(ArrayList<Integer> list)  //Logic of Navin sir
    {
        for(int i=1; i<list.size(); i++)
        {
            int temp=list.get(i); 
            int j=i-1;
            while(j>=0 && list.get(j) > temp)
            {
                list.set(j+1,list.get(j));
                j=j-1;
            }
             list.set(j+1,temp);
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

         IIsort(arr);

          System.out.print("\nAfter Sorting : "+arr+"\n\n\n");
    }
}
