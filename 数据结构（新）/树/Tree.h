#include<stdio.h>
#include<stdlib.h>
#define maxsize 100
typedef struct TreeNode
{
	char ch;
	struct TreeNode* Left;
	struct TreeNode* Right; 
}TreeNode,*BinTree;
typedef struct StackNode
{
	char *string;
	int top;
	int bottom;
}StackNode,*Stack;
void StackClear(Stack &S);
char Pop(Stack &S);
void Push(Stack &S);
void InitTree(BinTree &B);
void Mid(BinTree B);
void Front(BinTree B);
void Rear(BinTree B);
int Depth(BinTree B);
int Node(BinTree B);
int Leave(BinTree B);
int Degree1(BinTree B);
void Path(BinTree B,int x,char ans[maxsize]);
void Swap(BinTree &B);

