#include<stdio.h>
#include<math.h>
int main()
{
  int n, temp, i, sum = 0;
  scanf("%d",&n);
  for(i=0;n != 0;i++){
    temp = n % 10;
    temp = temp * pow(2,i);
    sum = sum + temp;
    n = n / 10;
  }
  printf("%d",sum);
  return 0;
}