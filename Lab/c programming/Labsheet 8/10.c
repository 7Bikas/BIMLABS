//Write three 1-Dimentional array called a,b and c of size n.
//Now accept the content of a and b and perform the c=a-b and display the reasult 
#include<stdio.h>
void main()
{
	int a[100],b[100],c[100];
	int i,n,*p,*p1,*p3;
	p=a;
	p1=b;
	p3=&n;
	printf("Enter the size of array you want :");
	scanf("%d",&n);
	printf("Enter the element of 'a':");
	for(i=0;i<*p3;i++)
	{
		scanf("%d",(p+i));
	}
	printf("Enter the element of 'b':");
	for(i=0;i<*p3;i++)
	{
		scanf("%d",(p1+i));
	}
	for(i=0;i<*p3;i++)
	{
		c[i]=*(p+i)-(*(p1+i));
	}
	printf("The subtraction of a and b are :\n");
	for(i=0;i<*p3;i++)
	{
		printf("c[%d]=%d\n",i,c[i]);
	}
}
