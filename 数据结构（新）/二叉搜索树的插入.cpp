//二叉搜索树的插入
//左子树的值要比其根节点的小，右子树要大 
#include<stdio.h>
#include<stdlib.h>
BinTree Insert(ElementType X,BinTree BST)
{
	if(!BST)
	{//若原树为空，生成并返回一个结点的二叉搜索树 
		BST=malloc(sizeof(struct TreeNode));
		BST->Data=X;
		BST->Left=BST->Right=NULL;
	}else//开始找要插入元素的位置 
		if(X<BST->Data)
			BST->Left=Insert(X,BST->Left);//递归插入左子树 
		else if(X>BST->Data)
			BST->Right=Insert(X,BST->Right);//递归插入右子树 
		//else X已经存在，什么都不做 
	return BST;
}
