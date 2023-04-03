#include<stdio.h>
#include<stdlib.h>
typedef struct SNode*Stack;
struct SNode{
	int Data;
	struct SNode*Next;
};
Stack CreateStack()//½¨Á¢¿ÕÕ» 
{
	Stack S;
	S=(Stack)malloc(sizeof(struct SNode));
	S->Next=NULL;
	return S;
}
int IsEmpty(Stack S)//ÅÐ¶Ï¶ÑÕ»SÊÇ·ñÎª¿Õ£¬ÈôÎª¿Õº¯Êý·µ»ØÕûÊý1£¬·ñÔò·µ»Ø0 
{
	return(S->Next==NULL);
}
void Push(int item,Stack S)//ÈëÕ» 
{
	struct SNode*TmpCell;
	TmpCell=(struct SNode*)malloc(sizeof(struct SNode));
	TmpCell->Data=item;
	TmpCell->Next=S->Next;
	S->Next=TmpCell;
}
int Pop(Stack S)//É¾³ý²¢·µ»Ø¶ÑÕ»SµÄÕ»¶¥ÔªËØ 
{
	struct SNode *FirstCell;
	int TopElem;
	if(IsEmpty(S))
	{
		printf("¶ÑÕ»¿Õ");
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
