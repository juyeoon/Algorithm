import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

// https://www.acmicpc.net/problem/5342
// HashMap으로 key-value 형식으로 값을 저장한 후, 입력에 따른 sum값을 출력
public class B5342_Billing {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String, Double> priceMap = new HashMap<>();
		priceMap.put("Paper", 57.99);
		priceMap.put("Printer", 120.50);
		priceMap.put("Planners", 31.25);
		priceMap.put("Binders", 22.50);
		priceMap.put("Calendar", 10.95);
		priceMap.put("Notebooks", 11.20);
		priceMap.put("Ink", 66.95);
		String s = "";
		double sum = 0;
		while (!(s = br.readLine()).equals("EOI")) {
			sum += (priceMap.get(s));
		}
		System.out.println("$" + sum);
		br.close();
	}
}
