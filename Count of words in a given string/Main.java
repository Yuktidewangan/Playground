#include<stdio.h>
int main()
{
  char arr[100];
  int count = 0, i, len;
  gets(arr);
  len = strlen(arr);
  for(i=0;i<len;i++){
    if(arr[i] != ' ' && arr[i+1] == ' '){
      count++;
    }
  }
  printf("%d",count+1);
  return 0;
}