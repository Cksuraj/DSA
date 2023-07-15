class Solution {
    // Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer> s, int sizeOfStack) {
        // code here

        // here we are using axuilary stack to stroe the stack elment

        ArrayDeque<Integer> temp = new ArrayDeque<>();

        // storing the mid
        int mid = sizeOfStack / 2;

        // initialy i=0 , due to the give condtion 1-based indexing
        int i = 0;

        while (!s.isEmpty()) {
            temp.push(s.pop());
            i++;

            // if found then simply remove not adding in temp
            if (mid == i)
                s.pop();
        }

        while (!temp.isEmpty())
            s.push(temp.pop());
    }
}
