#include<stdio.h>
#include<string.h>
main()
{
char a[10],b[10];
int l1,i,j,c=0,l2;
printf("Enter a string");
scanf("%s",&a);
printf("Enter the 2 string");
scanf("%s",&b);
l1=strlen(a);
l2=strlen(b);
for(i=0;i<l1;i++)
{
if(a[i]==b[i])
{
c++;
}
}
if(c==l1&&l2){
printf("equal");
}else{
printf("not equal");
}
return 0;
}
