#include <stdio.h>
void spiralPrint(int n) 
{ 
	int i, k = 0, l = 0; 

	/* k - starting row index 
		m - ending row index 
		l - starting column index 
		n - ending column index 
		i - iterator 
	*/
	int a[n][n];
	int l1=0;
	int m=n;
	int l4=n;
	int l3=n;

	while (k < m && l < n) { 
		/* Print the first row from 
			the remaining rows */
		for (i = l; i < n; ++i) { 
			a[k][i]=++l1;; 
		} 
		k++; 

		/* Print the last column 
		from the remaining columns */
		for (i = k; i < m; ++i) { 
		a[i][n - 1]=++l1; 
		} 
		n--; 

		/* Print the last row from 
				the remaining rows */
		if (k < m) { 
			for (i = n - 1; i >= l; --i) { 
			a[m - 1][i]=++l1; 
			} 
			m--; 
		} 

		/* Print the first column from 
				the remaining columns */
		if (l < n) { 
			for (i = m - 1; i >= k; --i) { 
				a[i][l]=++l1; 
			} 
			l++; 
		} 
	} 
	for(int l2=0;l2<l4;l2++)
	{
	    for(int l6=0;l6<l4;l6++)
	    {
	        printf("%d   ",a[l2][l6]);
	    }
	    printf("\n");
	}
} 

/* Driver program to test above functions */
int main() 
{ 
int n;
scanf("%d",&n);

	spiralPrint(n); 
	return 0; 
} 

// This is code is contributed by rathbhupendra 
