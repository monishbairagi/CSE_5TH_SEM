#include<stdio.h>
#include<stdlib.h>
char state[5],spoon[5];
main()
{
int ch,n,i;
printf("\n Dining Philosopher's Problem:");
printf("\n...........................................\n");
for(i=0;i<5;i++)
{
state[i]='T';
spoon[i]='F';
}
do
{
printf("\n\n\nState of each philososphers:");
printf("\nPhil\tThink/Eat/Hungry\tSpoon(Free/Busy)");
for(i=0;i<5;i++)
printf("\n  %d\t\t%c\t\t\t%c",i+1,state[i],spoon[i]);
printf("\n\n1.Hungry\n2.Eating Completed\n3.Exit");
printf("\nEnter your choice:");
scanf("%d",&ch);
switch(ch)
{
case 1:
printf("\nEnter wchich philosophers is Hungry:");
scanf("%d",&n);
if(spoon[n-1]=='F'&&spoon[n%5]=='F'&&state[n-1]=='T')
{
spoon[n-1]=spoon[n%5]='B';
state[n-1]='E';
}
else if(state[n-1]=='T')
{
state[n-1]='H';
printf("\nSpoon is Busy");
}
else
printf("\nPhil %d is already either Hungry or Eating",n);
break;
case 2:
printf("\n Enter which Philosopher is completed Eating :");
scanf("%d",&n);
if(spoon[n-1]=='B'&&spoon[n%5]=='B')
{
spoon[n-1]=spoon[n%5]='F';
state[n-1]='T';
for(i=0;i<5;i++)
{
if(state[i]=='H'&&spoon[i]=='F'&&spoon[(i+1)%5]=='F')
{
spoon[i]=spoon[(i+1)%5]='B';
state[i]='E';
}
}
}
else
printf("\nPhil %d is already Thinking",n);
break;
case 3:
exit(0);
default:
printf("\nWrong Choice");
}
}while(1);
}