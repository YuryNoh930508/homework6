package homework6;
import java.util.*;

public class AptPersonScore {
	private int[][] aptArr;
	private int aptLevelLen;
	private int aptLineLen;
	
	void init() {
		aptArr = new int[5][3];
		aptLevelLen = aptArr.length;
		aptLineLen = aptArr[0].length;
		this.input();
		this.print();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("5층 아파트의 거주자 인원을 입력하면 거주자 현황을 출력합니다!");
		System.out.println("===========================================");
		
		for(int i=0;i<aptLevelLen;i++) {
			for(int j=0;j<aptLineLen;j++) {
				System.out.print((i+1) + "0" + (j+1) +"호에 살고 있는 사람의 숫자 : ");
				if(s.hasNextInt())
					aptArr[i][j] = s.nextInt();
				else
					return;
			}
		}
		
		System.out.print("\n");
	}
	void print() {
		int[] levelSum = new int[aptLevelLen]; //aptLevelLen == level count
		int[] lineSum  = new int[aptLineLen];  //aptLineLen == line count
		int totalSum = 0;
		
		for(int i=0;i<aptLevelLen;i++) {
			for(int j=0;j<aptLineLen;j++) {
				levelSum[i] += aptArr[i][j];
				lineSum[j]  += aptArr[i][j];
			}
			
			totalSum += levelSum[i];
		}
		
		System.out.println("이 아파트의 거주자는 모두 " + totalSum + "명입니다. \n");
		
		for(int i=0;i<aptLevelLen;i++)
			System.out.println((i+1)+"층에 사는 거주자는 모두 " + String.format("%02d", levelSum[i]) +"명입니다.");
		
		System.out.print("\n");
		
		for(int i=0;i<aptLineLen;i++)
			System.out.println((i+1)+"호 라인에 사는 거주자는 모두 " + String.format("%02d", lineSum[i]) +"명입니다.");
		
		System.out.print("\n");
	}
}
