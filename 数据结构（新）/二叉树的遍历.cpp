//�ݹ������ʵ�ַ����Ƕ�ջ 
void PreOrderTraversal(BinTree BT)//������� �� �� �� 
{
	if(BT)
	{
		printf("%d",BT->Data);
		PreOrderTraversal(BT->Left);//�ݹ� 
		PreOrderTraversal(BT->Right);
	}
}
void InOrderTraversal(BinTree BT)//������� �� �� �� 
{
	if(BT)
	{
		InOrderTraversal(BT->Left);//�ݹ� 
		printf("%d",BT->Data);
		InOrderTraversal(BT->Right);
	}
}
void PostOrderTraversal(BinTree BT)//������� �� �� �� 
{
	if(BT)
	{
		PostOrderTraversal(BT->Left);//�ݹ� 
		PostOrderTraversal(BT->Right);
		printf("%d",BT->Data);
	}
}

