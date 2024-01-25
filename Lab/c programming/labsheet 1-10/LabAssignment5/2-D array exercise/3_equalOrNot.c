//Accept two matrix and accept whether they are equal
#include <stdio.h>
void main()
{
	int a[10][10],b[10][10],r,c,i,j,flag=0;
	printf("Enter the no. rows and column of matrix:");
	scanf("%d%d",&r,&c);
	printf("Enter the elements of first matrix:");
	for(i=0;i<r;i++){
		for(j=0;j<c;j++){
			scanf("%d",&a[i][j]);
		}
	}
	printf("Enter the elements of second matrix:");
	for(i=0;i<r;i++){
		for(j=0;j<c;j++){
			scanf("%d",&b[i][j]);
		}
	}
	//calculatig
	for(i=0;i<r;i++){
		for(j=0;j<c;j++){
			if(a[i][j]!=b[i][j]){
				flag=1;
				break;
			}
		}
	}
	if(flag==0)
	{
		printf("\nGiven two matrices are equal");
	}
	else
	{
		printf("\nGiven two matrices are not equal");
	}
}
