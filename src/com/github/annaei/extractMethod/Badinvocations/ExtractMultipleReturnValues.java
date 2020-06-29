package com.github.annaei.extractMethod.Badinvocations;

/**
 * Minimal example code from IWoR'20 presentatino 
 * 
 * @author anna.eilertsen@uib.no
 *
 */
public class ExtractMultipleReturnValues {

	public static void main(String[] args){
		foo();
	}

	/**
	 * Minimal example of the Extract Method
	 * precondition violation multiple
	 * return values referred to
	 * in subsequent code
	 */
	static void foo(){
		String a = "";
		String b = "";
		//selections start
		a = "A";
		b = "B";
		//selection end
		System.out.println(a + " and " + b);
	}

	public static boolean bar() {
		return true;
	}

}
