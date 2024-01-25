#include<stdio.h>
void add();
void product();
void subtract();
void division();
void main()
{
	int num;
	printf("Enter '1' for addition.\n");
	printf("Enter '2' for subtraction.\n");
	printf("Enter '3' for multiplication.\n");
	printf("Enter '4' for division.\n");
	printf("Enter a number : ");
	scanf("%d",&num);
	switch(num)
	{
		case 1:
			add();
			break;
		case 2:
			subtract();
			break;
		case 3:
			product();
			break;
		case 4:
			division();
			break;
		default:
			printf("Sorry you enter wrong choice..");
	}
}
void add()
{
	int a,b,c;
	printf("Enter two number :");
	scanf("%d%d",&a,&b);
	c=a+b;
	printf("The sum of %d and %d is %d",a,b,c);
}

void subtract()
{
	int a,b,c;
	printf("Enter two number :");
	scanf("%d%d",&a,&b);
	c=a-b;
	printf("The subtract of %d and %d is %d",a,b,c);
}

void product()
{
	int a,b,c;
	printf("Enter two number :");
	scanf("%d%d",&a,&b);
	c=a*b;
	printf("The product of %d and %d is %d",a,b,c);
}

void division()
{
	int a,b,c;
	printf("Enter two number :");
	scanf("%d%d",&a,&b);
	c=a/b;
	printf("The division of %d and %d is %d",a,b,c);
}
