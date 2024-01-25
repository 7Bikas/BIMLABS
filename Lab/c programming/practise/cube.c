//wap to read a number and cakculate its cube 
//no argument but return type 
#include<stdio.h>
int cube();
void main()
{
	int a;
	a=cube();
	printf("The cube is %d",a);
}
int cube()
{
	int a,c;
	printf("Enter a number :");
	scanf("%d",&a);
	c=a*a*a;
	return c;
	
}
