
class Node
{
    int Data;
    Node Next;
    public Node(int Data)
    {
        this.Data = Data;
        this.Next = null;
    }
}

class Stack
{
    private Node top=null;
    private Node start=null;

    public void Push(int data)
    {
         Node n1 = new Node(data);
        if(top == null && start == null)
        {
            top = n1;
            start = n1;
        }
        else
        {
            Node t = top;
            t.Next = n1;
            top = n1;
        }
    }

    public void Pop()
    {
        Node t = start;

        if(top == null)
        {
            System.out.print("\nStack Underflow\n");
        }
        else
        {
            while(t!=null) 
            {    
                if(t.Next == top)
                {
                    top = t;
                    top.Next = null;
                    t=null;
                }
                else if(t.Next == null)
                {
                    t = null;
                    top = null;
                    start = null;
                }
                else
                {
                    t=t.Next;
                }
            }
            
        }
    }

    public void Peek()
    {
        if(start == null && top == null)
        {
            System.out.print("\nUnable to peek Stack is empty\n"); 
        }
        else
        {
            System.out.print("\nPeek element is : "+top.Data+"\n");
        }
    }

    public void display()
    {
        if(top == null)
        {
            System.out.print("\nUnable to display! stack is empty\n");
        }
        else
        {
            System.out.print("\n\n");
            Node t = start;
            while(t!=top)
            {
                System.out.print("\n "+t.Data+" ");
                t=t.Next;
            }
            System.out.print("\n "+t.Data+" ");
            System.out.print("\n\n");
        }
    }
}


public class StackUsingLinkedList 
{
    public static void main(String[] args)
    {
        Stack s1 = new Stack();
        s1.display();
        s1.Push(10);
        s1.Push(30);
        s1.Push(40);
        s1.display();
        s1.Pop();
        s1.Peek();
        s1.Pop();
        s1.display();
    }
}
