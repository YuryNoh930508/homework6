package homework6;
import java.util.*;

public class StudentScore {
	private int[][] scoreArr;
	private int s_arrRowLen;
	private int s_arrColLen;
	
	void init() {
		scoreArr = new int[5][3];
		s_arrRowLen = scoreArr.length;
		s_arrColLen = scoreArr[0].length;
		this.input();
		this.print();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("5명의 국어, 영어, 수학 점수를 입력하면 과목 별 총점 및 평균을 구합니다!");
		System.out.println("===================================================");
		
		for(int i=0;i<s_arrRowLen;i++) {
			System.out.print(String.format("%02d", i+1) + "번 학생 국어, 영어, 수학: ");
			
			for(int j=0;j<s_arrColLen;j++) {
				if(s.hasNextInt())
					scoreArr[i][j] = s.nextInt();
				else
					return;
			}
		}
		
		System.out.print("\n");
	}
	void print() {
		String[] className = {"국어", "영어", "수학"};
		int[] studentSum = new int[s_arrColLen]; //column length = class count
		int[] classSum = new int[s_arrRowLen];   //row length = student count
		
		for(int i=0;i<s_arrRowLen;i++) {
			for(int j=0;j<s_arrColLen;j++) {
				studentSum[i] = scoreArr[i][j];
				classSum[j]   = scoreArr[i][j];
			}
		}
		
		for(int i=0;i<s_arrColLen;i++) {
			double classAvg = classSum[i]/(double)s_arrRowLen;
			System.out.println(className[i] + "총점은 " + classSum[i] +"점이고, 평균은 " + String.format("%.1f", classAvg) + "입니다.");
		}
		
		System.out.print("\n");
		
		for(int i=0;i<s_arrRowLen;i++) {
			double studentAvg = studentSum[i]/(double)s_arrColLen;
			System.out.println(String.format("%02d", i+1) + "번 학생의 총점은 " + studentSum[i] +"점이고, 평균은 " + String.format("%.1f", studentAvg) + "입니다.");
		}
		
		System.out.print("\n");
	}
}