package homework6;
import java.util.*;

public class SecondMax {
	private int[] numArr;
	private int arrLen;
	
	void init() {
		numArr = new int[10];
		arrLen = numArr.length;
		this.input();
		this.print();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("10개의 숫자를 입력하시면 두 번째로 큰 수를 출력합니다!");
		System.out.println("=======================================");
		
		for(int i=0;i<arrLen;i++) {
			System.out.print(String.format("%02d", i+1) + "번째 수를 입력하시오: ");
			
			if(s.hasNextInt())
				numArr[i] = s.nextInt();
			else
				return;
		}
		
		System.out.print("\n");
	}
	void print() {
		int maxNumber = Integer.MIN_VALUE;
		int secondMaxNumber = Integer.MIN_VALUE;
		int maxIndex = 0, secondMaxIndex = 0;
		
		for(int i=0;i<arrLen;i++) {
			if(numArr[i] > maxNumber) {
				secondMaxNumber = maxNumber;
				secondMaxIndex = maxIndex;
				maxNumber = numArr[i];
				maxIndex = i;
			}
			else if(numArr[i] > secondMaxNumber) {
				secondMaxNumber = numArr[i];
				secondMaxIndex = i;
			}
		}
		
		System.out.println("두 번째로 큰 수는 " + (secondMaxIndex+1) + "번째수 " + secondMaxNumber +" 입니다. \n");
	}
}