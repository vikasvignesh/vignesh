#include<stdio.h>
#include<string.h>
main(){
char a[50],b[50];
int l1=0,i,j=0,l2;
scanf("%s",a);
scanf("%s",b);
l1=strlen(a);
l2=strlen(b);
for(i=l1;i<l1+l2;i++){
a[i]=b[j];
j++;
}
a[i]='\0';
printf("%s",a);
return 0;
}
