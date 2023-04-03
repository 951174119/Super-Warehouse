#include<stdio.h>
#include<stdlib.h>
#define MAXSIZE 40
typedef struct LNode*List;
struct LNode{
	int Data[MAXSIZE];
	int Last;
};
List MakeEmpty()
{
	List PtrL;
	PtrL=(List)malloc(sizeof(struct LNode));
	PtrL->Last=-1;
	return PtrL;
}
int Find(int x,List PtrL)
{
	int i=0;
	while(i<=PtrL->Last&&PtrL->Data[i]!=x)
	i++;
	if(i>PtrL->Last)
	return -1;
	else
	return i;
};
void Insert(int x,int i,List PtrL)
{
	int j;
	if(PtrL->Last ==MAXSIZE)
	{
		printf("表满");
		return;
	}
	if (i<1||i>PtrL->Last+2)
	{
		printf("位置不合法");
		return;
	}
	for(j=PtrL->Last;j>=i-1;j--)
	PtrL->Data[j+1]=PtrL->Data[j];
	PtrL->Data[i-1]=x;
	PtrL->Last++;
	return;
};
void Delete(int i,List PtrL)
{
	int j;
	if(i<1||i>PtrL->Last+1)
	{
		printf("不存在第%d个元素",i);
		return;
	}
	for(j=i;j<=PtrL->Last;j++)
	PtrL->Data[j-1]=PtrL->Data[j];
	PtrL->Last--;
	return;
}
int main()
{
	List PtrL;
	List MakeEmpty();
	PtrL=MakeEmpty();
	int i;

	for(i=0;i<=30;i++){
	PtrL->Last++;
	PtrL->Data[i]=i+5;
}
	printf("%d",PtrL->Last);
	return 0;
 } 
