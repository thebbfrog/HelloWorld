package bbpractice;

import java.util.Arrays;

public class P70016 {
	
	public static void swap(int[] x, int left, int right) {
		int tmp = x[left];
		x[left] = x[right];
		x[right] = tmp;
	}
	
	public static void qsort(int[] x, int left, int right) {
		if (right <= left) {
			return;
		}
		
		// use first element as pivot
		int pivot = x[left];
		
		// move all elements less than pivot to left
		int mid = left + 1;
		for (int i = left + 1; i <= right; ++i) {
			if (x[i] < pivot) {
				swap(x, mid, i);
				++mid;
			}
		}
		// now mid is starting point of second half
		qsort(x, left+1, mid - 1);
		qsort(x, mid, right);
		
		for (int i = left; i <= mid - 2; ++i) {
			x[i] = x[i + 1];
		}
		x[mid-1] = pivot;
	}
	public static int fib(int i){
			if(i==0 || i ==1){
				return 1;
			}
			return fib(i-1) + fib(i-2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Arrays.sort(x);//数组排序
		int[] x = {3, 5, 1, 6, 2};
		// quick sort
		// 1. pick a pivot e.g. 3
		// 2. group the numbers into two groups
		//   * smaller than pivot
		//   * bigger than or equal to pivot
		//   3 1 2 6 5: mid = index 3
		// 3. do the same thing to 1 2 -- 1 2
		// 4. do the same thing to 6 5 -- 5 6
		//   recursion:
		//       * call self to do the same thing
		//       * size be smaller
		//       * exit condition
		// 5. assume 3 and 4 are done -- 3 1 2 5 6: mid = index 3
		// 6. move 1 2 one position to left 1 2 2 5 6: pivot = 3
		// 7. move 3 to mid - 1
		
		// poker: insertion sort
		
		
		qsort(x, 0, x.length-1);
		System.out.println(Arrays.toString(x));
		System.out.println(fib(5));

	}

}
