package test.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Traverse {
	public static void main(String[] args) {
		List<String> strings = new ArrayList<String>();
		
		strings.add("Arnab");
		strings.add("Sups");
		strings.add("Arpan");
		strings.add("Ayan");
		
		Consumer<String> con = (val) -> System.out.println(val);
		Consumer<String> con2 = val -> System.out.println(val);
		
		strings.forEach(str -> System.out.println(str));
		strings.forEach(con2);
	}
}
