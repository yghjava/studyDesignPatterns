package demo;

import demo.IDeduction;
import demo.StrategyMan;

/**
 * A factory to get a strategy by given {@link StrategyMan}
 * 
 * @author yuangh
 *
 *         Company:Erongdu
 *
 *         2017��8��16��
 *
 */
public class StrategyFactory {
	public static IDeduction getDeduction(StrategyMan man) {
		IDeduction deduction = null;
		try {
			deduction = (IDeduction) Class.forName(man.getValue()).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return deduction;
	}
}
