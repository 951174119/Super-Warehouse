#include<stdio.h>
#define MAXSIZE 50
struct DStack{
	int Data[MAXSIZE];
	int Top1;
	int Top2; 
}S;
void Push(struct DStack *PtrS,int item,int Tag)
{
	if(PtrS->Top2-PtrS->Top1==1)
	{
		printf("��ջ��");
		return;
	}
	if(Tag==1)
		PtrS->Data[++(PtrS->Top1)]=item;
	else
		PtrS->Data[--(PtrS->Top2)]=item;
}
int Pop(struct DStack *PtrS,int Tag)
{
	if(Tag==1)
	{
		if(PtrS->Top1==-1)
		{
			printf("��ջ1��");
			return NULL; 
		}
		else return PtrS->Data[(PtrS->Top1)--];
	}
	else{
		if(PtrS->Top2==MAXSIZE)
		{
			printf("��ջ2��");
			return NULL; 
		}
		else
		return PtrS->Data[(PtrS->Top2)++];
	}
}
