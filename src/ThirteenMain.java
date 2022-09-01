import java.util.Scanner;

public class ThirteenMain {
    public static void main(String[] args) throws ThirteenException {
        while(true) {
            System.out.print("Input a string > ");
            String in = (new Scanner(System.in)).next();
            if(in.length()==13) {
                throw new ThirteenException();
            } else {
                System.out.println("That string has length " + in.length());
            }
        }
    }
}
