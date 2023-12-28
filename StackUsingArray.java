
class Stack 
{
    private int[] arr;
    private int size;
    private int top;
    
    public Stack(int size)
    {
        this.size = size;
        this.top = -1;
        this.arr = new int[size];
    }

    public void push(int data)
    {
       top++; 
       if(top<size)
       {
          arr[top] = data;
          System.out.print("\nPush successfull\n");
       }
       else
       {
          System.out.print("\nStack Overflow\n");
       }   
    }

    public void pop()
    {
        if(top>-1)
        {
            top--;
            System.out.print("\nPop successfull\n");
        }
        else
        {
            System.out.print("\nStack Underflow\n");
        }
    }

    public void peek()
    {
        if(top>-1)
        {
            System.out.print("\nPeek element is : "+arr[top]+"\n");
        }
        else
        {
             System.out.print("\nUnable to peek Stack is empty\n"); 
        }
    }

    public void display()
    {
        if(top==-1)
        {
            System.out.print("\nUnable to display! stack is empty\n");
        }
        else
        {
            System.out.print("\n\nINDEX   -----    Value\n");
            for(int i=0; i<=top; i++)
            {
                System.out.print("\n  "+i+"     -----     "+arr[i]+"  ");
            }
            System.out.print("\n\n");
        }
    }

}


public class StackUsingArray 
{
    public static void main(String[] args) 
    {
        Stack s1 = new Stack(10);
        s1.display();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.display();
        s1.peek();
        s1.pop();
        s1.display();
    }
}
