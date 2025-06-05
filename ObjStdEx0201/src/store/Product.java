package store;

public class Product {
	
	//フィールド
	private static final String STORE_NAME = "速水販売店";
	private static final int DEFAULT_CHANGE_AMT = 1000;
	private String name;
	private int price;
	
	//コンストラクタ
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public Product(String name) {
		this(name, 0);
	}
	
	//staticメソッド
	public static void displayStoreName() {
		System.out.println("☆店舗名：" + STORE_NAME);
	}
	//getter setter
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	//通常メソッド
	public int up(int amt) {
		return price += amt;
	}
	public int up() {
		return this.up(DEFAULT_CHANGE_AMT);
	}
	
	
	public int down(int amt) {
		return price -= amt;
	}
	public int down() {
		return this.down(DEFAULT_CHANGE_AMT);
	}
	
	public void display() {
		System.out.println(name + "：" + price + "円");
	}
}
