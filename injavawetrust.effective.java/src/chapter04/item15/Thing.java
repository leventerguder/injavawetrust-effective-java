package chapter04.item15;

public class Thing {

	private String key;

	public Thing(String key) {
		super();
		this.key = key;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	@Override
	public String toString() {
		return "Thing [key=" + key + "]";
	}

}
