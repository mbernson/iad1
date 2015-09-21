package iiad.les4;

import iiad.les2.stack.Stack;
import iiad.les2.stack.StackImpl;

import java.util.StringTokenizer;

public class PostFixCalculator {

    private String input;
    private int result;

    private Stack<String> stack;
    private StringTokenizer st;

    public PostFixCalculator (String invoer) {
        this.input = invoer;
        st = new StringTokenizer(input);
        stack = new StackImpl<>();
        evaluate();
    }

    public int getResult() {
        return result;
    }

    private void evaluate() {
        while (st.hasMoreTokens()) {
            consume(st.nextToken());
        }
        if (!stack.isEmpty())
            result = Integer.valueOf(stack.pop()); // als alles goed is gegaan result poppen en omzetten naar een int
        else
            result = 0;
    }

    private void consume(final String token) {
        char eerste = token.charAt(0); // het eerste karakter van elk token
        if ((eerste >= '0') && (eerste <= '9')) {
            stack.push(token);
        } else if(stack.size() > 1) {
            performBinaryOperation(eerste);
        } else if(stack.size() > 0) {
            performUnaryOperation(eerste);
        }
    }

    private void performUnaryOperation(final char operator) {
        final int lval = Integer.valueOf(stack.pop()), result;
        switch(operator) {
            case 's':
                result = lval * lval;
                break;
            case 'c':
                result = lval * lval * lval;
                break;
            default:
                result = 0;
        }
        stack.push(String.valueOf(result));
    }

    private void performBinaryOperation(final char operator) {
        final int lval = Integer.valueOf(stack.pop()), // poppen en omzetten van een String naar int
                  rval = Integer.valueOf(stack.pop()), // idem
                  result;
        switch (operator) {
            case '+':
                result = lval + rval;
                break;
            case '*':
                result = lval * rval;
                break;
            case '-':
                result = lval - rval;
                break;
            case '/':
                result = lval / rval;
                break;
            default:
                result = 0;
        }
        stack.push(String.valueOf(result));
    }
}
