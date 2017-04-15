#include<stdio.h>
#include<malloc.h>
int main(){
int i,j,n,arr[30][30],max=-9,*sum,tsum=0;
scanf("%d",&n);
sum=(int *)malloc(sizeof(int)*n);
for(i=0;i<n;i++){
    for(j=0;j<=i;j++){
        scanf("%d",&arr[i][j]);
if(arr[i][j]>max)
    max=arr[i][j];

    }
    sum[i]=max;
max=0;

}
printf("<");
for(i=0;i<n;i++){
    printf("%d",sum[i]);
    tsum+=sum[i];
    if(i==n-1)
        break;
    else printf(",");
}
printf(">,sum=");
for(i=0;i<n;i++){
    printf("%d",sum[i]);
    if(i==n-1)
        break;
    else printf("+");
}
printf("=%d",tsum);

return 0;
}
