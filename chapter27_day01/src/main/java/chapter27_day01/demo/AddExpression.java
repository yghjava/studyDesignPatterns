package chapter27_day01.demo;

import java.util.HashMap;

/**
 * Add expression operator
 * 
 * @author ygh Jul 30, 2017
 */
public class AddExpression extends SymbolExpression {

	public AddExpression(Expression left, Expression right) {
		super(left, right);
	}

	@Override
	public int interpreter(HashMap<String, Integer> var) {
		return super.left.interpreter(var) + super.right.interpreter(var);
	}

}
