package com.learning.core.Day7;
import java.util.Stack;
public class D07P04 {
	 public static int evaluate(String expression) {
	        String[] tokens = expression.split(" ");
	        Stack<Integer> values = new Stack<>();
	        Stack<Character> ops = new Stack<>();

	        for (String token : tokens) {
	            // If token is a number, push it to the values stack
	            if (Character.isDigit(token.charAt(0))) {
	                values.push(Integer.parseInt(token));
	            }
	            // If token is an operator, push it to the ops stack
	            else if (token.charAt(0) == '+' || token.charAt(0) == '-' || token.charAt(0) == '*' || token.charAt(0) == '/') {
	                while (!ops.isEmpty() && hasPrecedence(token.charAt(0), ops.peek())) {
	                    values.push(applyOp(ops.pop(), values.pop(), values.pop()));
	                }
	                ops.push(token.charAt(0));
	            }
	        }

	        // Entire expression has been parsed at this point, apply remaining ops to remaining values
	        while (!ops.isEmpty()) {
	            values.push(applyOp(ops.pop(), values.pop(), values.pop()));
	        }

	        // Top of `values` contains result, return it
	        return values.pop();
	    }

	    // Returns true if 'op2' has higher or same precedence as 'op1',
	    // otherwise returns false.
	    public static boolean hasPrecedence(char op1, char op2) {
	        if (op2 == '(' || op2 == ')') {
	            return false;
	        }
	        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) {
	            return false;
	        } else {
	            return true;
	        }
	    }

	    // A utility method to apply an operation 'op' on operands 'a' and 'b'.
	    // Return the result.
	    public static int applyOp(char op, int b, int a) {
	        switch (op) {
	            case '+':
	                return a + b;
	            case '-':
	                return a - b;
	            case '*':
	                return a * b;
	            case '/':
	                if (b == 0) {
	                    throw new UnsupportedOperationException("Cannot divide by zero");
	                }
	                return a / b;
	        }
	        return 0;
	    }
	    public static void main(String[] args) {
	        String expression = "10 + 2 * 6";
	        System.out.println(evaluate(expression));

	        
	    }

}
