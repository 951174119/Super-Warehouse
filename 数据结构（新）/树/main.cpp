#include<stdio.h>
#include"Tree.h"
#define maxsize 100
int main()
{
	BinTree B;
	printf("请按照先序遍历输入树的结点\n");//ABC00DE0G00F000
	InitTree(B);
	printf("此二叉树的中序遍历结果是\n"); 
	Mid(B);
	printf("\n"); 
	printf("此二叉树的前序遍历结果是\n");
	Front(B);
	printf("\n");
	printf("此二叉树的后序遍历结果是\n");
	Rear(B); 
	printf("\n");
	printf("二叉树的深度是%d\n",Depth(B));
	printf("二叉树的结点个数是%d\n",Node(B));
	printf("二叉树叶子节点个数是%d\n",Leave(B));
	printf("度为一的结点个数是%d\n",Degree1(B));
	printf("所有路径有\n");
	char ans[maxsize];
	int x=1;
	Path(B,x,ans);
	Swap(B);
	printf("交换左右子树后的中序遍历结果\n");
	Mid(B);
	
} 
