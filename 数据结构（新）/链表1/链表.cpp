#include"student.h" 
#include<stdio.h>
int main() {
	LinkList l;
	if(Init(l))		
		printf("初始化成功！\n");
	if(Isempty(l))	
		printf("动态顺序表为空！\n");
	else 	
		printf("动态顺序表不为空！\n");	
	printf("请输入要填写的学生个数：\n");
	int n;
	scanf("%d",&n);
	printf("请依次输入学生的学号、姓名、成绩：\n");
	for(int g=0;g<n;g++)
	{
		Student B;
		scanf("%s %s %d",&B.no,&B.name,&B.score);
		if(Insert(l,g+1,B))
			printf("输入成功\n");
		else printf("输入失败\n");
	}

	if(!Traverse(l))
		printf("无学生信息\n");
	else printf("遍历成功！\n");
	char a[20];
	printf("请输入想要查找的学生姓名:\n");
	scanf("%s",&a);
	if(NameFind(l,a)!=NULL)
	{
		printf("查找成功！\n");
		printf("这名学生的学号是%s,成绩是%d\n",NameFind(l,a)->data.no,NameFind(l,a)->data.score);
	}
	else
		printf("查找失败！\n");
	int k;
	printf("您想查找第几位学生的信息：");
	scanf("%d",&k);
	while(!Find(l,k))
		scanf("%d",&k);
	if(Find(l,k)!=NULL)
	{
		printf("查找成功！\n");
		printf("这名学生的学号是%s,成绩是%d\n",Find(l,k)->data.no,Find(l,k)->data.score);
	}
	else
		printf("查找失败！\n");
	printf("请依次输入想要插入的学生的学号、姓名、成绩\n");
	Student q;
	scanf("%s %s %d",&q.no,&q.name,&q.score);
	printf("请输入插入位置：");
	int m;
	scanf("%d",&m);
	if(Insert(l,m,q))
		printf("插入成功！\n");
	else
		printf("插入失败！\n"); 
	int e;
	printf("请输入你想要删除学生的位置：");
	scanf("%d",&e);
	if(Del(l,e))
		printf("删除成功！\n");
	else
		printf("删除失败！\n");
	Traverse(l); 
	printf("请输入排序关键字(输入0按照学号排序,输入1按照分数排序)：\n");
	int o;
	scanf("%d",&o);
	printf("请选择排序方式(输入0递减,输入1递增)：\n") ;
	int t;
	scanf("%d",&t);
	if(o!=0&&o!=1) 
	{
		printf("排序失败！\n");
	}
	if(o==0)
	{
		if(noSort(l,t))
			printf("成功按照学号排序！\n");
		else
			printf("排序失败\n") ; 
	}
	else if(o==1)
	{
		if(scoreSort(l,t))
			printf("成功按照分数排序！\n");
		else
			printf("排序失败!\n") ; 
	}
	if(!Traverse(l))
	printf("无学生信息\n");
	return 0;
}
