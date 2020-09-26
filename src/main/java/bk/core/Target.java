package bk.core;

public class Target {

	
	private final int targetNumber;
	private int pos;
	private int x;
	private int y;
	
	
	public Target(final int targetNumber,int pos) {
		this.targetNumber = targetNumber;
		this.pos = pos;
		this.x = Integer.parseInt(Integer.toString(pos).substring(0, 3));
		this.y = Integer.parseInt(Integer.toString(pos).substring(4,8));
	}
	
	public int getTargetPos() {
		return pos;
	}
	
	public void setTargetPos(int pos) {
		this.pos = pos;
		this.x = Integer.parseInt(Integer.toString(pos).substring(0, 3));
		this.y = Integer.parseInt(Integer.toString(pos).substring(4,8));
	}
}
