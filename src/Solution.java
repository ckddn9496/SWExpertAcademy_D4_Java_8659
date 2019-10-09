import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int K = Integer.parseInt(sc.nextLine());
			long f1 = 1;
			long f2 = 2;
			for (int i = 2; i <= K; i++) {
				long f3 = f1+f2;
				f1 = f2;
				f2 = f3;
			}
			System.out.println("#"+test_case+" "+f2+" "+f1);
		}
	}
}