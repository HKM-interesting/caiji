package pac;

public class App {
	public static void main(String[] args) throws InterruptedException {
		int arr[][]={
				{111,222},
				{333,444},
				{555,666},
				{777,888},
				{999,666},
				{000,111},
		};
		while (true) {
			Thread.sleep(2000);
			System.out.println("没有时间了！");
			int rdm=(int)(Math.random()*10%6);
			System.out.println(arr[rdm][0]+","+arr[rdm][1]);
		}
	}

}
