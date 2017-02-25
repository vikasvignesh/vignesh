#include<stdio.h>
#include<conio.h>
void main()
{
int a[4]={2,7,11,15};
int target=9,t,i,j;
for(i=0;i<4;i++){
        for(j=0;j<4;j++){
           // printf("i=%dj=%d",i,j);
                if(i!=j){
                    //printf("i=%dj=%d",i,j);
                        t=a[i]+a[j];
        if(t==target){
            printf("%d %d\n",a[i],a[j]);
        }
       }
        else{

        }
        }

}
}
