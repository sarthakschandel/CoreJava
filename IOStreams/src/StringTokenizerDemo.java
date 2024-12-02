import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {

		String s = "You,are,the,creator,of,your,destiny";

		StringTokenizer st = new StringTokenizer(s, ",", true);
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		String s1 = "You,are,the,creator,of,your,destiny";

		StringTokenizer st1 = new StringTokenizer(s1, ",", false);
		while (st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
		
	}

}
