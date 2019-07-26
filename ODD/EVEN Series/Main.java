#include<stdio.h>
int main()
{
	//type your code here
    int n, i, pos, even = 0, odd = 0, result;
	scanf("%d",&n);
    
    if(n == 1 || n == 2){
        result = 0;
        printf("%d",result);
    }
    else{
      pos = 3;
      for(i=3;i<=n;i++){
          if(pos % 2 != 0){
              even = even + 2;
              result = even;
              pos++;
          }
          else{
              odd = odd + 1;
              result = odd;
              pos++;
          }
      }
      printf("%d",result);
    }
}