package homework6;
import java.util.*;

public class OnlyNumber {
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
		
		System.out.println("1~100사이의 서로 다른 숫자를 입력하면 정렬하여 출력합니다!");
		System.out.println("==========================================");
		
		for(int i=0;i<arrLen;) {
			int tempReg;
			boolean found = false;
			
			System.out.print(String.format("%02d", i+1) + "번째 숫자: ");
			
			if(s.hasNextInt())
				tempReg = s.nextInt();
			else
				return;
				
			for(int j=0;j<i;j++) {
				if(tempReg == numArr[j]) {
					found = true;
					break;
				}
			}
			
			if(!found && tempReg >=1 && tempReg <= 100)
				numArr[i++] = tempReg;
			else
				System.out.println("잘못 입력하였습니다. 다시 입력하세요");
		}
		
		System.out.print("\n");
	}
	void print() {
		for (int i=(arrLen-1);i>=0;i--) {
			for (int j=1;j<=i;j++) {
				if (numArr[j-1]>numArr[j]) {
					int temp = numArr[j-1];
					numArr[j-1] = numArr[j];
					numArr[j] = temp;
				} 
			}
		
			System.out.println(String.format("%02d", i+1) + "번째 숫자는 " + numArr[i] +"입니다.");
		}
		
		System.out.print("\n");
	}
}
