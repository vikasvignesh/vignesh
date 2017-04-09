#include<stdio.h>
#include<malloc.h>
int main()
{
    int *arr,n,i,j,c=0;
    printf("Enter the number of element");
    scanf("%d",&n);
    arr=(int *)malloc(sizeof(int)*n);
    for(i=0;i<n;i++){
       scanf("%d",arr+i);
    }
    for(i=0;i<n;i++){
        for(j=i+1;j<n;j++){
            if(arr[i]==arr[j]){
                arr[j]=0;
                c++;
            }
        }
        if(c==0){
            arr[i]=0;}
            c=0;
    }
    for(i=0;i<n;i++){
            if(arr[i]!='\0')
        printf("%d",arr[i]);
    }
    return 0;
}
