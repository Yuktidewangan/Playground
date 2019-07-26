#include<stdio.h>
int main()
{
  char n[100];
  int i, count = 0;
  gets(n);
  for(i=0;n[i]!='\0';i++){
  	count++;
  }
  printf("%d",count);
  return 0;
}