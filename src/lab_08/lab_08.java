package lab_08;

public class lab_08 {
	private String units;
	private long amount;
	private int cents;

	public lab_08(double amount, String code) {
		this.units = code;
		setAmount(amount);
	}

	private void setAmount(double amount) {
		this.amount = new Double(amount).longValue();
		this.cents = (int) ((amount * 100.0) % 100);
	}

}
