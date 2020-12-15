package pac;

public class App {
    public int Fibonacci (int n){
        if(n<1){
            return 0;
        }
        int a = 1;
        int b = 1;
        int temp;
        for(int i = 0; i <= n; i++){
            temp = a;
            a = b;
            b = b + temp;
        }
        return b;
    }
}
