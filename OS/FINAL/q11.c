#include<stdio.h>

void main(){
   int id = fork();
   if(id==0){  // child-A body
        printf("PID of Child: %d\n",getpid());
   }else{  // parent body
        printf("PID of Parent: %d\n",getpid());
		printf("PPID of Parent: %d\n",getppid());
	}
}