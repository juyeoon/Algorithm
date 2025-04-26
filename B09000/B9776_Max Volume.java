import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/9950
// 주어진 부피 공식에 맞게 부피를 구한 후 현재의 최댓값과 비교하여 최댓값 경신 후 최대 부피 출력
public class B9776_Max Volume {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim()); // 도형의 개수
        double maxVolume = 0.0; // 최대 부피
        for (int i = 0; i < n ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char shape =  st.nextToken().charAt(0); // 도형 종류
            double V = 0.0; // 현재 도형의 부피
            if(shape == 'S') { // 구
                double r = Double.parseDouble(st.nextToken());
                V = (4.0 / 3.0) * Math.PI * r * r * r;
            } else if(shape == 'C' ){ // 원뿔
                double r = Double.parseDouble(st.nextToken());
                double h = Double.parseDouble(st.nextToken());
                V = (1.0 / 3.0) * Math.PI * r * r * h;
            } else { // 원기둥
                double r = Double.parseDouble(st.nextToken());
                double h = Double.parseDouble(st.nextToken());
                V = Math.PI * r * r * h;
            }
            maxVolume = Math.max(maxVolume, V); // 최대 부피 갱신
        }
        System.out.println(String.format("%.3f", maxVolume)); // 출력
        br.close();
    }
}
