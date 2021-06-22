package calculadora;

public class Test {

	public static void main(String[] args) {
//		Calculator c = new Calculator();
//		c.setOperandOne(10.5);
//		c.setOperation('-');
//		c.setOperandTwo(5.2);
//		c.performOperation();
//		System.out.println(c.getResult());
		CalculatorII c = new CalculatorII();
		c.performOperation(10.5);
		c.performOperation("+");
		c.performOperation(5.2);
		c.performOperation("*");
		c.performOperation(10);
		c.performOperation("=");
		System.out.println(c.getResult());
	}

}
