#include<stdio.h>
int main()
{
  int size;
  scanf("%d",&size);
  int arr[size], n1, n2, i, pos1 = -1, pos2 = -1;
  for(i=0;i<size;i++){
    	scanf("%d",&arr[i]);
    }
  scanf("%d%d",&n1,&n2);
    for(i=0;i<size;i++){
      	if(arr[i] == n1){
          pos1 = i;
        }
        if(arr[i] == n2){
          pos2 = i;
        }
    }
    printf("Element 1 index = %d\nElement 2 index = %d",pos1,pos2);
  return 0;
}