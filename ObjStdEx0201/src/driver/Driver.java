package driver;

import store.Product;

public class Driver {

	public static void main(String[] args) {
		//店舗名表示
		System.out.println();
		Product.displayStoreName();
		//インスタンス化
		Product keyboard = new Product("キーボード");
		//getter
		System.out.println();
//		System.out.println("price：" + keyboard.price);
		System.out.println("getPrice()の結果：" + keyboard.getPrice());
		//setter
		keyboard.setPrice(2800);
		//商品情報の表示
		System.out.println("\n---設定後---\n");
		keyboard.display();
	}
}
