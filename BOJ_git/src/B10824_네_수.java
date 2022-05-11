import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

//String에서 +, BigInteger 사용
public class B10824_네_수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String ab = st.nextToken()+st.nextToken(); // A와 B 잇기
		String cd = st.nextToken()+st.nextToken(); // C와 D 잇기
		BigInteger AB = new BigInteger(ab);
		BigInteger CD = new BigInteger(cd);
		System.out.println(AB.add(CD)); // AB + CD
		br.close();
	}
}
