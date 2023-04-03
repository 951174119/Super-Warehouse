#include"student.h" 
bool Init(LinkList &L)
{
	L = (LNode *)malloc(sizeof(LNode));
	L->next = NULL;
	return true;
}
bool Isempty(LinkList L)
{
	if(L->next) 
		return false;
	else return true; 
}
bool Traverse(LinkList L)
{
	if(Isempty(L))
		return false;
	LinkList p;
	p=L->next;
	printf("\t学号\t\t姓名\t成绩\n");
	while(p)
	{
		printf("\t%s",p->data.no);
		printf("\t%s",p->data.name);
		printf("\t%d\n",p->data.score);
		p=p->next;
	}
	return true;
}
LinkList Find(LinkList L,int n) 
{
	LinkList p=L;
	int i=0;
	while(p->next!=NULL&&i<n)
	{
		p=p->next;
		i++;
	}
	if(i==n)
	return p;
	else return NULL;
}
LinkList Insert(LinkList &L,int n,Student A)
{
	LinkList p,s;
	if(n==1)
	{
		p=L;
		s=(LinkList)malloc(sizeof(LNode));
		s->data=A;
		s->next=p->next;
		p->next=s;
		return L;
	}
	p=Find(L,n-1);
	if(p==NULL)
	{
		printf("插入位置不对!\n");
		return NULL;
	}
	else
	{
		s=(LinkList)malloc(sizeof(LNode));
		s->data=A;
		s->next=p->next;
		p->next=s;
		return L;
	}
}
LinkList NameFind(LinkList L,char s[20])
{
	LinkList p;
	p=L->next;
	while(p->next!=NULL&&strcmp(p->data.name,s)!=0)
		p=p->next;
	if(strcmp(p->data.name,s)==0)
		return p;
	return NULL;
}
LinkList Del(LinkList &L,int n)
{
	LinkList p,s;
	if(n==1)
	{
		if(L->next==NULL)
		{
			printf("第%d个结点不存在\n",n);
			return NULL;
		}
		p=L;
		s=p->next;
		p->next=s->next;
		free(s);
	}
	else{
	
	p=Find(L,n-1);
	if(p==NULL||p->next==NULL)
	{
		printf("第%d个结点不存在\n",n);
		return NULL;
	}
	else
	{
		s=p->next;
		p->next=s->next;
		free(s);
		return L;
	}
}
}
int Length(LinkList L)
{
	LinkList p;
	p=L->next;
	int i;
	while(p)
	{
		p=p->next;
		i++;
	 } 
	return i;
}
LinkList noSort(LinkList &L,int n)
{
	LinkList p,s;
	p=L->next;
	s=L->next;
	Student a;
	a=s->data;
	int x=1,d=0;
	if(Isempty(L)||(n!=0&&n!=1))
		return NULL;
	if(n==1) 
	{
	for(int i=2;i<=Length(L);i++)
	{
		for(int j=1;j<=Length(L);j++)
			{
				if(strcmp(s->data.no,a.no)>0)
				{
					a=s->data;
					x=j;
				}
				s=s->next;
			}			
			Del(L,x);
			Insert(L,Length(L)-d,a);
			d++;

			s=p;
		}
	}
	else if(n==0)
	{
		for(int i=2;i<=Length(L);i++)
		{
			for(int j=1;j<=Length(L);j++)
				{
					if(strcmp(s->data.no,a.no)<0)
					{
						a=s->data;
						x=j;
					}
					s=s->next;
				}
			Del(L,x);
			Insert(L,Length(L)-d,a);
			d++;
		
			s=p;
		}
	}
	return L; 
	
}
LinkList scoreSort(LinkList &L,int n)
{
	LinkList p,s;
	p=L->next;
	s=L->next;
	Student a;
	a=s->data;
	int x=1,d=0;
	if(Isempty(L)||(n!=0&&n!=1))
		return NULL;
	if(n==1) 
	{
	for(int i=2;i<=Length(L);i++)
	{
		for(int j=1;j<=Length(L);j++)
			{
				if(s->data.score>a.score)
				{
					a=s->data;
					x=j;
				}
				s=s->next;

			}
			Del(L,x);
			Insert(L,Length(L)-d,a);
			d++;

			s=p;
		}
	}
	else if(n==0)
	{
		for(int i=2;i<=Length(L);i++)
		{
			for(int j=1;j<=Length(L);j++)
				{
					if(s->data.score<a.score)
					{
						a=s->data;
						x=j;
					}
					 s=s->next;
				}	
			Del(L,x);
			Insert(L,Length(L)-d,a);
			d++;

			s=p;
		}
	}
	return L;
}




















