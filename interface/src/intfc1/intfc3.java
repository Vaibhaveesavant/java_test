package intfc1;


	interface Printable {
		void print();
	}

	interface Showable {
		void show();
	}

	class Interface3 implements Printable, Showable {
		public void print() {
			System.out.println("Hello");
		}
		public void show() {
			System.out.println("Welcome");
		}
	}
	public class intfc3{
		public static void main(String args[]) {
			Interface3 obj = new Interface3();
			obj.print();
			obj.show();
		}
	}

