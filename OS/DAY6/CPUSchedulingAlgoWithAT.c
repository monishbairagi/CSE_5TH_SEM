#include<stdio.h>

struct Process{
	int n; // Process Number
	int p; // Priority
	int a; // Arrival Time
	int b; // Burst Time
	int r; // Remaining Time
	int t; // Turn Around Time = Completion Time - Arival Time
	int w; // Waiting time = Turn Around Time - Burst Time
};

void printAllData(struct Process p[],int n){
	int i,j;
	struct Process t;
	for(i=1;i<=n;i++){	// Sorting according to Process Number
		for(j=i+1;j<=n;j++){
			if(p[i].n>p[j].n){
				t = p[i];
				p[i] = p[j];
				p[j] = t;
			}
		}
	}
	printf("--------------------------------------------\n");
	printf("PRI\tPID\tAT\tBT\tTAT\tWT\n");
	printf("--------------------------------------------\n");
	for(i=1;i<=n;i++){
		printf("%d\tP%d\t%d\t%d\t%d\t%d\n",p[i].p,p[i].n,p[i].a,p[i].b,p[i].t,p[i].w);
	}
	printf("--------------------------------------------\n");
}

float FCFS(struct Process p[],int n){
	// First Come First Serve Scheduling Algorithm
	int i, time=0;
	float awt=0, atat=0;
	for(i=1;i<=n;i++){
		time += p[i].b;
		p[i].r = 0;
		p[i].t = time - p[i].a;
		p[i].w = p[i].t - p[i].b;
		awt += p[i].w;
		atat += p[i].t;
	}
	awt /= n;
	atat /= n;
	printf("\n--------------------------------------------\n");
	printf("First Come First Serve Scheduling Algorithm\n");
	printAllData(p,n);
	printf("Average Turnaround Time: %.2f\n",atat);
	printf("Average Waiting Time   : %.2f\n",awt);
	return awt;
}

float PSA(struct Process p[],int n){
	// Priority Scheduling Algorithm
	int i, j, time=0;
	struct Process t;
	float awt=0, atat=0;
	for(i=1;i<=n;i++){
		if(p[i].a==0 && p[1].a>time){
			time += p[i].b;
			p[i].r = 0;
			p[i].t = time - p[i].a;
			p[i].w = p[i].t - p[i].b;
			awt += p[i].w;
			atat += p[i].t;
		}
	}
	for(i=1;i<=n;i++){
		if(p[i].r!=0){
			time += p[i].b;
			p[i].r = 0;
			p[i].t = time - p[i].a;
			p[i].w = p[i].t - p[i].b;
			awt += p[i].w;
			atat += p[i].t;
		}
	}
	awt /= n;
	atat /= n;
	printf("\n--------------------------------------------\n");
	printf("Priority Scheduling Algorithm\n");
	printAllData(p,n);
	printf("Average Turnaround Time: %.2f\n",atat);
	printf("Average Waiting Time   : %.2f\n",awt);
	return awt;
}

void main(){
	int i,n,tq;
	printf("Enter Total Number of Processes: ");
	scanf("%d",&n);
	struct Process p[n+1];
	printf("Enter Time Quantum of Processes: ");
	scanf("%d",&tq);
	for(i=1;i<=n;i++){
		printf("Enter Priority, Arrival Time and Burst Time of Process-%d: ",i);
		scanf("%d%d%d",&p[i].p,&p[i].a,&p[i].b);
		p[i].n = i;
		p[i].r = p[i].b;
	}
	float fcfs = FCFS(p,n);
	float psa = PSA(p,n);
}
