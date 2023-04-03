#include"Graph.h"
void CreateUDN(MGraph &G)
{
	int i,j,V1,V2; 
	printf("请依次输入顶点数和边数\n");
	scanf("%d",&G.vexnum);
	scanf("%d",&G.arcnum);
	printf("请依次输入顶点信息\n");
	scanf("%s",&G.vex[i]);
	for(i=0;i<G.vexnum;i++)
	{
		for(j=0;j<G.vexnum;j++)
		{
			G.arcs[i][j]=0;
		}

	}
	int n;
	for(i=0;i<G.arcnum;i++)
	{
		printf("请输入存在边的两个顶点序号(用逗号隔开):\n");
		scanf("%d,%d",&V1,&V2);
		printf("请输入这条边的权值\n");
		scanf("%d",&n);
		G.arcs[V1][V2]=n;
		G.arcs[V2][V1]=n;
	}
}
void LCreateUDN(ALGraph &G)
{
	int i,j;
	printf("请依次输入顶点和边的个数\n");
	scanf("%d",&G.vexnum);
	scanf("%d",&G.arcnum);
	printf("请依次数入各顶点信息\n"); 
	for(i=0;i<G.vexnum;i++)
	{
		scanf("%s",&G.vertices[i].data);
		G.vertices[i].firstarc=NULL;
	}
	for(i=0;i<G.arcnum;i++)
	{
		ArcNode *p1;
		p1=(ArcNode*)malloc(sizeof(ArcNode));
		printf("请输入边的两个顶点的序号(用逗号隔开)\n");
		int v1,v2;
		scanf("%d,%d",&v1,&v2);
		p1->nextarc=G.vertices[v1].firstarc;
		p1->adjvex=v2;
		G.vertices[v1].firstarc=p1;
		ArcNode *p2;
		p2->adjvex=v1;
		p2->nextarc=G.vertices[v2].firstarc;
		G.vertices[v2].firstarc=p2;
	}
}
void CreateDG(MGraph &G)
{
	int i,j,V1,V2,d; 
	printf("请依次输入顶点数和边数\n");
	scanf("%d",&G.vexnum);
	scanf("%d",&G.arcnum);
	printf("请依次输入顶点信息\n");
	scanf("%s",&G.vex[i]);
	for(i=0;i<G.vexnum;i++)
	{
		for(j=0;j<G.vexnum;j++)
		{
			G.arcs[i][j]=0;
		}
	}
	for(i=0;i<G.arcnum;i++)
	{
		printf("请依照方向输入存在边的两个顶点序号以及权值(用逗号隔开):\n");
		scanf("%d,%d,%d",&V1,&V2,&d);
		G.arcs[V1][V2]=d;
	}
}

void LCreateDG(ALGraph &G)
{
	int i,j;
	printf("请依次输入顶点和边的个数\n");
	scanf("%d",&G.vexnum);
	scanf("%d",&G.arcnum);
	printf("请依次数入各顶点信息\n"); 
	for(i=0;i<G.vexnum;i++)
	{
		scanf("%s",&G.vertices[i].data);
		G.vertices[i].firstarc=NULL;
	}

	for(i=0;i<G.arcnum;i++)
	{
		ArcNode *p1;
		p1=(ArcNode*)malloc(sizeof(ArcNode));
		printf("请输入边的两个顶点的序号(用逗号隔开)\n");
		int v1,v2;
		scanf("%d,%d",&v1,&v2);
		p1->adjvex=v2;
		printf("请输入这条边的权值\n");
		scanf("%d",&j);
		p1->lenth=j;
		p1->nextarc=G.vertices[v1].firstarc;
		G.vertices[v1].firstarc=p1;
	}
}
void DFS(MGraph &G,int v,int *a)
{
	printf("%c ",G.vex[v]);
	a[v]=1;
	for(int i=0;i<=G.vexnum;i++)
	{
		if((G.arcs[v][i]!=0)&&(a[i]!=1))
		DFS(G,i,a);
	}
}
void InitQueue(QNode &Q,MGraph G)
{
	Q=(QNode)malloc(sizeof(Queue));
	Q->front=0;
	Q->rear=0;
	Q->size=G.vexnum+1;
	Q->data=(int*)malloc((G.vexnum+1)*sizeof(int));
	if(!Q->data)
	{
		printf("分配空间错误\n");
		return;
	}
}

void EnQueue(QNode &Q,int v)
{
	if((Q->rear+1)%Q->size==Q->front)
	{
		printf("队列满\n");
		return;
	}
	Q->data[Q->rear]=v;
	Q->rear=(Q->rear+1)%Q->size;
}
void DeQueue(QNode &Q,int &u)
{
	if(Q->front==Q->rear)
	{
		printf("队列空\n");
		return;
	}
	u=Q->data[Q->front];
	Q->front=(Q->front+1)%Q->size;
}
void BFS(MGraph &G,int v,int *a)
{
	printf("%c ",G.vex[v]);
	a[v]=1;
	QNode Q;
	InitQueue(Q,G);
	EnQueue(Q,v);
	int u,w;
	while(Q->front!=Q->rear)
	{
		DeQueue(Q,u);
		for(int i=0;i<G.vexnum;i++)
		{
			if((G.arcs[u][i]!=0)&&(a[i]!=1))
			{
				printf("%c ",G.vex[i]);
				a[i]=1;
				EnQueue(Q,i);
			}
		}
	}
	printf("\n");
}
void LDFS(ALGraph &G,int v,int *a)
{
	printf("%c ",G.vertices[v].data);
	a[v]=1;
	ArcNode *p=G.vertices[v].firstarc;
	while(p!=NULL)
	{
		int w=p->adjvex;
		LDFS(G,w,a);
		p=p->nextarc;
	}
}
void LInitQueue(QNode &Q,ALGraph G)
{
	Q->front=0;
	Q->rear=0;
	Q->size=G.vexnum;
	Q->data=(int*)malloc(G.vexnum*sizeof(int));
	if(!Q->data)
	{
		printf("分配空间错误\n");
		return;
	}
}
void LBFS(ALGraph &G,int v,int *a)
{
	printf("%c ",G.vertices[v].data);
	a[v]=1;
	QNode Q;
	LInitQueue(Q,G);
	EnQueue(Q,v);
	int u,w;
	for(int i=0;i<G.vexnum;i++);
	while(Q->front!=Q->rear)
	{
		DeQueue(Q, u);
		ArcNode *p;
		for(p=G.vertices[u].firstarc;p;p=p->nextarc)
		{
			int k=p->adjvex;
			if(a[k]!=1)
			{
				printf("%c ",G.vertices[k].data);
				EnQueue(Q,k);

				a[k]=1;

			}
		}
	}
	printf("\n");
}
void Prim(MGraph G, int u)
{
	closedge C;
	for(int i=0;i<G.vexnum;i++)
	{
		if(i!=u)	
		{
			C[i].adjvex=u;
			C[i].lowcost=G.arcs[u][i];
			if(C[i].lowcost==0)
				C[i].lowcost=INFINITY;
		}
	}
	C[u].lowcost=0;
	int k,l;
	for(int j=1;j<G.vexnum;j++)
	{
		k=INFINITY,l=-1;
		for(int q=0;q<G.vexnum;q++)
		{
			if((C[q].lowcost!=0)&&(C[q].lowcost<k))
			{
				k=C[q].lowcost;
				l=q;
			}
		}
		printf("第%d条边为%c到%c,长度为%d\n",j,G.vex[C[l].adjvex],G.vex[l],C[l].lowcost);
		C[l].lowcost=0;
		for(int o=0;o<G.vexnum;o++)
		{
			if(G.arcs[l][o]!=0&&G.arcs[l][o]<C[o].lowcost)
			{
				C[o].adjvex=l;
				C[o].lowcost=G.arcs[l][o];
			}
		}
	}
}
void InitStack(Stack &S)
{
	S.top=0;
	for(int i=0;i<N;i++)
	{
		S.data[i]=-1;
	}
}
void Push(Stack &S,int n)
{
	if(S.top>=N) 
	{
		printf("栈满\n");
		return;
	}
	S.data[S.top++]=n;
	 
}
void Pop(Stack &S,int &n)
{
	if(S.top==0) 
	{
		printf("栈空\n");
		return;
	}
	n=S.data[--S.top];
}
void ToplogicalSort(ALGraph G)
{
	int a[G.vexnum];
	for(int i=0;i<G.vexnum;i++)
	{
		a[i]=0;
	}
	ArcNode *p;
	for(int j=0;j<G.vexnum;j++)
	{
		for(p=G.vertices[j].firstarc;p;p=p->nextarc)
			a[p->adjvex]++;
	}
	Stack S;
	InitStack(S);
	int count=0;
	for(int u=0;u<G.vexnum;u++)
	{
		if(a[u]==0)
			Push(S,u);
	}
	int n,k;
	while(S.top!=0)
	{
		Pop(S,n);
		printf("%c ",G.vertices[n].data);
		count++;
		ArcNode *p;
		for(p=G.vertices[n].firstarc;p;p=p->nextarc)
		{
			k=p->adjvex;
			a[k]--;
			if(a[k]==0)
				Push(S,k);
		}
	}
	printf("\n");
	if(count<G.vexnum)
		printf("排序出错\n");
}
bool ToplogicalOrder(ALGraph G,Stack &T,int *a,int *Ve)
{

	for(int i=0;i<G.vexnum;i++)
	{
		a[i]=0;
		Ve[i]=0;
	}
	ArcNode *p;
	for(int j=0;j<G.vexnum;j++)
	{
		for(p=G.vertices[j].firstarc;p;p=p->nextarc)
			a[p->adjvex]++;
	}
	Stack S;
	InitStack(S);
	InitStack(T);
	int count=0;
	for(int u=0;u<G.vexnum;u++)
	{
		if(a[u]==0)
			Push(S,u);
	}
	int n,k;
	while(S.top!=0)
	{
		Pop(S,n);
		Push(T,n);
		count++;
		ArcNode *p;
		for(p=G.vertices[n].firstarc;p;p=p->nextarc)
		{
			k=p->adjvex;
			a[k]--;
			if(Ve[k]<Ve[n]+p->lenth)
				Ve[k]=Ve[n]+p->lenth;
			if(a[k]==0)
				Push(S,k);
		}
	}
	printf("\n");
	if(count<G.vexnum)
	{
		printf("排序出错\n");
		return false;
	}
	return true;
}
int Criticalpath(ALGraph G)
{
	int a[G.vexnum],Ve[G.vexnum];
	Stack S;
	if(!ToplogicalOrder(G,S,a,Ve)) return 0;
	int Vl[G.vexnum];
	for(int i=0;i<G.vexnum;i++)
	{
		Vl[i]=Ve[i];
	}
	int j,k,l;
	char tag;
	ArcNode *p;
	while(S.top!=0)
	{
		Pop(S,j);
		for(p=G.vertices[j].firstarc;p;p=p->nextarc)
		{
			if(Vl[p->adjvex]-p->lenth<Vl[j])
				Vl[j]=Vl[p->adjvex]-p->lenth;
		}
	}
	for(j=0;j<G.vexnum;j++)
	{
		for(p=G.vertices[j].firstarc;p;p=p->nextarc)
		{
			int e=Ve[j];
			l=Vl[p->adjvex]-p->lenth;
			tag=(e==l)?'*':' ';
			printf("%c%c%c ",G.vertices[j].data,tag,G.vertices[p->adjvex].data);
		}
	}
	printf("\n");
	return 1;
}









