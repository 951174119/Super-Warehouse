//�б��Ƿ���ͬһ�ö���������
//��������ʾ
typedef struct TreeNode*Tree;
struct TreeNode{
	int v;
	Tree Left, Right;
	int flag;//��������ʹ���Ϊ1��û��Ϊ0 
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
			ResetT(T);//���T�еı��flag 
		}
		FreeTree(T);
		scanf("%d",&N);
	}
	return 0;
 } 
 //��������
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
  //����һ�����Ľ��Ŀռ�
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
	int i,V,flag;//flag:0����Ŀǰ��һ�£�1�����Ѿ���һ����
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
void ResetT(Tree T)//���T�и�����flag���
{
	if(T->Left)
		ResetT(T->Left);
	if(T->Right)
		ResetT(T->Right)
	T->flag=0;
 } 
 void FreeTree(Tree T)//�ͷ�T�Ŀռ�
 {
 	if(T->Left)
 		FreeTree(T->Left);
 	if(T->Right)
 		FreeTree(T->Right);
 	free(T);
  } 
