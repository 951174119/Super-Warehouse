#include<stdio.h>
#include<stdlib.h>
#define MAXSIZE 40
#define ERROR -1
typedef struct SNode*Stack;
struct SNode{
	int Data[MAXSIZE];
	int Top;
};
void Push(Stack PtrS,int item)//ÈëÕ» 
{
	if(PtrS->Top==MAXSIZE-1)
	{
		printf("¶ÑÕ»Âú");
		return; 
	}
	else
	{
		PtrS->Data[++(PtrS->Top)]=item;
		return;	
	}
}
int Pop(Stack PtrS)//³öÕ» 
{
	if(PtrS->Top==-1)
	{
		printf("¶ÑÕ»¿Õ");
		return ERROR; 
	}
	else
	return(PtrS->Data[(PtrS->Top)--]);
}

