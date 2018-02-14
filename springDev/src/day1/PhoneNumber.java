package day1;

public class PhoneNumber {

	
	private int stdCode;
	private long number;
	public PhoneNumber(int stdCode, long number) {
		super();
		this.stdCode = stdCode;
		this.number = number;
	}
	public int getStdCode() {
		return stdCode;
	}
	public void setStdCode(int stdCode) {
		this.stdCode = stdCode;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
}
