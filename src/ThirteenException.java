public class ThirteenException extends Exception {
    public ThirteenException(String string) {
        super(string);
    }
    public ThirteenException() {
        super("Use thirteen letter words and stainless steel to protect yourself!");
    }
    @Override
    public void printStackTrace() {
        System.out.println("Use thirteen letter words and stainless steel to protect yourself!");
    }
}
