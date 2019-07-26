#include<stdio.h>
int main()
{
  int n, size, i, count = 0;
  scanf("%d",&size);
  int arr[size];
  for(i = 0;i < size; i++){
    scanf("%d",&arr[i]);
  }
  scanf("%d",&n);
  for(i=0;i<size;i++){
    if(n == arr[i]){
      printf("%d",i+1);
      count++;
    }
  }
  if(count == 0){
    printf("%d isn't present in the array.",n);
  }
  return 0;
}