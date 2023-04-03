//遍历二叉树的应用：输出二叉树中的叶子结点
//在二叉树的遍历算法中
void PreOrderPrintLeaves(BinTree BT)
{
	if(BT)
	{
		if(!BT->Left&&!BT->Right)
		printf("%d",BT->Data);
		PreOrderPrintLeaves(BT->Left);
		PreOrderPrintLeaves(BT->Right);
	}
 } 
