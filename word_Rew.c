#include<stdio.h>
main()
{
char a[33][22];
int n;
int i;
printf("enter of words");
scanf("%d",&n);
printf("enter a string");
for( i=0;i<n;i++){
    scanf("%s",a[i]);
}
for(i=n-1;i>=0;i--){
    printf("\t%s",a[i]);
}

}
