import java.util.Scanner;

public class Solution {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int x=0;
        while(t-->0){
            x++;
            int ans=0;
            int m=sc.nextInt();     //no of participants
            int n=sc.nextInt();     //total no of days the competition runs
            int p=sc.nextInt();     // last year participant ID of John
            int[][] dp = new int[m][n];
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    dp[i][j]=sc.nextInt();
                }
            }
            int max = Integer.MAX_VALUE;
            int a[] = new int[n];
            for(int i=0;i<n;i++){
                 max = dp[0][i];
                for(int j=1;j<m;j++){
                    if(dp[j][i]>max){
                        max = dp[j][i];
                    }
                }
                a[i]=max;
            }
            for(int i=0;i<n;i++){
                ans += Math.abs(a[i]-dp[p-1][i]);
            }
            System.out.println("Case #"+x+": "+ans);
        }
    }
}
