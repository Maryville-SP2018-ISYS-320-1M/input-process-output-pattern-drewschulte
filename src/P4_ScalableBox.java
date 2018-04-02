/*
	ISYS 320
	Name(s):drew schulte
	Date: april 1 
*/

public class P4_ScalableBox {
	

	public static void main(String[] args) {
		System.out.println("Input Box width: ");
		drawBoxCap();
		drawBoxInsides();
		drawBoxCap();
	}
	
	public static void drawBoxCap() {
		System.out.print("+");
		
		for( int capDashIndex = 1; capDashIndex <= 8 - 2; capDashIndex++ ) {
			System.out.print("-");
		}
		
		System.out.println("+");
	}
	
	public static void drawBoxInsides() {
		for( int insideRowIndex = 1; insideRowIndex <= 10 - 2; insideRowIndex++ ) {
			drawBoxInsideLine();
		}
	}
	
	public static void drawBoxInsideLine() {
		System.out.print("|");
		
		for( int insideRowIndex = 1; insideRowIndex <= 8 - 2; insideRowIndex++ ) {
			System.out.print(".");
		}
		
		System.out.println("|");
	}

}
