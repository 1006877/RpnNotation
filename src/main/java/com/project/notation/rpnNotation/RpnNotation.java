package com.project.notation.rpnNotation;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
import java.util.Stack;

public class RpnNotation {

	public BigDecimal factorial(BigDecimal fact) {
		BigDecimal factResult = new BigDecimal(1);
		for (int i = 1; i <= fact.intValue(); i++) {
			factResult = factResult.multiply(new BigDecimal(i));
		}
		return factResult;
	}

	public BigDecimal exponent(BigDecimal exp, BigDecimal pow) {
		BigDecimal rs = new BigDecimal(1);
		for (int i = pow.intValue(); i > 0; i--) {
			rs = rs.multiply(exp);
		}
		return rs;

	}

	public String executeCode(String inputStr) {
		BigDecimal pop1, pop2, result = null;
		Stack<BigDecimal> stack = new Stack<BigDecimal>();
		String inputVal = inputStr;
		String[] inputStream = inputVal.split(" ");

		for (int i = 0; i < inputStream.length; i++) {
			switch (inputStream[i]) {

			case "+":
				pop1 = stack.pop();
				pop2 = stack.pop();
				result = pop2.add(pop1);
				stack.push(result);
				break;

			case "-":
				pop1 = stack.pop();
				pop2 = stack.pop();
				result = pop2.subtract(pop1);
				stack.push(result);
				break;

			case "/":
				pop1 = stack.pop();
				pop2 = stack.pop();
				result = pop2.divide(pop1, 2, RoundingMode.HALF_EVEN);
				stack.push(result);
				break;

			case "%":
				pop1 = stack.pop();
				BigDecimal percent = new BigDecimal(100);
				result = pop1.divide(percent, 2, RoundingMode.HALF_EVEN);
				stack.push(result);
				break;

			case "*":
				pop1 = stack.pop();
				pop2 = stack.pop();
				result = pop2.multiply(pop1);
				stack.push(result);
				break;

			case "!":
				pop1 = stack.pop();
				result = factorial(pop1);
				stack.push(result);
				break;

			case "^":
				pop1 = stack.pop();
				pop2 = stack.pop();
				result = exponent(pop2, pop1);
				stack.push(result);
				break;

			default:
				stack.push(new BigDecimal(inputStream[i]));
				break;
			}
		}
		return(stack.pop().toString());
		

	}

}
