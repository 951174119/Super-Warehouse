//������������ɾ��
//�������������
//Ҫɾ������Ҷ��㣺ֱ��ɾ���������޸��丸���ָ��--��ΪNULL
//Ҫɾ���Ľ��ֻ��һ�����ӽ�㣺���丸����ָ��ָ��Ҫɾ�����ĺ��ӽ��
//Ҫɾ���Ľ����������������������һ��������ɾ����㣺����������СԪ�ػ��������������Ԫ��
BinTree Delete(ElementType X,BinTree BST)
{
	Position Tmp;
	if(!BST)//�ж����Ƿ��ǿյ� 
		print("Ҫɾ����Ԫ��δ�ҵ�");
	else if(X<BST->Data)
		BST->Left=Delete(X,BST->Left);//�������ݹ�ɾ�� 
	else if(X>BST->Data)
		BST->Right=Delete(X,BST->Right);//�������ݹ�ɾ�� 
	else//�ҵ�Ҫɾ���ĵ� 
		if(BST->Left&&BST->Right)//��ɾ����������������ӽڵ� 
		{
			Tmp=FindMin(BST->Right);//��������������С��Ԫ�����ɾ����� 
			BST->Data=Tmp->Data;
			BST->Right=Delete(BST->Data,BST->Right);//��ɾ��������������ɾ����СԪ�� 
		}else//��ɾ�������һ�������ӽ�� 
		{
			Tmp=BST;
			if(!BST->Left)//���Һ��ӻ����ӽ�� 
				BST=BST->Right;
			else if(!BST->Right)//�����ӻ����ӽڵ� 
				BST->Left;
			free(Tmp);
		}
		return BST;
 } 
