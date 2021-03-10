#include<stdio.h>
#include<stdlib.h>

void main(){
	int id = fork();
	if(id > 0){ // parent body
		exit(0);
		printf("This is Parent Process\n");
	}else{ // child body - Orphan Process
		printf("This is Child Process\n");
		sleep(5);
	}
}
