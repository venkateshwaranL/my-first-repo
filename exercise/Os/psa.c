/*AIM:
To arrange the process in terms of priority for the execution using priority scheduling
algorithm.
PROCEDURE:
STEP1: - First create a swap function to swap two variables using third variable.
STEP2: - then in main function take user input of number of processes.
STEP3: - create three arrays for Burst time, priority and index and by using for loop enter the
Burst time and Priority value of each process.
STEP4: - use for loop to re-arrange the process on the basis of priority by using swap function
we were created in the starting.
STEP5: - after that print the scheduled processes Process id, burst time, Wait time, Turnaround
time.
PROGRAM:*/
#include <stdio.h>
//Function to swap two variables
void swap(int *a,int *b)
{
int temp=*a;
*a=*b;
*b=temp;
}
int main()
{
int n;
 
printf("Enter Number of Processes: ");
scanf("%d",&n);
 
// b is array for burst time, p for priority and index for process id
int b[n],p[n],index[n];
for(int i=0;i<n;i++)
{
printf("Enter Burst Time and Priority Value for Process %d: ",i+1);
scanf("%d %d",&b[i],&p[i]);
index[i]=i+1;
}
for(int i=0;i<n;i++)
{
int a=p[i],m=i;
 
//Finding out highest priority element and placing it at its desired position
for(int j=i;j<n;j++)
{
if(p[j] > a)
{
a=p[j];
m=j;
}
}
 
//Swapping processes
 
swap(&p[i], &p[m]);
swap(&b[i], &b[m]);
swap(&index[i],&index[m]);
}
 
// T stores the starting time of process
int t=0;
 
//Printing scheduled process
printf("Order of process Execution is\n");
for(int i=0;i<n;i++)
{
printf("P%d is executed from %d to %d\n",index[i],t,t+b[i]);
t+=b[i];
}
printf("\n");
printf("Process Id Burst Time Wait Time TurnAround Time\n");
int wait_time=0;
for(int i=0;i<n;i++)
{
printf("P%d %d %d %d\n",index[i],b[i],wait_time,wait_time + b[i]);
wait_time += b[i];
}
return 0;
}