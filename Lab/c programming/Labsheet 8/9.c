//WAP that can declare 1-Dimentional array of size n.
//Now accept the content of  content of that array and display their content 
#include<stdio.h>
void main()
{
	int a[500];
	int i,n,*p,*p1;
	p=a;
	p1=&n;
	printf("Enter the size of array you want :  ");
	scanf("%d",&n);
	printf("Enter the element of A:\n");
	for(i=0;i<*p1;i++)
	{
		scanf("%d",(p+i));
	}
	printf("The element of that array are  :\n");
	for(i=0;i<*p1;i++)
	{
		printf("a[%d]=%d\n",i,*(p+i));
	}
}
