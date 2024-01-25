#include<stdio.h>
char bikas();
void main()
{
	char z,result;
	z=bikas();
	printf("result =%c",z);
}
char bikas()
{
	char f;
	printf("Enter a character :");
	scanf("%c",&f);
	return f;
	
}
