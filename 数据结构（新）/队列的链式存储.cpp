#include<stdio.h>
#include<stdlib.h>
#define ERROR -1
struct Node{
	int Data;
	struct Node*Next;
};
struct QNode{
	struct Node*rear;//ָ���β��� 
	struct Node*front;//ָ���ͷ��� 
};
typedef struct QNode*Queue;
Queue PtrQ;
int DeleteQ(Queue PtrQ)//���� 
{
	struct Node*FrontCell;
	int FrontElem;
	if(PtrQ->front==NULL)
	{
		printf("���п�");
		return ERROR; 
	}
	FrontCell=PtrQ->front;
	if(PtrQ->front==PtrQ->rear)//����ֻ��һ��Ԫ�� 
	PtrQ->front=PtrQ->rear=NULL;//ɾ�������Ϊ�� 
	else
	PtrQ->front=PtrQ->front->Next;
	FrontElem=FrontCell->Data;
	free(FrontCell);
	return FrontElem;
}
void AddQ(Queue PtrQ,int item)
