package com.github.annaei.extractMethod.Badinvocations;

/**
 * Minimal example code from IWoR'20 presentatino 
 * 
 * @author anna.eilertsen@uib.no
 *
 */
public class ExtractConditonalReturns {
	static X x = new X(); 
	static class X{
		public boolean bar() {
			return true;
		}
	}

	//Check behavior preservation by running main
	public static void main(String[] args){
		System.out.println(foo());
	}

	/**
	 * Minimal example of the Extract Method
	 * precondition violation conditional 
	 * return where not all execution paths
	 * end in a return statement
	 */
	static boolean foo(){
		//selection start
		if(x==null)
			return false;
		//selection end
		return true;
	}

	

}
