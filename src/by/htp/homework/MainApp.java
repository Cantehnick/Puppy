package by.htp.homework;

public class MainApp {

	public static void main(String[] args) {

		Puppy puppy = new Puppy("Bobik");
		System.out.println(puppy.getName());
		System.out.println("Dog can bite " + puppy.bite("by two jaws."));
		System.out.println("Dog can jump up to " + puppy.jump(2) + " meters.");
		System.out.println("Dog runs on " + puppy.run(4) + " legs.");
		System.out.println("Dog barks: " + puppy.say("Woof"));
	
	}
}