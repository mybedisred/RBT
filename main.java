
public class main {

	public static void main(String[] args) {
		System.out.println("running");
		//your test code here
		RedBlackTree tree4 = new RedBlackTree();
		tree4.insert(20);
		tree4.insert(10);
		tree4.insert(30);
		tree4.insert(5);
		tree4.insert(15);
		tree4.insert(25);
		tree4.insert(35);
		System.out.println("Test:");
		tree4.printTree();
		System.out.println("Is Red Black? " + tree4.isRedBlack()); 
		System.out.println("Shortest path: " + tree4.shortestTruePath());
		System.out.println("Height diff: " + tree4.trueHeightDiff());
	}
}
