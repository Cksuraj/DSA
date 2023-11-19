//{ Driver Code Starts
    import java.io.*;
    import java.util.*;
    class Node 
    {
        int data;
        Node next;
        
        Node(int a)
            {
                data = a;
                next = null;
            }
    }
    class GfG
    {
        static Scanner sc = new Scanner(System.in);
        public static Node inputList(int size)
        {
            Node head, tail;
            int val;
            
            val = sc.nextInt();
            
            head = tail = new Node(val);
            
            size--;
            
            while(size-->0)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            return head;
        }
        
        public static void printList(Node n)
        {
            while(n!=null)
            {
                System.out.print(n.data + " ");
                n = n.next;
            }
        }
        
        public static void main(String args[])
            {
                
                int t = sc.nextInt();
                while(t-->0)
                    {
                        int n , m;
                        
                        n = sc.nextInt();
                        m = sc.nextInt();
                        
                        Node head1 = inputList(n);
                        Node head2 = inputList(m);
                        
                        Solution obj = new Solution();
                        
                        Node result = obj.findIntersection(head1, head2);
            
                        printList(result);
                        System.out.println();
                    }
            }
    }
    // } Driver Code Ends
    
    
    /* Node of a linked list
     class Node {
       int data;
        Node next;
        Node(int d)  { data = d;  next = null; }
    }
    */
    
    class Solution
    {
       public static Node findIntersection(Node h1, Node h2)
        {
            Node curr = null;
            Node res = null;
            HashMap<Integer, Integer> map = new HashMap<>();
        
            while (h1 != null) {
                map.put(h1.data,  map.getOrDefault(h1.data, 0)+ 1);
                h1 = h1.next;
            }
            
            // checking for h2
            
            while (h2 != null) {
                if (map.containsKey(h2.data) && map.get(h2.data) > 0) {
                    map.put(h2.data, map.get(h2.data)- 1);
                    if (res == null) {
                        res = new Node(h2.data);
                        curr = res;
                    } 
                    else
                    {
                        curr.next = new Node(h2.data);
                        curr = curr.next;
                    }
                }
                
                h2 = h2.next;
            }
    
            return res;
        }
    }