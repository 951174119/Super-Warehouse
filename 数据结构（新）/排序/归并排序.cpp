#include<stdlib.h>
//�鲢���� 
#define MAXSIZE 20
typedef struct
{
	int data[MAXSIZE];
	int lenth;
}SqList;
//�����ڵ����������SR[left,m]��[m+1,right]�鲢��������TR��
void Merge(int*SR,int left,int m,int right)
{
	int *TR=(int*)malloc((right-left+1)*sizeof(int));
	int i=left;
	int j=m+1,k=0;
	while(i<=m&&j<=left)
	{
		if(SR[i]<SR[j])
			TR[k++]=SR[i++];
		else
			TR[k++]=SR[j++];
	}
	if(i<=m)
		while(i<=m) TR[k++]=SR[j++];
	if(j<=right)
		while(j<=right) TR[k++]=SR[j++];
	for(i=left,k=0;i<=right;i++,k++)
		SR[i]=TR[k];
	free(TR);
} 
//�鲢���� 
void MergePass(int *R,int lenth,int n)
{
	for(i=1;i+2*lenth-1<n;i+=2*lenth)
		Merge(R,i,i+lenth-1,i+2*lenth-1);
	if(i+lenth<n)
		Merge(R,i,i+lenth,n);
} 
//�鲢����
void MergeSort(SqList &L)
{
	int k;
	for(k=1;k<n;k=2*k)
		MergePass(L.data,k,L.lenth);
}












 
