#include<stdio.h>
#include<math.h>
#include<time.h>
#include<assert.h>
#include<curses.h>
#include<ncurses.h>
 // compile with gcc -oproject4 -lncurses project4.c

void main()
{
    int m1[10][10],i,j,k,m2[10][10],add[10][10],mult[10][10],r1,c1,r2,c2;
    /*double dif;
    time_t start, end;*/

    clock_t start, stop;
    double t = 0.0;

    printf("Enter Matrix A Size(two numbers) Max 10\n");
    scanf("%d%d",&r1,&c1);
    printf("Enter Matrix B Size(two numbers) Max 10\n");
    scanf("%d%d",&r2,&c2);
    if(r2==c1)
{

        printf("Enter rows and columns of First matrix \n");
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
                scanf("%d",&m1[i][j]);
        }
        printf("Enter rows and columns of Second matrix \n");
        for(i=0;i<r2;i++)
        {
            for(j=0;j<c2;j++)
                scanf("%d",&m2[i][j]);
        }
        printf("Matrix A:\n");
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
                printf("%d\t",m1[i][j]);
            printf("\n");
            }
    
        printf("Matrix B:\n");
        for(i=0;i<r2;i++)
        {
            for(j=0;j<c2;j++)
                printf("%d\t",m2[i][j]);
            printf("\n");
        }
        /*time (&start);*/
          /* Start timer */
        start = clock();
        assert(start != -1);
        printf("The Product of A * B is C =\n");
        /*a11xA11+a12xA21+a13xA31 a11xA12+a12xA22+a13xA32 a11xA13+a12xA23+a13xA33*/
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c2;j++)
            {
                mult[i][j]=0;
                for(k=0;k<r1;k++)
                {
                    mult[i][j]+=m1[i][k]*m2[k][j];
                    /*mult[0][0]=m1[0][0]*m2[0][0]+m1[0][1]*m2[1][0]+m1[0][2]*m2[2][0];*/
                }
                printf("%d\t",mult[i][j]);
            }
            printf("\n");
            /*time (&end);
            dif (difftime (end, start);
            printf("Time of execution is : %f\n",dif)*/
        }

        stop = clock();
        t = (double) (stop-start)/CLOCKS_PER_SEC; 
        printf("Execution time for sack dynamic declarations = %f\n", t);
        printf("Execution time for without stack dynamic delecrations =\n" );
        printf("Static variable declaration is more efficeint than stack dynamic variables declaration\n");
        

           return(0);
    }
    else
    {
        printf("Matrix multiplication cannot be done");
    }
}
