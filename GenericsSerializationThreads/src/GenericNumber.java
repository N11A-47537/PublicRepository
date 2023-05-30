
public class GenericNumber <T extends Number>{
	
	private T x;
	GenericNumber(T x){
		this.x=x;
	}
	public T getValue() {
		return this.x;
	}

}
