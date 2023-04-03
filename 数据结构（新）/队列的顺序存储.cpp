#include<stdio.h>
#include<stdlib.h>
#define MAXSIZE 40
#define ERROR -1
typedef struct QNode *Queue;
struct QNode{
	int Data[MAXSIZE];
	int rear;
	int front;
};
void AddQ(Queue PtrQ,int item)//����� 
{
	if((PtrQ->rear+1)%MAXSIZE==PtrQ->front)
	{
		printf("������");
		return;
	}
	PtrQ->rear=(PtrQ->rear+1)%MAXSIZE;
	PtrQ->Data[PtrQ->rear]=item;
}
int DeleteQ(Queue PtrQ)
{
	if(PtrQ->front==PtrQ->rear)
	{
		printf("���п�");
		return ERROR;
	}
	else
	{
		PtrQ->front=(PtrQ->front+1)%MAXSIZE;
		return PtrQ->Data[PtrQ->front];
	}
}
