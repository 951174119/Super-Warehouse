//�������⣺��̬�����붯̬����
//��Զ�̬���ң����������֯��
//����������Ҳ�ƶ�������������������
//������������һ�ö�����������Ϊ�գ������Ϊ�գ������������ʣ�
//1.�ǿ������������м�ֵС��������ļ�ֵ
//2.�ǿ������������м�ֵ����������ļ�ֵ
//3.�����������Ƕ���������
//Position Find(ElementType X,BinTree BST):�Ӷ���������BST�в���Ԫ��X�����������ڽ��ĵ�ַ
//Position FindMin(BinTree BST):�Ӷ���������BST�в��Ҳ�������СԪ�����ڽ��ĵ�ַ
//Position FinMax(BinTree BST):�Ӷ���������BST�в��Ҳ��������Ԫ�����ڽ��ĵ�ַ
//BinTree Insert(ElementType X,BinTree BST)����һ���µĽ�㣬ֵΪX
//BinTree Delete(ElementType X,BinTree BST)ɾ��ֵΪX�Ľ��
Position Find(ElementType X,BinTree BST)//β�ݹ�ʵ�� 
{
	if(!BST)
	return NULL;//����ʧ��
	if(X>BST->Data)
	return Find(X,BST->Right);//���������м������� 
	else if(X<BST->Data) 
	return Find(X,BST->Left);//���������м������� 
	else//X==BST->Data 
	return BST;//���ҳɹ��������ҵ�����λ�� 
 } 
 //���ڷǵݹ麯����ִ��Ч�ʸߣ��ɽ���β�ݹ顱������Ϊ��������
Position Find(ElementType X,BinTree BST) 
{
	while(BST)
	{
	if(X>BST->Data)
	BST=BST->Right;//�����������ƶ����������� 
	else if(X<BST->Data) 
	BST=BST->Left;//�����������ƶ����������� 
	else//X==BST->Data 
	return BST;//���ҳɹ��������ҵ�����λ�� 
	}
	return NULL//����ʧ�� 
 } 
//���Ԫ��һ�������������ҷ�֦�Ķ˽����
//��СԪ��һ���������������֦�Ķ˽����
Position FindMax(BinTree BST)//�õݹ鷽��ʵ�� 
{
	if(!BST)
	return NULL;//�յĶ���������������NULL 
	else if(!BST->Left)
	return BST;//�ҵ�����Ҷ��㲢���� 
	else
	return FindMin(BST->Left);//�����֧�������� 
 } 
 Position FindMax(BinTree BST)//��ѭ��ʵ�� 
 {
 	if(BST)
 	while(BST->Right)
 	BST=BST->Right;//���ҷ�֧�������ң�ֱ������Ҷ��� 
 	return BST;
 }
