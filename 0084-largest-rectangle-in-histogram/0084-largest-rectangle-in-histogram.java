class Solution {
    public int largestRectangleArea(int[] arr) {
        int n = arr.length;
        int[] PSE = new int[n];  // Previous Smaller Element
        int[] NSE = new int[n];  // Next Smaller Element

        // Compute Previous Smaller Element (PSE) using a stack
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            PSE[i] = (stack.isEmpty()) ? -1 : stack.peek();
            stack.push(i);
        }

        // Compute Next Smaller Element (NSE) using a stack
        stack.clear();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            NSE[i] = (stack.isEmpty()) ? n : stack.peek();
            stack.push(i);
        }

        // Calculate the largest rectangle
        int maximum=0;
        for (int i = 0; i < n; i++) {
            maximum=Math.max(maximum,arr[i]*(NSE[i]-PSE[i]-1));
        }

        return maximum;
        
    }
}