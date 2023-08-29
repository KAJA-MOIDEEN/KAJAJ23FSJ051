package WhileLoopDemonstration;

public class NestedSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tech = 2;
		int cource =2;
		switch(tech){
		case 1:
			System.out.println("besent");
			break;
		case 2:
		switch(cource) {
		case 1:
			System.out.println("java");
			break;
		case 2:
			System.out.println("python");
			break;
			
			default :
				System.out.println("Not Listed");
			}
		}
		}
	}
