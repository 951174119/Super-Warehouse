//查找问题：静态查找与动态查找
//针对动态查找，数据如何组织？
//二叉搜索树也称二叉排序树或二叉查找树
//二叉搜索树：一棵二叉树，可以为空：如果不为空，满足以下性质：
//1.非空左子树的所有键值小于其根结点的键值
//2.非空右子树的所有键值大于其根结点的键值
//3.左、右子树都是二叉搜索树
//Position Find(ElementType X,BinTree BST):从二叉搜索树BST中查找元素X，返回其所在结点的地址
//Position FindMin(BinTree BST):从二叉搜索树BST中查找并返回最小元素所在结点的地址
//Position FinMax(BinTree BST):从二叉搜索树BST中查找并返回最大元素所在结点的地址
//BinTree Insert(ElementType X,BinTree BST)插入一个新的结点，值为X
//BinTree Delete(ElementType X,BinTree BST)删除值为X的结点
Position Find(ElementType X,BinTree BST)//尾递归实现 
{
	if(!BST)
	return NULL;//查找失败
	if(X>BST->Data)
	return Find(X,BST->Right);//在右子树中继续查找 
	else if(X<BST->Data) 
	return Find(X,BST->Left);//在左子树中继续查找 
	else//X==BST->Data 
	return BST;//查找成功，返回找到结点的位置 
 } 
 //由于非递归函数的执行效率高，可将“尾递归”函数改为迭代函数
Position Find(ElementType X,BinTree BST) 
{
	while(BST)
	{
	if(X>BST->Data)
	BST=BST->Right;//向右子树中移动，继续查找 
	else if(X<BST->Data) 
	BST=BST->Left;//向左子树中移动，继续查找 
	else//X==BST->Data 
	return BST;//查找成功，返回找到结点的位置 
	}
	return NULL//查找失败 
 } 
//最大元素一定是在树的最右分枝的端结点上
//最小元素一定是在树的最左分枝的端结点上
Position FindMax(BinTree BST)//用递归方法实现 
{
	if(!BST)
	return NULL;//空的二叉搜索树，返回NULL 
	else if(!BST->Left)
	return BST;//找到最左叶结点并返回 
	else
	return FindMin(BST->Left);//沿左分支继续查找 
 } 
 Position FindMax(BinTree BST)//用循环实现 
 {
 	if(BST)
 	while(BST->Right)
 	BST=BST->Right;//沿右分支继续查找，直到最右叶结点 
 	return BST;
 }
