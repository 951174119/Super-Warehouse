//二叉树遍历的核心问题：二维结构的线性化
//从结点访问其左、右儿子结点
//需要一个存储结构保存暂时不访问的结点
//存储结构：队列、堆栈
//队列实现：遍历从根结点开始，首先将根结点入队，然后开始执行循环：结点出队、访问该结点、其左右儿子入队
//层序遍历：一层一层遍历：ABCDEF...
void LevelOrderTraversal(BinTree BT)
{
	Queue Q;BinTree T;
	if(!BT)
	return;//若是空树直接返回 
	Q=CreatQueue(MaxSize);//创建并初始化队列Q 
	AddQ(Q,BT);
	while(!IsEmptyQ(Q))
	{
		T=DeleteQ(Q);
		printf("%d\n",T->Data);//访问取出队列的结点 
		if(T->Left)
		AddQ(Q,T->Left);
		if(T->Right)
		AddQ(Q,T->Right);
	}
 } 
