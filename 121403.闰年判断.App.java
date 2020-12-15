package pac;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输放年份");
        int year = in.nextInt();
        if (-3200 < year&&year < 3200) {
            if (year<0){
                if ((year % 4 == 1) || (year % 400 == 1)) {
                    System.out.println(year + "是一个闰年");
                } else {
                    System.out.println(year + "是一个平年");
                }
            }else if (year>0){
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    System.out.println(year + "是一个闰年");
                } else {
                    System.out.println(year + "是一个平年");
                }
            }
        }
        }
}
