package week02.slot02.copy;

public class ThreeDotSyntax {

	public static void main(String[] args) {
		messages("Hello", "World", "Java", "Jailani", "Rahman", "Abdul");
	}
	
	public static void messages(String... messages) {
		for(String message : messages) {
			System.out.println(message);
		}
	}
	
}
