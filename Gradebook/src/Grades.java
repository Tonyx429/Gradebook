
public class Grades {
	public static void main(String[] args) {
	
		System.out.println("My Gradebook (UIC)");
		String courses[][] = {{"ASAM 125 - ", "ECE 115 - ", "MATH 181 - ", "ENGL 160 - ", "ANTH 100 - ", "ENGL 161 - ", "MATH 210 - ", "CHEM 112 - ", "PHYS 141 - "}, {"A", "A", "B", "B", "A", "B", "A", "A","B"}};
		
		display(courses);

	}	
	

	public static void display(String[][] courses) {
		for(int column=0; column<9; column++){
			for(int row=0; row<courses.length; row++){
				System.out.print(courses[row][column]);
			}
			System.out.println();
		}
		
	}

	

}
