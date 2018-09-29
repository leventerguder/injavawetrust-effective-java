package chapter03.item14.examples;

class Car implements Comparable <Car>{

	public Car(String hp, String brand, Integer price) {
		super();
		this.hp = hp;
		this.brand = brand;
		this.price = price;
	}

	private String hp;
	private String brand;
	private int price;

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}


	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int compareTo(Car car) {
		return Integer.compare(price, car.getPrice());
	}

	@Override
	public String toString() {
		return "Car [hp=" + hp + ", brand=" + brand + ", price=" + price + "]";
	}

}