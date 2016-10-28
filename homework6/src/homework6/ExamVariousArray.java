package homework6;
import java.util.*;

public class ExamVariousArray {
	public static void main(String[] args) {
		int selectedModule = 0;
		
		Scanner s = new Scanner(System.in);
		
	    do{	    	
	    	System.out.println("1. 두번째로 큰 수 찾기");
	    	System.out.println("2. 심사 점수 계산");
	    	System.out.println("3. 학생 총점, 평균값 구하기");
	    	System.out.println("4. 5층 아파트의 거주자 숫자 구하기");
	    	System.out.println("5. 겹치지 않는 숫자 10개입력받기");
	    	System.out.println("6. 종료하기");
	    	System.out.print("원하는 메뉴는>> ");
	    	
	    	if(s.hasNextInt())
	    		selectedModule = s.nextInt();
	    	else
	    		continue;
	    	
	    	System.out.print("\n");
	    	
	    	switch(selectedModule) {
	    		case 1: 
	    			new SecondMax().init();
	    			break;
	    		case 2:
	    			new AvgScore().init();
	    			break;
	    		case 3:
	    			new StudentScore().init();
	    			break;
	    		case 4:
	    			new AptPersonScore().init();
	    			break;
	    		case 5:
	    			new OnlyNumber().init();
	    			break;
	    	}
	    		
	    } while(selectedModule!=6);
	    
	    System.out.println("종료하셨습니다.");
	}
}
