#include<stdio.h>
#include<malloc.h>
int main(){
int n,*arr,i,av1=0,av2=0,o=0,e=0,j;
printf("Enter size of array");
scanf("%d",&n);
arr=(int *)malloc(sizeof(int)*n);
for(i=0;i<n;i++){
scanf("%d",&arr[i]);
}
if(n%2!=0){
for(i=0;i<=n/2;i++){
        av1+=arr[i];
        o++;
}
for(j=i;j<n;j++){
    av2+=arr[j];
    e++;
}
}
else{
for(i=0;i<n/2;i++){
        av1+=arr[i];
        o++;
}
for(j=i;j<n;j++){
    av2+=arr[j];
    e++;
}
}
if(av1/o==av2/e){
if(n%2!=0){
        printf("[");
for(i=0;i<=n/2;i++){
        printf("%d",arr[i]);
        if(i==n/2)
            break;
        else
            printf(",");

}
printf("][");
for(j=i+1;j<n;j++){
    printf("%d",arr[j]);
    if(j==n-1)
        break;
        else
            printf(",");
}
printf("]");
}
else{
        printf("[");
for(i=0;i<n/2;i++){
        printf("%d",arr[i]);
        if(i==(n/2)-1)
            break;
        else
            printf(",");
}
printf("][");
for(j=i+1;j<n;j++){
    printf("%d",arr[j]);
    if(j==n-1)
        break;
        else
            printf(",");
}
printf("]");
}
}else{
printf("\nNot possible");
}

return 0;
}
