
class Node
{
    int data;
    Node next;

     public Node(int data)
    {
        this.data=data;
        next = null;
    }  
}

class linkedlist
{
     Node head = null;
     Node current = null;
     public void add(int i)
     {
        Node n1 = new Node(i);
        if(head == null)
        {    
            head = n1;
            current = head;
        }
        else
        {
             while(current.next != null)
             {
                current = current.next;
             }
             current.next = n1;
        }
     }

     public void addFirst(int i)
     {
        Node n1 = new Node(i);
        n1.next = head;
        head = n1;
     }

     public void addLast(int i)
     {
        Node n1 = new Node(i);
        while(current.next != null)
        {
           current = current.next;
        }
        current.next = n1;
     }

     public void addAfter(int a,int i)
     {
        int flag = 0;
        Node n1 = new Node(i);
        Node t = head;
        while(t!=null)
        {
             if(t.data == a)
             {
                flag = 1;
                Node tt = t.next;
                t.next = n1;
                n1.next = tt;
             }
             t=t.next;
        }   
        if(flag == 0)
        {
            System.out.print("\n"+a+" is not found\n");
        }
    }

     public void displayAll()
     {
        Node t = head;
        while(t!=null) 
        {
             System.out.print("Data -> "+t.data+"  |  Next -> "+t.next+"\n"); 
             t=t.next;   
        }
     }

     public void delete(int n)
     {
        Node t = head;

        while(current.next!=null)
        {
            current = current.next;
        }

        if(head.data == n)
        {
            deleteFirst();
        }
        else if(current.data == n)
        {
            deleteLast();
        }
        else
        {

          while(t.next != null)
          {
              if(t.next.data == n)
              {
                  t.next = t.next.next;
              }
              t=t.next;
          }
       }
     }

     public void deleteFirst()
     {
        Node t = head.next;
        head = t;
     }

     public void deleteLast()
     {
        Node t = head;

        while(t.next.next != null)
        {
            t=t.next;
        }
        t.next=null;
     }

     public void deleteAfter(int a)
     {
        int flag=0;
         Node t = head;
        while(t.next != null)
        {
            if(t.data == a)
            {
                flag=1;
                t.next = t.next.next;
            }
            t=t.next;
        }

        if(flag == 0)
        {
             System.out.print("\n"+a+" is not found\n");
        }
     }

     public boolean search(int m)
     {
        Node t = head;

        while(t.next != null)
        {
            if(t.data == m)
            {
                return true;
            }
            t = t.next;
        }
        if(t.data == m)
        return true;
        else
        return false;
     }
}


public class SLL 
{
    public static void main(String[] args)
    {
         linkedlist l1 = new linkedlist();

         System.out.print("\n\n");
         l1.add(10);
         l1.add(20);
         l1.add(30);
         l1.addFirst(5);
         l1.addLast(40);
         l1.addAfter(20,25);
         l1.addAfter(5, 7);
         l1.addAfter(7, 9);
         System.out.print("\n\n");
         l1.displayAll();
         System.out.print("\n\n");
         l1.delete(40);
         l1.displayAll();
         System.out.print("\n"+l1.search(25));
         System.out.print("\n"+l1.search(20));
         System.out.print("\n\n");
    }
}


