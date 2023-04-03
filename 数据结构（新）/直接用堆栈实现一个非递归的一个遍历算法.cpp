//直接用堆栈实现一个非递归的一个遍历算法 
void InOrderTraversal(BinTree BT)
{
	BinTree T=BT;
	Stack S=CreatStack(MaxSize);//创建并初始化堆栈S 
	while(T||!IsEmpty(S))
	{
		while(T)//一直向左并将沿途节点压入堆栈 
		{
			Push(S,T);
			T=T->Left;
		}
		if(!IsEmpty(S))
		{
			T=Pop(S);//结点弹出堆栈 
			print("%5d",T->Data);//（访问）打印节点 
			T=T->Right;//转向右子树 
		}
	}
}
