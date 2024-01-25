//Transpose of given matrix and display
#include <stdio.h>
void main()
{
	int a[10][10],t[10][10],r,c,i,j;
	printf("Enter the no. rows and column of a matrix:");
	scanf("%d%d",&r,&c);
	printf("Enter the elements of matrix:");
	for(i=0;i<r;i++){
		for(j=0;j<c;j++){
			scanf("%d",&a[i][j]);
			t[j][i]=a[i][j];
		}	
	}
	printf("Given matrix is:\n");
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			printf("%d\t",a[i][j]);
		}
		printf("\n");
	}
	printf("Transpose of given matrix is:\n");
	for(i=0;i<c;i++)
	{
		for(j=0;j<r;j++)
		{
			printf("%d\t",t[i][j]);
		}
		printf("\n");
	}
}
