package calculadora;

public class Calculator {
	private double OperandOne;
	private double OperandTwo;
	private char Operation;
	private double Result;

	public void performOperation() {
		if (this.Operation == '+')
			this.Result = this.OperandOne + this.OperandTwo;
		else if (this.Operation == '-')
			this.Result = this.OperandOne - this.OperandTwo;
	}

	public double getOperandOne() {
		return OperandOne;
	}

	public void setOperandOne(double operandOne) {
		OperandOne = operandOne;
	}

	public double getOperandTwo() {
		return OperandTwo;
	}

	public void setOperandTwo(double operandTwo) {
		OperandTwo = operandTwo;
	}

	public char getOperation() {
		return Operation;
	}

	public void setOperation(char operation) {
		Operation = operation;
	}

	public double getResult() {
		return Result;
	}
}
