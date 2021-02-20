#include<stdio.h>

void main(){
	int id = fork();
	if(id > 0){ // parent body
		sleep(5);
		printf("This is Parent Process\n");
	}else{// child body
		printf("This is Child Process\n");
		exit(0);
	}
}
