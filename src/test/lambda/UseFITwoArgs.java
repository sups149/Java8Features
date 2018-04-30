package test.lambda;

import test.lambda.interfaces.FunctionalInterfaceTwoArgs;

public class UseFITwoArgs {

	public static void main(String[] args) {
		FunctionalInterfaceTwoArgs obj = (str1,str2) -> {
			System.out.println(str1+str2);
			return str1+str2;
		};

	}

}
