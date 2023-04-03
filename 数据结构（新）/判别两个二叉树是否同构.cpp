//给定两棵树，判断它们是否同构
//求解思路：1.二叉树表示 2.建二叉树 3.同构判别
//结构数组表示二叉树：静态链表
#define MaxTree 10
#define ElementType char
#define Tree int
#define Null -1
struct TreeNode//二叉树表示 
{
	ElementType Element;
	Tree Left;
	Tree Right;
 } T1[MaxTree],T2[MaxTree];
Tree BuildTree(struct TreeNode T[])
int Isomorphic(Tree R1,Tree R2)
int main()//程序框架搭建 
{
	Tree R1,R2;
	R1=BuildTree(T1);
	R2=BuildTree(T2);
	if(Isomorphic(R1,R2))
	printf("Yes\n");
	else
	printf("No\n");
	return 0;
}
Tree BuildTree(struct TreeNode T[])//如何建二叉树 
{
	int N,i;
	char cl,cr;
	scanf("%d",&N);//输入总结点数
	int check[N];
	if(N)
	{
		for(i=0;i<N;i++)
		check[i]=0;
		for(i=0;i<N;i++)
		{
			scanf("%c,%c,%c\n",&T[i].Element,&cl,&cr);
			if(cl!='-')//无指向设值为- 
			{
				T[i].Left=cl-'0';//把字符变量化为整型 
				check[T[i].Left]=1;//被指向说明不是根结点设值为1 
			}
			else
			T[i].Left=Null; 
			if(cr!='-')//无指向设值为- 
			{
				T[i].Right=cr-'0';//把字符变量化为数字 
				check[T[i].Right]=1;//被指向说明不是根结点设值为1 
			}
			else
			T[i].Right=Null; 
		}
		for(i=1;i<N;i++)
		if(!check[i]) break;
		Root=i;
		}
		return Root;	
}
int Isomorphic(Tree R1,Tree R2) //判别二叉树是否同构 
{
	if((R1==Null)&&(R2==Null))
	return 1;
	if(((R1==Null)&&(R2!=Null))||((R1!=Null)&&(R2==Null)))
	return 0;
	if(T1[R1].Element!=T2[R2].Element)
	return 0;
	if((T1[R1].Left==Null)&&(T2[R2].Left==Null))
	return Isomorphic(T1[R1].Right,T2[R2].Right);
	if(((T1[R1].Left!=Null)&&(T2[R2].Left!=Null))&&((T1[T1[R1].Left].Element)==(T2[T2[R2].Left].Element)))
	return(Isomorphic(T1[R1].Left,T2[R2].Left)&&Isomorphic(T1[R1].Right,T2[R2].Right));
	else
	return(Isomorphic(T1[R1].Left,T2[R2].Right)&&Isomorphic(T1[R1].Right,T2[R2].Left));
}
