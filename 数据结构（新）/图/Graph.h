#include<stdio.h>
#include<stdlib.h>
#define INFINITY 1e7
#define N 20
//邻接矩阵 
typedef struct{
	char  vex[N];
	int arcs[N][N];
	int vexnum,arcnum;//顶点和边 
}MGraph;
//邻接表 
typedef  struct  ArcNode { 
    int   adjvex; 		// 该弧所指向的顶点的位置 
    int  lenth;//权值 
    struct ArcNode  *nextarc; 	// 指向下一条弧的指针 
} ArcNode; 

typedef  struct  VNode { 
    char   data; // 顶点信息 
    ArcNode     *firstarc; // 指向第一条依附该顶点的弧   
} VNode, AdjList[N]; 

typedef struct { 
    AdjList   vertices; 
    int   vexnum, arcnum; // 图的当前顶点数和弧数 
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
