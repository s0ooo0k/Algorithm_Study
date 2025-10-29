
#include <iostream>
#include <algorithm>
using namespace std;


int n, arr[100001], dp[100001];
int main()
{
	cin >> n;
	for (int i = 1; i <= n; i++)
		cin >> arr[i];

	dp[1] = arr[1];
	int Max = dp[1];
	for (int i = 2; i <= n; i++)
	{
		dp[i] = max(dp[i - 1] + arr[i], arr[i]);
		if (Max < dp[i])
			Max = dp[i];
	}

	cout << Max;
}
