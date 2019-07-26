#include<stdio.h>
int main()
{
    int size, i, max;
    scanf("%d",&size);
    int arr[size];
  	for(i=0;i<size;i++){
    	scanf("%d",&arr[i]);
    }
    max = arr[0];
    for(i=0;i<size;i++){
      	if(arr[i] > max){
           max = arr[i]; 
        }
    }
    printf("%d",max);
}