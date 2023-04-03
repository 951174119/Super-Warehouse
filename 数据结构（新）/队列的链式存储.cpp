#include<stdio.h>
#include<stdlib.h>
#define ERROR -1
struct Node{
	int Data;
	struct Node*Next;
};
struct QNode{
	struct Node*rear;//指向队尾结点 
	struct Node*front;//指向队头结点 
};
typedef struct QNode*Queue;
Queue PtrQ;
int DeleteQ(Queue PtrQ)//出队 
{
	struct Node*FrontCell;
	int FrontElem;
	if(PtrQ->front==NULL)
	{
		printf("队列空");
		return ERROR; 
	}
	FrontCell=PtrQ->front;
	if(PtrQ->front==PtrQ->rear)//队列只有一个元素 
	PtrQ->front=PtrQ->rear=NULL;//删除后队列为空 
	else
	PtrQ->front=PtrQ->front->Next;
	FrontElem=FrontCell->Data;
	free(FrontCell);
	return FrontElem;
}
void AddQ(Queue PtrQ,int item)
