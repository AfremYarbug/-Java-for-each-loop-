import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		// is useful for iterating through all of the elements in an array or other collection
		// less steps, more readable
		// less flexible compared to normal for loop

		// String[] animals = {"cat", "dog", "rat", "bird"};

		// for-each loop using a collection
		ArrayList<String> animals = new ArrayList<String>();

		animals.add("cat");
		animals.add("dog");
		animals.add("rat");
		animals.add("bird");

		for (String i : animals) {
			System.out.println(i);
		}
	}
}
