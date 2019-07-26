#include<stdio.h>
int main()
{
  float si, p, n, r;
  scanf("%f%f%f",&p,&n,&r);
  si = (p * n * r) / 100;
  printf("%f",si);
  return 0;
}