#include<stdio.h>
#include<stdlib.h>
#define INFINITY 1e7
#define N 20
//�ڽӾ��� 
typedef struct{
	char  vex[N];
	int arcs[N][N];
	int vexnum,arcnum;//����ͱ� 
}MGraph;
//�ڽӱ� 
typedef  struct  ArcNode { 
    int   adjvex; 		// �û���ָ��Ķ����λ�� 
    int  lenth;//Ȩֵ 
    struct ArcNode  *nextarc; 	// ָ����һ������ָ�� 
} ArcNode; 

typedef  struct  VNode { 
    char   data; // ������Ϣ 
    ArcNode     *firstarc; // ָ���һ�������ö���Ļ�   
} VNode, AdjList[N]; 

typedef struct { 
    AdjList   vertices; 
    int   vexnum, arcnum; // ͼ�ĵ�ǰ�������ͻ��� 
} ALGraph; 

typedef struct Queue
{
	int *data;
	int rear;
	int front;
	int size;
}Queue,*QNode;                                                                    

typedef struct {
 int adjvex; 
 int lowcost;
}ccc,closedge[N];

typedef struct 
{
	int top;
	int data[N];
}Stack; 
void CreateUDN(MGraph &G);
void LCreateUDN(ALGraph &G);
void CreateDG(MGraph &G);
void LCreateDG(ALGraph &G);
void DFS(MGraph &G,int v,int *a);
void InitQueue(QNode &Q,MGraph G);
void EnQueue(QNode &Q,int v);
void DeQueue(QNode &Q,int &u);
void BFS(MGraph &G,int v,int *a);
void LDFS(ALGraph &G,int v,int *a);
void LInitQueue(QNode &Q,ALGraph G);
void LBFS(ALGraph &G,int v,int *a);
void Prim(MGraph G, int u);
void InitStack(Stack &S);
void Push(Stack &S,int n);
void Pop(Stack &S,int &n);
void ToplogicalSort(ALGraph G);
bool ToplogicalOrder(ALGraph G,Stack &T,int *a,int *Ve);
int Criticalpath(ALGraph G);
