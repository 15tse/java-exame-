package array;

import java.util.Arrays;

public class rotation {
	public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};// [3,4,5,1,2]
        int rotations = 2;

        rotations = rotations % arr.length; // handle cases where rotations > arr.length

        for (int i = 0; i < rotations; i++) {
            int temp = arr[0];//1 => 2

            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];//3,4,5,1,1
            }

            arr[arr.length - 1] = temp;//2,3,4,5,1//3,4,5,1,2
        }
            System.out.print(Arrays.toString(arr));
        
    }


	   
	}


// {1,2,3,4,5} =[0,1,2,3,4]
 // temp=arr[0]= 1;
//  arr[0]=arr[1]=2
//  arr[4]=temp=1 =>[2,3,4,5,1]

//temp=arr[0]=2
//arr[1]=arr[2]=4
//arr[4]=temp=2 =>[3,4,5,1,2]