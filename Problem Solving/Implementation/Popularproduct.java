import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PopularProduct {

	public static String getPopularProduct(List<String> products) {
		Map<String, Integer> map = new HashMap<>();
		for(String product:products){
			map.put(product, map.getOrDefault(product, 0)+1);
		}
		String popularProduct = "";
		int maxCount = Integer.MIN_VALUE;
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			if(entry.getValue()>=maxCount) {
				if(popularProduct.compareTo(entry.getKey())<0) {
					popularProduct = entry.getKey();
				}
			}
		}
		return popularProduct;		
	}
	public static void main(String args[]) {
		List<String> products = new ArrayList<String>();
		products.add("yellowShirt");
		products.add("redHat");
		products.add("blackShirt");
		products.add("bluePants");		
		products.add("redHat");
		products.add("pinkHat");
		products.add("blackShirt");
		products.add("yellowShirt");
		products.add("greenPants");
		products.add("greenPants");
		System.out.println((getPopularProduct(products)));
	}
}
