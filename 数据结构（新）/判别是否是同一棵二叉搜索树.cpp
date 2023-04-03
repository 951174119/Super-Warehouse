//判别是否是同一棵二叉搜索树
//搜索树表示
typedef struct TreeNode*Tree;
struct TreeNode{
	int v;
	Tree Left, Right;
	int flag;//如果被访问过设为1，没有为0 
}; 
int main()
{
	int N,L,i;
	Tree T;
	scanf("%d",&L);
	while(N){
		scanf("%d",&L);
		T=MakeTree(N);
		for(i=0;i<L;i++){
			if(Judge(T,N))
				printf("Yes\n");
			else
				printf("No\n");
			ResetT(T);//清除T中的标记flag 
		}
		FreeTree(T);
		scanf("%d",&N);
	}
	return 0;
 } 
 //建搜索树
 Tree MakeTree(int N)
 {
 	Tree T;
 	int i,V;
 	scanf("%d",&V);
 	T=NewNode(V);
 	for(i=1;i<N;i++)
 	{
 		scanf("%d",&V);
 		T=insert(T,V);
	 }
	 return T;
  } 
  //申请一个树的结点的空间
  Tree NewNode(int V)
  {
  	Tree T=(Tree)malloc(sizeof(struct TreeNode));
  	T->v=V;
  	T->Left=T->Right=NULL;
  	T->flag=0;
  	return T;
   } 
   Tree Insert(Tree T,int V)
   {
   	if(!T)
   		T=NewNode(V);
   	else{
   		if(V>T->v)
   			T->Right=Insert(T->Right,V);
   		else
   			T->Left=Insert(T->Left,V);
   		}
   
   return T;
}
int check(Tree T,int V)
{
	if(T->flag){
		if(V<T->v)
			return check(T->Left,V);
		else if(V>T->v)
			return check(T->Right,V);
		else 
			return 0;
	}
	else{
		if(V==T->v){
			T->flag=1;
			return 1;
		}
		else return 0;
	}
}
int Judge(Tree T,int N)
{
	int i,V,flag;//flag:0代表目前还一致，1代表已经不一致了
	scanf("%d",&V);
	if(V!=T->v)
		flag=1;
	else 
		T->flag=1;
	for(i=1;i<N;i++)
	{
		scanf("%d",&V);
		if((!flag)&&(!check(T,V)))
			flag=1;
	 } 
	 if(!flag)
	 	return 0;
	else
		return 1;
}
void ResetT(Tree T)//清除T中各结点的flag标记
{
	if(T->Left)
		ResetT(T->Left);
	if(T->Right)
		ResetT(T->Right)
	T->flag=0;
 } 
 void FreeTree(Tree T)//释放T的空间
 {
 	if(T->Left)
 		FreeTree(T->Left);
 	if(T->Right)
 		FreeTree(T->Right);
 	free(T);
  } 
