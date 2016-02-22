package high.extend;

public class Item {
	private String name;
	private int price;
	public Item(String name){
		System.out.println(name);
		this.setName(name);
		this.setPrice(0);
	}
	public Item(String name,int price){
		this.setName(name);
		this.setPrice(price);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
