#include<stdio.h>
#include<math.h>
int main()
{
  int bi, de = 0, oc[100], temp, i, count = 0;
  scanf("%d",&bi);
  for(i=0;bi!=0;i++){
    temp = bi % 10;
    temp = temp * pow(2,i);
    de = de + temp;
    bi = bi / 10;
  }
  for(i=0;de>0;i++){
    temp = de % 8;
    de = de / 8;
    oc[i] = temp;
    count++;
  }
  count--;
  for(i=count;i>=0;i--){
    printf("%d",oc[i]);
  }
  return 0;
}