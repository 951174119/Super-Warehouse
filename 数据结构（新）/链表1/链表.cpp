#include"student.h" 
#include<stdio.h>
int main() {
	LinkList l;
	if(Init(l))		
		printf("��ʼ���ɹ���\n");
	if(Isempty(l))	
		printf("��̬˳���Ϊ�գ�\n");
	else 	
		printf("��̬˳���Ϊ�գ�\n");	
	printf("������Ҫ��д��ѧ��������\n");
	int n;
	scanf("%d",&n);
	printf("����������ѧ����ѧ�š��������ɼ���\n");
	for(int g=0;g<n;g++)
	{
		Student B;
		scanf("%s %s %d",&B.no,&B.name,&B.score);
		if(Insert(l,g+1,B))
			printf("����ɹ�\n");
		else printf("����ʧ��\n");
	}

	if(!Traverse(l))
		printf("��ѧ����Ϣ\n");
	else printf("�����ɹ���\n");
	char a[20];
	printf("��������Ҫ���ҵ�ѧ������:\n");
	scanf("%s",&a);
	if(NameFind(l,a)!=NULL)
	{
		printf("���ҳɹ���\n");
		printf("����ѧ����ѧ����%s,�ɼ���%d\n",NameFind(l,a)->data.no,NameFind(l,a)->data.score);
	}
	else
		printf("����ʧ�ܣ�\n");
	int k;
	printf("������ҵڼ�λѧ������Ϣ��");
	scanf("%d",&k);
	while(!Find(l,k))
		scanf("%d",&k);
	if(Find(l,k)!=NULL)
	{
		printf("���ҳɹ���\n");
		printf("����ѧ����ѧ����%s,�ɼ���%d\n",Find(l,k)->data.no,Find(l,k)->data.score);
	}
	else
		printf("����ʧ�ܣ�\n");
	printf("������������Ҫ�����ѧ����ѧ�š��������ɼ�\n");
	Student q;
	scanf("%s %s %d",&q.no,&q.name,&q.score);
	printf("���������λ�ã�");
	int m;
	scanf("%d",&m);
	if(Insert(l,m,q))
		printf("����ɹ���\n");
	else
		printf("����ʧ�ܣ�\n"); 
	int e;
	printf("����������Ҫɾ��ѧ����λ�ã�");
	scanf("%d",&e);
	if(Del(l,e))
		printf("ɾ���ɹ���\n");
	else
		printf("ɾ��ʧ�ܣ�\n");
	Traverse(l); 
	printf("����������ؼ���(����0����ѧ������,����1���շ�������)��\n");
	int o;
	scanf("%d",&o);
	printf("��ѡ������ʽ(����0�ݼ�,����1����)��\n") ;
	int t;
	scanf("%d",&t);
	if(o!=0&&o!=1) 
	{
		printf("����ʧ�ܣ�\n");
	}
	if(o==0)
	{
		if(noSort(l,t))
			printf("�ɹ�����ѧ������\n");
		else
			printf("����ʧ��\n") ; 
	}
	else if(o==1)
	{
		if(scoreSort(l,t))
			printf("�ɹ����շ�������\n");
		else
			printf("����ʧ��!\n") ; 
	}
	if(!Traverse(l))
	printf("��ѧ����Ϣ\n");
	return 0;
}
