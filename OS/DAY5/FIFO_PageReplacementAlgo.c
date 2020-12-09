#include<stdio.h>

void FIFOPRA(int p[],int tp,int tf){
	// FIFI Page Replacement Algorithm
	int f[tf], c = -1, i, j, hit = 0, miss = 0;
	for(i=0;i<tf;i++){
		f[i] = -1;
	}
	for(i=0;i<tp;i++){
		for(j=0;j<tf;j++){	// Page Hit
			if(p[i]==f[j]){
				hit++;
				printf("%d [ Hit  ] ",p[i]);
				for(j=0;j<tf;j++){
					if(f[j]==-1){
						printf(". ");
					}
					else{
						printf("%d ",f[j]);	
					}
				}
				printf("\n");
				continue;
			}
		}
		if(j==tf){	// Page Miss
			miss++;
			c=(c+1)%tf;
			f[c]=p[i];
			printf("%d [ Miss ] ",p[i]);
			for(j=0;j<tf;j++){
				if(f[j]==-1){
					printf(". ");
				}
				else{
					printf("%d ",f[j]);	
				}
			}
			printf("\n");
		}
	}
	printf("Page Hit : %d Times\n",hit);
	printf("Page Miss: %d Times\n",miss);
	printf("Page Hit  Ratio: %.3f\n",(float)hit/(hit+miss));
	printf("Page Miss Ratio: %.3f\n",(float)miss/(hit+miss));
}

void main(){
	int tp,tf,i;
	printf("Enter Total Number of Pages: ");
	scanf("%d",&tp);
	int p[tp];
	printf("Enter Pages: ");
	for(i=0;i<tp;i++){
		scanf("%d",&p[i]);
	}
	printf("Enter Total Number of Frames: ");
	scanf("%d",&tf);
	FIFOPRA(p,tp,tf);
}
