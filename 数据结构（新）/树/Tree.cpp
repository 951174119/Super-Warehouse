#include"Tree.h"
void InitTree(BinTree &B)
{
	char s;
	scanf("%c",&s);
	if(s=='0') 
	{
		B=NULL;
		return; 
	}
	B=(BinTree)malloc(sizeof(TreeNode));
	B->ch=s;
	InitTree(B->Left);
	InitTree(B->Right);
}
void Mid(BinTree B)
{
	if(B)
	{
		Mid(B->Left);
		printf("%c",B->ch);
		Mid(B->Right);
	}
	else return;
}
void Front(BinTree B)
{
	if(B)
	{
		printf("%c",B->ch);
		Front(B->Left);
		Front(B->Right);
	}
}
void Rear(BinTree B)
{
	if(B)
	{
		Rear(B->Left);
		Rear(B->Right);
		printf("%c",B->ch);
	}
}
int Depth(BinTree B)
{
	int left,right,depth;
	if(B)
	{
		left=Depth(B->Left);
		right=Depth(B->Right);
		depth=(left>right)?left:right;
		return depth+1;
	}
	else return 0;
}
int Node(BinTree B)
{
	if(B)
	{
		return Node(B->Left)+Node(B->Right)+1;
	 } 
	else return 0;
}
int Leave(BinTree B)
{
	if(!B) return 0;
	if(!B->Left&&!B->Right) return 1;
	else return Leave(B->Left)+Leave(B->Right);
}
int Degree1(BinTree B)
{
	if(!B) return 0;
	if((!B->Left&&B->Right)||(!B->Right&&B->Left)) return 1;
	else return Degree1(B->Left)+Degree1(B->Right); 
}
void Push(Stack &S,char s)
{
	S->string[S->top++]=s;
 } 
char Pop(Stack &S)
 {
 	return S->string[--S->top];
 }
void StackClear(Stack &S)
{
	
	while(S->top!=S->bottom)
	{
		printf("%c",Pop(S));
	}
	printf("\n");
}
void Path(BinTree B,int x,char ans[maxsize])
{
	if (B)
	{
		ans[x] = B->ch;
		if (!B->Left && !B->Right)
		{
			for (int i = x; i >= 1; i--)
				{
					printf("%c",ans[i]);	
				}
				printf("\n");
		}

		else
		{
			Path(B->Left,x+1,ans);
			Path(B->Right,x+1,ans);
		}
	}
}

void Swap(BinTree &B)
{
	if(!B) return; 
	BinTree temp=B->Left;
	B->Left=B->Right;
	B->Right=temp;
	Swap(B->Left);
	Swap(B->Right);
}



