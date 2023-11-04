package multi_threading;
public class TreadDemo {

	public static void main(String[] args) {

		ThreadDemo tc = new ThreadDemo();
		Thread_Class2 tr = new Thread_Class2();

		tc.start();
		tr.start();

	}
}


class ThreadDemo extends Thread {
	public static void display()

	{
		int i = 1;
		while (i <= 10)
			System.out.println("user defined thread");
		i++;
	}

	public void run() {
		display();

	}
}

class Thread_Class2 extends Thread {
	public static void print()

	{
		int i = 1;
		while (i <= 10)
			System.out.println("user defined thread 2");
		i++;
	}

	public void run() {

		print();

	}

}

