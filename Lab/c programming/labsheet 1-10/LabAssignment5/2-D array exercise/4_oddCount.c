//Find no. of time odd occured in matrix
//input a matrix and find sum of diagonal elements of matrix
#include <stdio.h>
void main()
{
	int a[10][10],r,c,i,j,odd=0;
	printf("Enter the no. rows and column of a matrix:");
	scanf("%d%d",&r,&c);
	printf("Enter the elements of matrix:");
	for(i=0;i<r;i++){
		for(j=0;j<c;j++){
			scanf("%d",&a[i][j]);
			if(a[i][j]%2!=0){
				odd++;
			}
		}
	}
	printf("\nNo. of time odd occured in matrix = %d.",odd);
}
