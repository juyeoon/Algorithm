// 단순 구현. "\"는 "\\"로 
public class B2393_Rook {
	public static void main(String[] args){
		StringBuilder sb = new StringBuilder();
		sb.append("  ___  ___  ___\n");
		sb.append("  | |__| |__| |\n");
		sb.append("  |           |\n");
		sb.append("   \\_________/\n");
		sb.append("    \\_______/\n");
		sb.append("     |     |\n");
		sb.append("     |     |\n");
		sb.append("     |     |\n");
		sb.append("     |     |\n");
		sb.append("     |_____|\n");
		sb.append("  __/       \\__\n");
		sb.append(" /             \\\n");
		sb.append("/_______________\\");
		System.out.println(sb);
	}
}
