#include<stdio.h>
#include"Tree.h"
#define maxsize 100
int main()
{
	BinTree B;
	printf("�밴����������������Ľ��\n");//ABC00DE0G00F000
	InitTree(B);
	printf("�˶�������������������\n"); 
	Mid(B);
	printf("\n"); 
	printf("�˶�������ǰ����������\n");
	Front(B);
	printf("\n");
	printf("�˶������ĺ�����������\n");
	Rear(B); 
	printf("\n");
	printf("�������������%d\n",Depth(B));
	printf("�������Ľ�������%d\n",Node(B));
	printf("������Ҷ�ӽڵ������%d\n",Leave(B));
	printf("��Ϊһ�Ľ�������%d\n",Degree1(B));
	printf("����·����\n");
	char ans[maxsize];
	int x=1;
	Path(B,x,ans);
	Swap(B);
	printf("�������������������������\n");
	Mid(B);
	
} 
