#include<stdio.h>
#include<stdlib.h>
typedef struct SNode*Stack;
struct SNode{
	int Data;
	struct SNode*Next;
};
Stack CreateStack()//������ջ 
{
	Stack S;
	S=(Stack)malloc(sizeof(struct SNode));
	S->Next=NULL;
	return S;
}
int IsEmpty(Stack S)//�ж϶�ջS�Ƿ�Ϊ�գ���Ϊ�պ�����������1�����򷵻�0 
{
	return(S->Next==NULL);
}
void Push(int item,Stack S)//��ջ 
{
	struct SNode*TmpCell;
	TmpCell=(struct SNode*)malloc(sizeof(struct SNode));
	TmpCell->Data=item;
	TmpCell->Next=S->Next;
	S->Next=TmpCell;
}
int Pop(Stack S)//ɾ�������ض�ջS��ջ��Ԫ�� 
{
	struct SNode *FirstCell;
	int TopElem;
	if(IsEmpty(S))
	{
		printf("��ջ��");
		return NULL;
	}
	else
	{
		FirstCell=S->Next;
		S->Next=FirstCell->Next;
		TopElem=FirstCell->Data;
		free(FirstCell);
		return TopElem;
	}
}
