#include<stdio.h>
#include<string.h>
int main()
{
  char str[100], a;
  int len, i;
  scanf("%[^\n]s", str);
  len = strlen(str);
  for(i=0;i<len;i++){
    a = str[i];
    if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' || a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U'){
      continue;
    }
    printf("%c",str[i]);
  }
  return 0;
}