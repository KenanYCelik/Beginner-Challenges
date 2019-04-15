import java.util.ArrayList;

public class fruitlooperv1 {

	public static void main(String[] args) {
	ArrayList<String> fruits = new ArrayList<String>();

	fruits.add("Orange");
	fruits.add("Banana");
	fruits.add("Pomegranate");
	fruits.add("Apple");
	fruits.add("Peach");
	fruits.add("Plum");

		for (int i = 0; i <= 5; i++){
			System.out.println(fruits.get(i));
		}
	}

}
	