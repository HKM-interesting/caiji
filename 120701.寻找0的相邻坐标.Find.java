package pac;

public class Find {
	void Find (int array2d[][]){
		for (int row = 0; row < array2d.length; row++) {
			for (int column = 0; column < array2d[0].length; column++) {
				if (array2d[row][column]==0) {
					System.out.println("R_zero:("+row+","+column+")");
			
				}}}}
	void Find2 (int array2d[][]){
		for (int row = 0; row < array2d.length; row++) {
			for (int column = 0; column < array2d[0].length; column++) {
				if (array2d[row][column]==0) {
					System.out.println("R_left:("+row+","+(column-1)+")");
			
				}}}}
	void Find3 (int array2d[][]){
		for (int row = 0; row < array2d.length; row++) {
			for (int column = 0; column < array2d[0].length; column++) {
				if (array2d[row][column]==0) {
					System.out.println("R_right:("+row+","+(column+1)+")");
			
				}}}}
	void Find4 (int array2d[][]){
		for (int row = 0; row < array2d.length; row++) {
			for (int column = 0; column < array2d[0].length; column++) {
				if (array2d[row][column]==0) {
					System.out.println("R_up:("+(row-1)+","+column+")");
			
				}}}}
	void Find5 (int array2d[][]){
		for (int row = 0; row < array2d.length; row++) {
			for (int column = 0; column < array2d[0].length; column++) {
				if (array2d[row][column]==0) {
					System.out.println("R_down:("+(row+1)+","+column+")");
			
				}}}}
}
/*矩阵：
array2d[ ][ ]={
{1,2,3,4,5,6},
{7,8,9,10,0,12},
{8,8,9,10,11,12},
{7,8,3,10,11,12},
{88,66,92,102,151,999}
};
输出坐标：
R_zero(4,1)、R_left（3,1）、R_right（5,1）、R_up(4,0)、R_down(4,2)*/
