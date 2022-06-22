package number_1000;
import java.util.Scanner;

public class number_1002 {

	public static void main(String[] args) {
		// 교점을 묻는 문제임 
		int x1,x2,y1,y2,r1,r2; 
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		while(T-- >0) {
			x1 = in.nextInt();
			y1 = in.nextInt();
			r1 = in.nextInt();
			
			x2 = in.nextInt();
			y2 = in.nextInt();
			r2 = in.nextInt();
			
			System.out.println(tangent_point(x1, y1, r1, x2, y2, r2));
			
		}
		
		
		
	}
	public static int tangent_point(int x1, int y1, int r1, int x2, int y2, int r2) {
		int distance = (int)(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		int r1r2_plus = (int)Math.pow(r1 + r2, 2);
		int r1r2_minus = (int)Math.pow(r1- r2, 2);
		
		if(x1 == x2 && y1 == y2 && r1 == r2) {
			return -1;
		}else if (distance > r1r2_plus || distance < r1r2_minus) {
			return 0;
		}else if(distance == r1r2_plus || distance == r1r2_minus ) {
			return 1;
		}else {
			return 2;
		}
		
	}

}
