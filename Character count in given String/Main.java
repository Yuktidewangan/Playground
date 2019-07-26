#include<stdio.h>
int main()
{
	char arr[20];
    int len, i, count, temp = '\0';
    gets(arr);
    len = strlen(arr);
    if(len > 20){
      printf("Invalid Input");
    }
    else{
      for(i=0;i<len;i++){
        if(temp != arr[i]){
            if(temp != '\0'){
              printf("%c%d",temp,count);
            }
            temp = arr[i];
            count = 1;
            if(i == (len-1)){
              printf("%c%d",temp,(count));
            }
        }
        else{
          count++;
          if(i == (len-1)){
              printf("%c%d",temp,(count));
            }
        }
      }
    }
  return 0;
}