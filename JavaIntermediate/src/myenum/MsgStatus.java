package myenum;

public enum MsgStatus {
	SENT("Single tick"),
	DELIVERED("Double tick"),
	READ("Double blue tick"),
	DELETED("This msg is deleted");
	String desc;
	private MsgStatus(String m) {
		this.desc=m;
	}
	public String getMsg() {
		return desc;
	}
}
