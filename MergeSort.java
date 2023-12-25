public class MergeSort 
{
    public static void mergeSort(int arr[],int left,int right)
    {
        if(left<right)
        {
            int mid = (left+right)/2;
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);
            merge(arr,left,mid,right);
        }
    }

    public static void merge(int[] brr,int l,int m,int r)
    {
        int n1 = m-l+1;
        int n2 = r-m;

        int lrr[] = new int[n1];
        int rrr[] = new int[n2];

        for(int i=0; i<n1; i++)
        {
           lrr[i] = brr[l+i];
        }

        for(int i=0; i<n2; i++)
        {
            rrr[i] = brr[m+1+i];
        }


        int i=0;
        int j=0;
        int k=l;

       while(i<n1 && j<n2)
       {
           if(lrr[i] <= rrr[j])
           {
              brr[k++] = lrr[i++];
           }
           else
           {
             brr[k++] = rrr[j++];
           }
       }

       while(i<n1)
       {
         brr[k++] = lrr[i++];
       }

        while(j<n2)
       {
         brr[k++] = rrr[j++];
       }

    }
    public static void main(String[] args) 
    {
        int arr[] = {3,5,1,2,4,6};

        for(int x:arr)
        {
            System.out.print(" "+x+" ");
        }
        System.out.println("\n");
        mergeSort(arr,0,5);
        for(int x:arr)
        {
            System.out.print(" "+x+" ");
        }
         System.out.println("\n");
    }
}
