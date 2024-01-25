//wap to to create structure name employee having emp-id emp-name, emp post and salary
//display the employee having salary more than 15000
 #include<stdio.h>
 struct employee
 {
 	int emp_id;
 	char emp_name[50];
 	char emp_post[40];
 	float emp_salary;
 };
 void main()
 {
 	struct employee e[10];
 	int i;
 	for(i=0;i<3;i++)
 	{
 		printf("Enter the detail of employee:\n");
 		printf("Employee id :");
 		scanf("%d",&e[i].emp_id);
 		printf("name:");
 		fflush(stdin);
 		scanf("%s",&e[i].emp_name);
 		printf("Post: ");
 		scanf("%s",&e[i].emp_post);
 		printf("Salary :");
 		scanf("%f",&e[i].emp_salary);
	 }
	 printf("Displaying the detail of employee having salary more than 15000\n");
	 for(i=0;i<3;i++)
	 {
	 	if (e[i].emp_salary>15000)
	 	{
	 		printf("ID : %d\n",e[i].emp_id);
	 		printf("Name : %s\n",e[i].emp_name);
	 		printf("Post : %s\n",e[i].emp_post);
	 		printf("Salary: %.2f\n",e[i].emp_salary);
		 }
	 }
	 
 }
