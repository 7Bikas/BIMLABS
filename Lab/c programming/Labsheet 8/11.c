#include<stdio.h>
void swap(int *,int *);
void main()
{
	int a,b;
	printf("Enter two number :");
	scanf("%d%d",&a,&b);
	printf("Before sewapping the value :\n");
	printf("a=%d\n b=%d\n",a,b);
	swap(&a,&b);
	printf("After the swapping value:\n");
	printf("a=%d\nb=%d",a,b);

}
void swap (int *a,int *b)
{
	int temp;
	temp =*a;
	*a=*b;
	*b=temp;

	
}
