#include<stdio.h>
#include<string.h>
int main()
{
  char str[3][100], a;
  int i, j;
  for(i=0;i<3;i++){
  	scanf("%s",str[i]);
  }
  for(i=0;i<3;i++){
    if(i == 0){
    for(j=0;str[i][j]!='\0';j++){
      a = str[i][j];
      if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' || a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U'){
        str[i][j] = '$';
      }
      printf("%c",str[i][j]);
    }
    }
    if(i == 1){
    for(j=0;str[i][j]!='\0';j++){
      a = str[i][j];
      if(a != 'a' && a != 'e' && a != 'i' && a != 'o' && a != 'u' && a != 'A' && a != 'E' && a != 'I' && a != 'O' && a != 'U'){
        str[i][j] = '#';
      }
      printf("%c",str[i][j]);
    }
    }
    if(i == 2){
    for(j=0;str[i][j]!='\0';j++){
      if(str[i][j] >= 'a' && str[i][j] <= 'z'){
      str[i][j] = str[i][j] - 32;
      }
      printf("%c",str[i][j]);
    }
    }
  }
    return 0; 
}