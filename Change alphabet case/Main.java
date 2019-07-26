#include <stdio.h>
int main() {
	// Type your code here
    char n;
    scanf("%c",&n);
    if(n >= 65 && n <= 91){
        n = n + 32;
        printf("%c",n);
    }
    else if(n >= 97 && n <= 123){
        n = n - 32;
        printf("%c",n);
    }
    else
      printf("Invalid");
	return 0;
}