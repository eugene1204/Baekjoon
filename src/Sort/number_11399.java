package Sort;

import java.util.Arrays;
import java.util.Scanner;

public class number_11399 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0, sum =0, n;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		int array[] = new int[n];
		
		for (int a=0; a<n; a++) {
			array[a] = in.nextInt();
		}
		
		Arrays.sort(array);
		
		for(int i =0; i<array.length; i++) {
			num = array[i]+num;
			System.out.println(array[i]);
			sum = num + sum;
		}
		
		System.out.println(sum);
		

	}

}
