//ֱ���ö�ջʵ��һ���ǵݹ��һ�������㷨 
void InOrderTraversal(BinTree BT)
{
	BinTree T=BT;
	Stack S=CreatStack(MaxSize);//��������ʼ����ջS 
	while(T||!IsEmpty(S))
	{
		while(T)//һֱ���󲢽���;�ڵ�ѹ���ջ 
		{
			Push(S,T);
			T=T->Left;
		}
		if(!IsEmpty(S))
		{
			T=Pop(S);//��㵯����ջ 
			print("%5d",T->Data);//�����ʣ���ӡ�ڵ� 
			T=T->Right;//ת�������� 
		}
	}
}
