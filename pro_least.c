#include<stdio.h>
#include<string.h>
int main(){
char num[10],max=-1,tem;
int i,j,l=0,del;
printf("Enter the number\n");
scanf("%s",num);
printf("Enter the number element to delete\n");
scanf("%d",&del);
l=strlen(num);
if(del>l){
    printf("enter number below %d\n ",l);
}
for(i=0;i<l;i++){
        for(j=i+1;j<l;j++){
    if(num[i]>num[j]){
        tem=num[i];
        num[i]=num[j];
        num[j]=tem;
    }}
}
i=0;
while(i<del){
        num[l-1]=0;
l--;
i++;
}
printf("The least number after delete %s",num);
}
