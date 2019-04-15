import java.util.ArrayList;

public class fruitlooperv2 {

	public static void main(String[] args) {
	ArrayList<String> fruits = new ArrayList<String>();
	fruits.add("Orange");
	fruits.add("Banana");
	fruits.add("Pomegranate");
	fruits.add("Apple");
	fruits.add("Peach");
	fruits.add("Plum");

    String period = ".";
		for (int i = 0; i <= 5; i++){
			System.out.println(fruits.get(i));
				for (double count = 0; count < i; count++){
					System.out.print(period);
				}
			System.out.println();
		}
	}
}