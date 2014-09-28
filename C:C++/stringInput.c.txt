
/* this program accept a number and two input strings from keyboard 
   and display on screen
   compilation: cc -o prog1 prog1.c
   file: prog1.c
*/
#include <stdio.h>
#include <string.h>
int main(){
  int x;
  printf("Enter a number: ");
  scanf("%d", &x);
  printf("Enter your name first name last name:");
  char s1[50], s2[50];
  scanf("%s %s", s1, s2);
  printf("The strings you entered are %s", s1);
  printf(" and %s\n", s2);
  return 0;
}
