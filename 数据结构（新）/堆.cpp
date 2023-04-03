//ʲô�Ƕ�
//���ȶ��У�����ġ����С���ȡ��Ԫ�ص�˳��������Ԫ�ص�����Ȩ���ؼ��֣���С��������Ԫ�ؽ�����е��Ⱥ�˳�� 
//�ѵ��������ԣ�1.�ṹ�ԣ��������ʾ����ȫ������ 
//2.�����ԣ���һ���Ĺؼ��������������н������ֵ������Сֵ��
//�����ѡ���Ҳ�ơ��󶥶ѡ������ֵ
//����С�ѡ���Ҳ�ơ�С���ѡ�����Сֵ
//�������ƣ����ѣ�MaxHeap��
//���ݶ��󼯣���ȫ��������ÿ������Ԫ��ֵ��С�����ӽ���Ԫ��ֵ
//������������H �� MaxHeap��Ԫ��item �� ElementType����Ҫ�����У�
//MaxHeap Create( int MaxSize )������һ���յ����ѡ�
//Boolean IsFull( MaxHeap H )���ж�����H�Ƿ�������
//Insert( MaxHeap H, ElementType item )����Ԫ��item��������H�� 
//Boolean IsEmpty( MaxHeap H )���ж�����H�Ƿ�Ϊ�ա�
//ElementType DeleteMax( MaxHeap H )������H�����Ԫ��(�����ȼ�)�� 


//���ѵĴ���
typedef struct HeapStruct *MaxHeap
struct HeapStruct{
	ElementType *Elements;//�洢��Ԫ�ص�����
	int Size;//�ѵĵ�ǰԪ�ظ��� 
	int Capacity; //�ѵ�������� 
}; 
MaxHeap Create(int MaxSize)//��������ΪMaxSize�Ŀյ����� 
{
	MaxHeap H=malloc(sizeof(struct HeapStruct));
	H->Elements=malloc((MaxSize+1)*sizeof(ElementType));
	H->Size=0;
	H->Capacity=MaxSize;
	H->Elements[0]=MaxData;//���塰�ڱ�"Ϊ���ڶ������п��ܵ�Ԫ��ֵ�������Ժ������� 
	return H;
}
//�㷨�������������뵽���丸��㵽����������������
void Insert( MaxHeap H, ElementType item ) { /* ��Ԫ��item ��������H������H->Elements[0]�Ѿ�����Ϊ�ڱ� */
 int i;
 if ( IsFull(H) ) {
 printf("��������");
 return;
 }
 i = ++H->Size; /* iָ��������е����һ��Ԫ�ص�λ�� */
 for ( ; H->Elements[i/2] < item; i/=2 )
 H->Elements[i] = H->Elements[i/2]; /* ���¹��˽�� */
 H->Elements[i] = item; /* ��item ���� */
}

//���ѵ�ɾ��
ElementType DeleteMax( MaxHeap H )
{ /* ������H��ȡ����ֵΪ����Ԫ�أ���ɾ��һ����� */
 int Parent, Child;
 ElementType MaxItem, temp;
 if ( IsEmpty(H) ) {
 printf("������Ϊ��");
 return;
 }
 MaxItem = H->Elements[1]; /* ȡ����������ֵ */
 /* �����������һ��Ԫ�شӸ���㿪ʼ���Ϲ����²��� */
 temp = H->Elements[H->Size--];
 for( Parent=1; Parent*2<=H->Size; Parent=Child ) {
 Child = Parent * 2;
 if( (Child!= H->Size) &&
 (H->Elements[Child] < H->Elements[Child+1]) )
 Child++; /* Childָ�������ӽ��Ľϴ��� */
 if( temp >= H->Elements[Child] ) break;
 else /* �ƶ�tempԪ�ص���һ�� */
 H->Elements[Parent] = H->Elements[Child];
 }
 H->Elements[Parent] = temp;
 return MaxItem; } 
 
 //���ѵĽ���
  
