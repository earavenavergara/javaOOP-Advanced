package calculadora;

public class CalculatorII {
	private double Operan = 0;
	private String Operation = "+";
	private double Result;
	private boolean x = false;

	public void performOperation(double d) {
		if (x == true) {
			System.err.println("syntax error");
			System.exit(0);
		}
		this.x = true;
		if (this.Operation == "+")
			this.Operan += d;
		else if (this.Operation == "-")
			this.Operan -= d;
		else if (this.Operation == "*")
			this.Operan *= d;
		else if (this.Operation == "/")
			this.Operan /= d;
	}

	public void performOperation(String string) {
		if (x == false) {
			System.err.println("syntax error");
			System.exit(0);
		}
		this.x = false;
		this.Operation = string;
		if (string == "=")
			this.Result = this.Operan;
	}

	public double getResult() {
		return Result;
	}

}
