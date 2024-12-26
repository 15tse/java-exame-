package practicingarea;

public class Control {
	public static void main(String[] args) {
		//if condition example for control statements in java 
		int age=14;
		if (age >=18) {
			System.out.println("it is able to vote ");
		} else {
			System.out.println("underage ");
		}
		//if else  condition example for control statements in java 
		int point=48;
		if (point > 50) {
			System.out.println("student pass the exam");//code run if the condition is true
		} else {
		
			System.out.println("student fale the exame ");//code run if the condition is false 
		}
		
		//if else if (we use this for multiple conditions )
		int score=58;
		if (score >= 90) {
			System.out.println("Grade = A ");
		} else if(score >70 && score<90 ) {
			System.out.println("Grade B");
		}else if(score >60 && score<70 ) {
			System.out.println("Grade C");
		}else if(score >50 && score<60 ) {
			System.out.println("Grade D");
		}else  {
			System.out.println("Grade F");
		}
	//switch statement (to test for different value )
		int day=6;
		switch(day) {
		case 1:day=1;
			System.out.println("Monday");
		break;
		case 2:day=1;
		System.out.println("thusday");
	break;
		case 3:day=1;
		System.out.println("wednsday");
	break;
		case 4:day=1;
		System.out.println("thursday");
	break;
		case 5:day=1;
		System.out.println("friday");
	break;
		case 6:day=1;
		System.out.println("saturday");
	break;
		case 7:day=1;
		System.out.println("sunday");
	break;
		
		}
	}

}
