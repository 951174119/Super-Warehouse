//递归根本的实现方法是堆栈 
void PreOrderTraversal(BinTree BT)//先序遍历 根 左 右 
{
	if(BT)
	{
		printf("%d",BT->Data);
		PreOrderTraversal(BT->Left);//递归 
		PreOrderTraversal(BT->Right);
	}
}
void InOrderTraversal(BinTree BT)//中序遍历 左 根 右 
{
	if(BT)
	{
		InOrderTraversal(BT->Left);//递归 
		printf("%d",BT->Data);
		InOrderTraversal(BT->Right);
	}
}
void PostOrderTraversal(BinTree BT)//后序遍历 左 右 根 
{
	if(BT)
	{
		PostOrderTraversal(BT->Left);//递归 
		PostOrderTraversal(BT->Right);
		printf("%d",BT->Data);
	}
}

