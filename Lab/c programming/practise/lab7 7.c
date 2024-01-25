#include<stdio.h>
int letter(char);
void main()
{
	char b,a;
	printf("Enter a character :");
	scanf("%c",&a);
	b=letter(a);
	printf("%c=%c",a,b);
}
int letter(x)
{
	int a,z,r;
	if(x<=a && x<=z)
	{
		r=x-32;
		return r;
	}
	else
	{
		r=x+32;
		return r;
	}
}
