package leetcode_qs;

import java.util.PriorityQueue;

public class KthLargestElement {
    public static int kthLargest(int[] arr, int K){
        // Min heap - stores K largest elements
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int val:arr){
            // Add current element to min heap
            priorityQueue.add(val);
            // If heap size exceeds K, remove smallest element
            if(priorityQueue.size()>K){
                priorityQueue.poll();
            }
        }

        // Top of the heap is the K th large element
        return priorityQueue.peek();
    }

    public static void main(String[] args) {
        int[] arr = {12, 3, 5, 7, 19};
        int K = 2;
        System.out.println(kthLargest(arr, K));
    }

}
