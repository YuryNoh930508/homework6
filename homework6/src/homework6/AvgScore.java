package homework6;
import java.util.*;

public class AvgScore {
	private double[] scoreArr;
	private int arrLen;
	
	void init() {
		scoreArr = new double[10];
		arrLen = scoreArr.length;
		this.input();
		this.print();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("10개의 점수를 입력받아 가장 큰 수와 가장 작은 수를 제외한 평균을 구합니다!");
		System.out.println("====================================================");
		
		for(int i=0;i<arrLen;i++) {
			System.out.print(String.format("%02d", i+1) + "번 심사점수 입력: ");
			
			if(s.hasNextDouble())
				scoreArr[i] = s.nextDouble();
			else 
				return;
		}
		
		System.out.print("\n");
	}
	void print() {
		double avgScore = 0.0;
		
		for (int i=(arrLen-1);i>=0;i--) {
			for (int j=1;j<=i;j++) {
				if (scoreArr[j-1]>scoreArr[j]) {
					double temp = scoreArr[j-1];
					scoreArr[j-1] = scoreArr[j];
					scoreArr[j] = temp;
				} 
			} 
		}
		
		for(int i=1;i<(arrLen-1);i++)
			avgScore += scoreArr[i];
		
		avgScore = avgScore/8.0;
		
		System.out.println("가장 큰 점수와 가장 작은 점수를 제외한 8개의 점수 평균은 " + avgScore + "입니다. \n");
	}
}
