//������������Ӧ�ã�����������е�Ҷ�ӽ��
//�ڶ������ı����㷨��
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
