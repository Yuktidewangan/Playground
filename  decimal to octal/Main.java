#include<stdio.h>
int main()
{
  int n, temp, arr[50], length = 0, i=0, l;
  scanf("%d",&n);
  while(n>0){
    temp = n % 8;
    arr [i] = temp;
    n = n / 8;
    i++;
  }
  length = i - 1;
  for(i=length;i>=0;i--){
    printf("%d",arr[i]);
  }
  return 0;
}