public class Fizz_Buzz {
    public static void main(String[] args) {
        for(int i = 1; i<=100; i++) {
            System.out.println((i%3==0)? ((i%5==0)? "fizz-buzz" : "fizz") : (i%5==0? "buzz" : i));
        }
    }
}
