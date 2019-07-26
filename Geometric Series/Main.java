#include<stdio.h>
int main()
{
  int n, s1 = 1, s2 = 1, i, temp = 0;
  scanf("%d",&n);
  if(n == 1){
    printf("%d",s1);
  }
  else if(n == 2){
    printf("%d",s2);
  }  
  else{
    for(i=3;i<=n;i++){
      if(i % 2 != 0){
        s1 = s1 * 2;
        temp = s1;
      }
      else{
        s2 = s2 * 3;
        temp = s2;
      }
    }
    
    printf("%d",temp);
  }
  return 0;
}