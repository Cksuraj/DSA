class twoStacks
{
    int arr[];
    int size;
    int top1, top2;
    twoStacks()
    {
        size = 100; 
        arr = new int[100]; 
        top1 = -1; 
        top2 = size;
    }
    
    //Function to push an integer into the stack1.
    void push1(int x)
    {
        arr[++top1] = x;
     
    }
    void push2(int x)
    {
       arr[--top2] = x;
    }
    
    // removeing an element from stack1.
    
    int pop1()
    { 
        if(top1 == -1){
            return top1;
        } else{
            return arr[top1--];
        }
    }
    
    //remove an element from stack2.
    
    int pop2()
    {
        if(top2 == size){
            return -1;
        } else{
            return arr[top2++];
        }
    }
}
