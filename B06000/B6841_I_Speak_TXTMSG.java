import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// switch-case문으로 입력 문자열에 맞게 출력
public class B6841_I_Speak_TXTMSG {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = ""; // 입력 문자열
		while (!(s = br.readLine()).equals("TTYL")) { // "TTYL"이 입력될 때까지 반복
			switch (s) {
			case "CU":
				sb.append("see you\n");
				break;
			case ":-)":
				sb.append("I’m happy\n");
				break;
			case ":-(":
				sb.append("I’m unhappy\n");
				break;
			case ";-)":
				sb.append("wink\n");
				break;
			case ":-P":
				sb.append("stick out my tongue\n");
				break;
			case "(~.~)":
				sb.append("sleepy\n");
				break;
			case "TA":
				sb.append("totally awesome\n");
				break;
			case "CCC":
				sb.append("Canadian Computing Competition\n");
				break;
			case "CUZ":
				sb.append("because\n");
				break;
			case "TY":
				sb.append("thank-you\n");
				break;
			case "YW":
				sb.append("you’re welcome\n");
				break;
			default:
				sb.append(s).append("\n");
				break;
			}
		}
		sb.append("talk to you later"); // "TTYL" 입력에 대한 출력값
		System.out.println(sb); // 출력
		br.close();
	}
}