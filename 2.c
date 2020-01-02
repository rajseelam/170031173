#include <stdio.h>
void spiralPrint(int n) 
{ 
	int i, k = 0, l = 0; 


	int a[n][n];
	int l1=0;
	int m=n;
	int l4=n;
	int l3=n;

	while (k < m && l < n) { 
	
		for (i = l; i < n; ++i) { 
			a[k][i]=++l1;; 
		} 
		k++; 

	
		for (i = k; i < m; ++i) { 
		a[i][n - 1]=++l1; 
		} 
		n--; 

		
		if (k < m) { 
			for (i = n - 1; i >= l; --i) { 
			a[m - 1][i]=++l1; 
			} 
			m--; 
		} 

		
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


int main() 
{ 
int n;
scanf("%d",&n);

	spiralPrint(n); 
	return 0; 
} 