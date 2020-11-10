/*
Coder: Monish Kumar Bairagi
Title:	Write a C program to create two child processes from a single parent 
		and to prove they belong to the same parent.
*/
#include<stdio.h>

void main(){
   int id = fork();
   if(id==0){  // child-A body
        printf("PPID of Child-A: %d\n",getppid());
   }
   else{
      id = fork();
      if(id==0){  // child-B body
        printf("PPID of Child-B: %d\n",getppid());
      }
      else{  // parent body
        printf("PID of Parent: %d\n",getpid());
      }
   }
}
