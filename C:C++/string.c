/* this program shows string input and other primitive input
   such as float and char 
   file: string.c, compile: cc string.c, and run command: ./a.out
*/

# include <stdio.h>
# include <stdlib.h> 
# include <string.h>

typedef  struct rec {
  int i;
  float x;
  char a[10];
} RECORD;

int main(){
  char *str;
  float *ptr_x;
  RECORD r; /* static record r */
  printf("Enter an int  number: ");
  scanf("%d", &r.i);
  ptr_x =  (float *) malloc (sizeof(float));
  if(ptr_x == 0){
    printf("Float memory allocation failed\n");
    return 1;
  }
  printf("Enter a real number: ");
  scanf("%f", ptr_x);
  r.x = *ptr_x;
  str = (char * ) malloc(10*sizeof(char)); 
  if(str == 0){
    printf("String memory allocation failed\n");
    return 1;
  }
  printf("Enter a code word: ");
  scanf("%s", str);
  strcpy(r.a, str); 
  printf("You have entered r.i = %d, r.x = %4.2f, r.a = %s\n", 
                   r.i, r.x, r.a);
  
  free(ptr_x);
  free(str);  
  return 0;
} 
