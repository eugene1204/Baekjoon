package Sort;

import java.util.Scanner;

public class numer_2750 {

	public static void main(String[] args) {
		int i, j, index=0, temp,num;
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		int array[] = new int[num];
		
		for (int a=0; a<num; a++) {
			array[a] = in.nextInt();
		}
		
		int arr = array.length;
		
		for(i=0;i<arr; i++) {
			int min = 1000;
			for(j=i;j<arr;j++) {
				if(min>array[j]) {
					min = array[j];
					index = j;
				}
			}
			temp = array[i];
			array[i]= array[index];
			array[index] = temp;
			
		}
		System.out.println("");
		for(i =0; i<arr;i++) {
			System.out.println(array[i]);
	}

}
}
