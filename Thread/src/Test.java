
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grades grades1 = new Grades("IS",85);
		Grades grades2 = new Grades("CS",50);
		Grades grades3 = new Grades("IT",55);
		
		new printThread("Nurhan", "nou@gmail",24, "HU", "01000006403",grades1);
		new printThread("Nurhan Elchiaty", "nouza@gmail",23, "CS", "0100000640333",grades2);
		new printThread("nourhan elchiaty", "nou@vodafone",25, "GUC", "010000000006403",grades3);
	}

}
