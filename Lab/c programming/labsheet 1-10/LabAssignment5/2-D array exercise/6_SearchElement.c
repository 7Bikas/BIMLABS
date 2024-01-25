//search element in matrix
#include <stdio.h>
void main()
{
	int a[3][3],i,j,search,flag=0;
	printf("Enter the elements of (3*3) matrix:");
	for(i=0;i<3;i++){
		for(j=0;j<3;j++){
			scanf("%d",&a[i][j]);
		}
	}
	printf("Enter a number to search: ");
	scanf("%d",&search);
	for(i=0;i<3;i++){
		for(j=0;j<3;j++){
			if(a[i][j]==search){
				flag=1;
				break;
			}
		}
	}
	if(flag==1)
	printf("\n**********Number found**********");
	else
	printf("\n**********Number not found**********");

}
