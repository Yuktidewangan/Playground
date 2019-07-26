#include<stdio.h>
int main()
{
  int n, n1 = 0, n2 = 1, i = 1, temp;
  scanf("%d",&n);
  for(i=1;i<=n;i++){
    if(i == 1){
      printf("0 ");
    }
    else if(i == 2){
      printf("1 ");
    }
    else{
        temp = n1 + n2;
        printf("%d ",temp);
        n1 = n2;
        n2 = temp;
     }
  }
  return 0;
}