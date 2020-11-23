package pac;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
	while(true){
		System.out.println("输入字母A");
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		int x,y;
		x=(int)(Math.random()*100);
		y=(int)(Math.random()*100);
		if(a.equals(a)){
			System.out.println(x+","+y);
		}else {
			System.out.println("请重新输入！");
	}
	
		}
	}
		
		}
