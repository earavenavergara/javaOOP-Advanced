package bankaccount;

public class BankAccount {
	private String nCuenta;
	private double sCCorriente;
	private double sCAhorro;
	private static int nC = 0;
	private static double dC = 0;

	public BankAccount(double sCCorriente, double sCAhorro) {
		String crearNC = crearNC();
		setnCuenta(crearNC);
		setsCCorriente(sCCorriente);
		setsCAhorro(sCAhorro);
		dC += sCCorriente + sCAhorro;
		nC++;
		System.out.println("saldo CC: " + sCCorriente + " saldo CA: " + sCAhorro);
	}

	private String crearNC() {
		long nc = (long) ((10000000000L) * Math.random());
		return "" + nc;
	}

	public void addCC(double i) {
		System.out.println("addCC: " + (i + getsCCorriente()));
		setsCCorriente(i + getsCCorriente());
		dC += i;
	}

	public void addCA(double i) {
		System.out.println("addCA: " + (i + getsCAhorro()));
		setsCAhorro(i + getsCAhorro());
		dC += i;
	}

	public void rCC(double i) {
		if (i > getsCCorriente())
			System.out.println("Saldo insuficiente");
		else
			setsCCorriente(getsCCorriente() - i);
		System.out.println("rCC: " + getsCCorriente());
	}

	public void rCA(double i) {
		if (i > getsCAhorro())
			System.out.println("Saldo insuficiente");
		else
			this.setsCAhorro(getsCAhorro() - i);
		System.out.println("rCA: " + getsCAhorro());
	}

	public void sCuenta() {
		System.out.println("Saldo cuenta: " + (getsCAhorro() + getsCCorriente()));
	}

	public String getnCuenta() {
		return nCuenta;
	}

	private void setnCuenta(String nCuenta) {
		this.nCuenta = nCuenta;
	}

	public double getsCCorriente() {
		return sCCorriente;
	}

	private void setsCCorriente(double sCCorriente) {
		this.sCCorriente = sCCorriente;
	}

	public double getsCAhorro() {
		return sCAhorro;
	}

	private void setsCAhorro(double sCAhorro) {
		this.sCAhorro = sCAhorro;
	}

}
