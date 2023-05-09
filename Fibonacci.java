package OOPSLearning;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci call = new Fibonacci();
		System.out.println("With using 3 rd variable : ");
		call.print_fibonacci(10);
		System.out.println();
		System.out.println("Without using 3 rd variable : ");
		call.print_smart(10);
	}

	 private void print_smart(int count) {
		 int p1 = 0;
			int p2 =1;
			System.out.print(p1+" ");
			while(count>0) {
				 p2=p1+p2;
				 p1=p2-p1;
				 System.out.print(p1+" ");
				 count--;
	}
	 }

	void print_fibonacci(int count) {
		int p1 = 0;
		int p2 =1;
		int p3;
				 while(count>0) {
			System.out.print(p1+" ");
			p3=p1+p2;
			p1=p2;
			p2=p3;
			count--;
		}
		
	}

}
