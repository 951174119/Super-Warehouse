#include"Graph.h"
int main()
{
	MGraph G1;		//无向图（邻接矩阵） 
	MGraph G2;		//有向图（邻接矩阵） 
	ALGraph G3;		//无向图（邻接表） 
	ALGraph G4;		//有向图（邻接表）
	Stack S;
	Stack T;
	printf("建立邻接矩阵无向图\n");
	CreateUDN(G1);
	printf("建立邻接表无向图\n");
	LCreateUDN(G3); 
	printf("建立邻接矩阵有向图\n");
	CreateDG(G2);
	printf("建立邻接表有向图\n");
	LCreateDG(G4);
	printf("邻接矩阵存储的无向图的深度优先遍历\n");
	int *a,i;
	a=(int*)malloc(N*sizeof(int));
	for(i=0;i<G1.vexnum;i++)
		a[i]=0;
	DFS(G1,1,a);
	printf("\n");
	printf("邻接矩阵存储的无向图的广度优先遍历\n");
	for(i=0;i<G1.vexnum;i++)
		a[i]=0;
	BFS(G1,1,a);
	printf("\n邻接表存储的有向图的深度优先遍历\n");
	for(i=0;i<G4.vexnum;i++)
		a[i]=0;
	LDFS(G4,1,a);
	printf("\n邻接表存储的有向图的广度优先遍历\n");
	for(i=0;i<G4.vexnum;i++)
		a[i]=0;
	LBFS(G4,1,a);
	printf("\n最小生成树\n");
	Prim(G1,1);
	printf("\n拓扑排序\n");
	ToplogicalSort(G4);
	printf("\n关键路径\n");
	Criticalpath(G4);
}
 
