/*AIM:
To calculate average waiting time and average turnaround time using First Come First Serve
Scheduling Algorithm
PROCEDURE:
STEP1: - First take user input of Total number of process (maximum 20).
STEP2: - use for loop to take user input Burst time.
STEP3: - use for loop to calculate the Burst time and Waiting time.
STEP4: - after that arrange the process, burst time, waiting time, and Turnaround time in tabular
format and print it using for loop.
STEP5: - then calculate and print the average waiting time and average turnaround time.
PROGRAM:*/
#include<stdio.h>
int main()
{
int n,bt[20],wt[20],tat[20],avwt=0,avtat=0,i,j;
printf("Enter total number of processes(maximum 20):");
scanf("%d",&n);
printf("\nEnter Process Burst Time\n");
for(i=0;i<n;i++)
{
printf("P[%d]:",i+1);
scanf("%d",&bt[i]);
}
wt[0]=0; //waiting time for first process is 0
//calculating waiting time
for(i=1;i<n;i++)
{
 
wt[i]=0;
for(j=0;j<i;j++)
wt[i]+=bt[j];
}
printf("\nProcess\t\tBurst Time\tWaiting Time\tTurnaround Time");
//calculating turnaround time
for(i=0;i<n;i++)
{
tat[i]=bt[i]+wt[i];
avwt+=wt[i];
avtat+=tat[i];
printf("\nP[%d]\t\t%d\t\t%d\t\t%d",i+1,bt[i],wt[i],tat[i]);
}
avwt/=i;
avtat/=i;
printf("\n\nAverage Waiting Time:%d",avwt);
printf("\nAverage Turnaround Time:%d",avtat);
return 0;
}