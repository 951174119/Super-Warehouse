//�����������Ĳ���
//��������ֵҪ������ڵ��С��������Ҫ�� 
#include<stdio.h>
#include<stdlib.h>
BinTree Insert(ElementType X,BinTree BST)
{
	if(!BST)
	{//��ԭ��Ϊ�գ����ɲ�����һ�����Ķ��������� 
		BST=malloc(sizeof(struct TreeNode));
		BST->Data=X;
		BST->Left=BST->Right=NULL;
	}else//��ʼ��Ҫ����Ԫ�ص�λ�� 
		if(X<BST->Data)
			BST->Left=Insert(X,BST->Left);//�ݹ���������� 
		else if(X>BST->Data)
			BST->Right=Insert(X,BST->Right);//�ݹ���������� 
		//else X�Ѿ����ڣ�ʲô������ 
	return BST;
}
