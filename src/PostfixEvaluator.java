import java.util.Arrays;

public class PostfixEvaluator {
    public static int evaluate(String expression) throws PostfixException {
        LinkedStack<Integer> numberStack = new LinkedStack<Integer>();
        int count = 0;
        for(int i = 0; i<expression.length(); i++) {
            int character = (int)expression.toCharArray()[i];
            if(character>=48 && character<=57) {
                count ++;
                //numberStack.push(Integer.valueOf(expression.substring(i, i+1)));
            } else if (!(character==32)) {
                int number1 = 0;
                int number2 = 0;
                //System.out.println((char)character);
                try {
                    number2 = numberStack.pop();
                } catch (StackUnderflowException e) {
                    System.out.println("17, " + number1);
                }
                try {
                    if (numberStack.empty()) {
                        throw new PostfixException();
                    }
                    number1 = numberStack.pop();
                } catch (StackUnderflowException e) {
                    System.out.println("22, " + number2);
                }
                //System.out.println(expression + " | number: " + number1 + " | number2: " + number2);
                int number3 = 0;
                if(character=='*') {
                    //System.out.println("times");
                    number3 = number1*number2;
                } else if(character=='/') {
                    //System.out.println("divided");
                    if (number2==0) {
                        //System.out.println("ay divided by zero boss");
                        throw new PostfixException();
                    }
                    number3 = number1/number2;
                } else if(character=='+') {
                    //System.out.println("plus");
                    number3 = number1+number2;
                } else if(character=='-') {
                    //System.out.println("minus");
                    number3 = number1-number2;
                }
                //System.out.println(number3);
                numberStack.push(number3);
            } else if (character==32 && count!=0) {
                numberStack.push(Integer.valueOf(expression.substring(i-count, i)));
                count = 0;
            }
        }
        int number4 = numberStack.pop();
        if (numberStack.empty()) {
            return number4;
        } else {
            //System.out.println("stack aint empty" + numberStack.pop() + " " + number4);
            throw new PostfixException();
        }
    }
}
