//�����������ĺ������⣺��ά�ṹ�����Ի�
//�ӽ����������Ҷ��ӽ��
//��Ҫһ���洢�ṹ������ʱ�����ʵĽ��
//�洢�ṹ�����С���ջ
//����ʵ�֣������Ӹ���㿪ʼ�����Ƚ��������ӣ�Ȼ��ʼִ��ѭ���������ӡ����ʸý�㡢�����Ҷ������
//���������һ��һ�������ABCDEF...
void LevelOrderTraversal(BinTree BT)
{
	Queue Q;BinTree T;
	if(!BT)
	return;//���ǿ���ֱ�ӷ��� 
	Q=CreatQueue(MaxSize);//��������ʼ������Q 
	AddQ(Q,BT);
	while(!IsEmptyQ(Q))
	{
		T=DeleteQ(Q);
		printf("%d\n",T->Data);//����ȡ�����еĽ�� 
		if(T->Left)
		AddQ(Q,T->Left);
		if(T->Right)
		AddQ(Q,T->Right);
	}
 } 
