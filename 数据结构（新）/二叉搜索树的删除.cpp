//二叉搜索树的删除
//考虑三种情况：
//要删除的是叶结点：直接删除，并再修改其父结点指针--置为NULL
//要删除的结点只有一个孩子结点：将其父结点的指针指向要删除结点的孩子结点
//要删除的结点有左、右两棵子树：用另一结点替代被删除结点：右子树的最小元素或者左子树的最大元素
BinTree Delete(ElementType X,BinTree BST)
{
	Position Tmp;
	if(!BST)//判断树是否是空的 
		print("要删除的元素未找到");
	else if(X<BST->Data)
		BST->Left=Delete(X,BST->Left);//左子树递归删除 
	else if(X>BST->Data)
		BST->Right=Delete(X,BST->Right);//右子树递归删除 
	else//找到要删除的点 
		if(BST->Left&&BST->Right)//被删除结点有左右两个子节点 
		{
			Tmp=FindMin(BST->Right);//在右子树中找最小的元素填充删除结点 
			BST->Data=Tmp->Data;
			BST->Right=Delete(BST->Data,BST->Right);//在删除结点的右子树中删除最小元素 
		}else//被删除结点有一个或无子结点 
		{
			Tmp=BST;
			if(!BST->Left)//有右孩子或无子结点 
				BST=BST->Right;
			else if(!BST->Right)//有左孩子或无子节点 
				BST->Left;
			free(Tmp);
		}
		return BST;
 } 
