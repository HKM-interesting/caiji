package pac;

public class App {
	public static void main(String[] args) {
		int array2d[ ][ ]={
		{1,2,3,4,5,6},
		{7,8,9,10,0,12},
		{8,8,9,10,11,12},
		{7,8,3,10,11,12},
		{88,66,92,102,151,999}
		};
		/*for (int row = 0; row < array2d.length; row++) {
			for (int column = 0; column < array2d[0].length; column++) {
				System.out.print(array2d[row][column]+"");
			}
			System.out.println();
		}*/
		new Find().Find(array2d);
		new Find().Find2(array2d);
		new Find().Find3(array2d);
		new Find().Find4(array2d);
		new Find().Find5(array2d);
	}
}
