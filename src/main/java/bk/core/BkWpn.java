package bk.core;

public class BkWpn {

	private final String callSign;
	private int x;
	private int y;
	private int pos;
	
	
	public BkWpn(final String callSign,int pos) {
		this.callSign = callSign;
		this.pos = pos;
		this.x = Integer.parseInt(Integer.toString(pos).substring(0, 3));
		this.y = Integer.parseInt(Integer.toString(pos).substring(4,8));
	}
	
	public String getCallSign() {
		return callSign;
	}
	
	public int getPosition() {
		return pos;
	}
	public void setPosition(int pos) {
		this.pos = pos;
	}
	
}
