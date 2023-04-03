#include<stdio.h>
#include<stdlib.h>
typedef struct LNode*List;
struct LNode{
	int Data;
	List Next;
};
int Length(List PtrL)//求表长 
{
	List p=PtrL;
	int j=0;
	while(p){
		p=p->Next;
		j++;
	}
	return j;
}
List FindKth(int K,List PtrL)//按序号查找 
{
	List p=PtrL;
	int i=1;
	while(p!=NULL&&i<K)
	{
		p=p->Next;
		i++;
	}
	if(i==K)
	return p;
	else return NULL;
}
List Find(int x,List PtrL)//按值查找 
{
	List p=PtrL;
	while(p!=NULL&&p->Data!=x)
	p=p->Next;
	return p;
}
List Insert(int x,int i,List PtrL)//插入操作 
{
	List p,s;
	if(i==1)
	{
		s=(List)malloc(sizeof(struct LNode));
		s->Data=x;
		s->Next=PtrL;
		return s;
	}
	p=FindKth(i-1,PtrL);
	if(p==NULL)
	{
		printf("参数错");
		return NULL; 
	}
	else
	{
		s=(List)malloc(sizeof(struct LNode));
		s->Data=x;
		s->Next=p->Next;
		p->Next=s;
		return PtrL;
	}
}
List Delete(int i,List PtrL)//删除 
{
	List p,s;
	if(i==1)
	{
		s=PtrL;
		if(PtrL!=NULL)PtrL=PtrL->Next;
		else return NULL;
		free(s);
		return PtrL;
	}
	p=FindKth(i-1,PtrL);
	if(p==NULL)
	{
		printf("第%d个结点不存在",i-1);
		return NULL;
	}
	else if(p->Next==NULL)
	{
		printf("第%d个结点不存在",i);
		return NULL;
	}
	else
	{
		s=p->Next;
		p->Next=s->Next;
		free(s);
		return PtrL;
	}
}
int main()
{
	List p;
	Insert(1,1,p);
	Insert(5,2,p);
	Insert(6,3,p);
	printf("%d",FindKth(2,p)->Data);
	return 0;
}
