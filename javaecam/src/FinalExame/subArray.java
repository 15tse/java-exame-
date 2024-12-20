package FinalExame;

import java.util.Arrays;

public class subArray {
	 public static void main(String[] args) {
	        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
	        Result result = maxSubArraySum(nums);
	        System.out.println("Subarray with max sum: ");
	        printArray(result.subarray);
	        System.out.println("Max Sum: " + result.sum);
	    }

	    public static Result maxSubArraySum(int[] nums) {
	        int maxSum = Integer.MIN_VALUE;
	        int currentSum = 0;
	        int start = 0;
	        int end = 0;
	        int tempStart = 0;

	        for (int i = 0; i < nums.length; i++) {
	            if (currentSum < 0) {
	                currentSum = nums[i];
	                tempStart = i;
	            } else {
	                currentSum += nums[i];
	            }

	            if (currentSum > maxSum) {
	                maxSum = currentSum;
	                start = tempStart;
	                end = i;
	            }
	        }

	        int[] subarray = Arrays.copyOfRange(nums, start, end + 1);
	        return new Result(maxSum, subarray);
	    }

	    public static void printArray(int[] arr) {
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }

	    static class Result {
	        int sum;
	        int[] subarray;

	        Result(int sum, int[] subarray) {
	            this.sum = sum;
	            this.subarray = subarray;
	        }
	    }

   
}





