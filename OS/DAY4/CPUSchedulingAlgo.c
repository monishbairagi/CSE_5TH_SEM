#include<stdio.h>

struct Process{
	int n; // Process Number
	int p; // Priority
	int b; // Burst Time
	int r; // Remaining Time
	int t; // Turn Around Time = Completion Time (When Arival Time = 0)
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
	printf("PRI\tPID\tBT\tTAT\tWT\n");
	printf("--------------------------------------------\n");
	for(i=1;i<=n;i++){
		printf("%d\tP%d\t%d\t%d\t%d\n",p[i].p,p[i].n,p[i].b,p[i].t,p[i].w);
	}
	printf("--------------------------------------------\n");
}

float FCFS(struct Process p[],int n){
	// First Come First Serve Scheduling Algorithm
	int i, time=0;
	float awt=0, atat=0;
	for(i=1;i<=n;i++){
		time += p[i].b;
		p[i].r =- p[i].b;
		p[i].t = time;
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

float SJF(struct Process p[],int n){
	// Shortest Job First Scheduling Algorithm
	int i, j, time=0;
	struct Process t;
	float awt=0, atat=0;
	for(i=1;i<=n;i++){	// Sorting according to Burst Time
		for(j=i+1;j<=n;j++){
			if(p[i].b>p[j].b){
				t = p[i];
				p[i] = p[j];
				p[j] = t;
			}
		}
	}
	for(i=1;i<=n;i++){
		time += p[i].b;
		p[i].r -= p[i].b;
		p[i].t = time;
		p[i].w = p[i].t - p[i].b;
		awt += p[i].w;
		atat += p[i].t;
	}
	awt /= n;
	atat /= n;
	printf("\n--------------------------------------------\n");
	printf("Shortest Job First Scheduling Algorithm\n");
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
	for(i=1;i<=n;i++){	// Sorting according to Priority
		for(j=i+1;j<=n;j++){
			if(p[i].p>p[j].p){
				t = p[i];
				p[i] = p[j];
				p[j] = t;
			}
		}
	}
	for(i=1;i<=n;i++){
		time += p[i].b;
		p[i].r -= p[i].b;
		p[i].t = time;
		p[i].w = p[i].t - p[i].b;
		awt += p[i].w;
		atat += p[i].t;
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

float RR(struct Process p[],int n,int tq){
	// Round Robin Scheduling Algorithm
	int i, j, mr, mbt = p[1].b, time=0;
	float awt=0, atat=0;
	for(i=2;i<=n;i++){
		if(p[i].b>mbt){
			mbt = p[i].b;
		}
	}
	if(mbt%tq==0){
		mr = mbt/tq;
	}else{
		mr = mbt/tq + 1;
	}
	for(i=0;i<mr;i++){
		for(j=1;j<=n;j++){
			if(p[j].r==0){
				continue;
			}
			if(p[j].r>tq){
				time += tq;
				p[j].r -= tq;
			}
			else if(p[j].r<=tq){
				time += p[j].r;
				p[j].r -= p[j].r;
				p[j].t = time;
				p[j].w = p[j].t - p[j].b;
				awt += p[j].w;
				atat += p[j].t;
			}
		}
	}
	awt /= n;
	atat /= n;
	printf("\n--------------------------------------------\n");
	printf("Round Robin Scheduling Algorithm\n");
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
		printf("Enter Priority and Burst Time of Process-%d: ",i);
		scanf("%d%d",&p[i].p,&p[i].b);
		p[i].n = i;
		p[i].r = p[i].b;
	}
	float rr = RR(p,n,tq);
	float fcfs = FCFS(p,n);
	float sjf = SJF(p,n);
	float psa = PSA(p,n);
	
	if(fcfs<sjf<psa<rr){
		printf("\nSo, First Come First Surve Algorithm will be the best.\n");
	}else if(sjf<psa<rr){
		printf("\nSo, Shortest Job First Algorithm will be the best.\n");
	}else if(psa<rr){
		printf("\nSo, Priority Schedule Algorithm will be the best.\n");
	}else{
		printf("\nSo, Round Robin Algorithm will be the best.\n");
	}
}
