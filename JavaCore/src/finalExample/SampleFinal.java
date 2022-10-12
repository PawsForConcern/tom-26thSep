package finalExample;

public class SampleFinal {
	final int x=100;//final->fixed after construction
	final int y;
	static final int big=555; //static+final->constant (i.e. the same for all instances and impossible to change)
	
	public SampleFinal() {
		this.y=333;
	}
	
	public SampleFinal(int temp) {
		this.y=temp;
	}
	public SampleFinal(int a,int b) {
		b++;
		this.y=a;
	}
	

}
