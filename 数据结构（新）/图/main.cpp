#include"Graph.h"
int main()
{
	MGraph G1;		//����ͼ���ڽӾ��� 
	MGraph G2;		//����ͼ���ڽӾ��� 
	ALGraph G3;		//����ͼ���ڽӱ� 
	ALGraph G4;		//����ͼ���ڽӱ�
	Stack S;
	Stack T;
	printf("�����ڽӾ�������ͼ\n");
	CreateUDN(G1);
	printf("�����ڽӱ�����ͼ\n");
	LCreateUDN(G3); 
	printf("�����ڽӾ�������ͼ\n");
	CreateDG(G2);
	printf("�����ڽӱ�����ͼ\n");
	LCreateDG(G4);
	printf("�ڽӾ���洢������ͼ��������ȱ���\n");
	int *a,i;
	a=(int*)malloc(N*sizeof(int));
	for(i=0;i<G1.vexnum;i++)
		a[i]=0;
	DFS(G1,1,a);
	printf("\n");
	printf("�ڽӾ���洢������ͼ�Ĺ�����ȱ���\n");
	for(i=0;i<G1.vexnum;i++)
		a[i]=0;
	BFS(G1,1,a);
	printf("\n�ڽӱ�洢������ͼ��������ȱ���\n");
	for(i=0;i<G4.vexnum;i++)
		a[i]=0;
	LDFS(G4,1,a);
	printf("\n�ڽӱ�洢������ͼ�Ĺ�����ȱ���\n");
	for(i=0;i<G4.vexnum;i++)
		a[i]=0;
	LBFS(G4,1,a);
	printf("\n��С������\n");
	Prim(G1,1);
	printf("\n��������\n");
	ToplogicalSort(G4);
	printf("\n�ؼ�·��\n");
	Criticalpath(G4);
}
 
