///WAP to read a number 'n' & calculate its cube using function
//No argument but return type
#include<stdio.h>
int cube ();
int cube() 
{
	int n;
	printf("Enter a number :");
	scanf("%d",&n);
	return (n*n*n);
}
void main()
{
	printf("Cube is %d ",cube ());
}
