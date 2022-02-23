package sec03;

public class ProductTest {
	public static void main(String[] args) {
//		ProductManager pm1 = new ProductManager();
//		ProductManager pm2 = new ProductManager();
//		ProductManager pm3 = new ProductManager();
//		ProductManager pm4 = new ProductManager();
//		ProductManager pm5 = new ProductManager();
//		ProductManager pm6 = new ProductManager();
		
		ProductManager pm1 = ProductManager.getPm();
		ProductManager pm2 = ProductManager.getPm();
		
		
		System.out.println(pm1 == pm2);

	}
}
