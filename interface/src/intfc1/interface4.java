package intfc1;


	interface Printable1 {
		
	
		void print();
	}

	interface Showable1 {
		void print();
	}
	class Interface4 implements Printable1, Showable1 {
		void Inteface4(){
			
		}
		public void print() {
			System.out.println("Hello");
		}
	}
		public class interface4{
		public static void main(String args[]) {
			Interface4 obj = new Interface4();
			obj.print();
		}
		}
	


