//ѡ������ 
#define MAXSIZE 20
typedef struct
{
	int data[MAXSIZE];
	int lenth;
}HeadType;
//������
void HeapAdjust(HeadType &H,int s,int m)       //����Ϊ�󶥶ѣ�H����ѵ����� 
{
	int rc=H.data[s];
	int j;
	for(j=2*s;j<=m;j*=2)
	{
		if(j<m&&H.data[j]<H.data[j+1])
			j++;
		if(rc>=H.data[j]) break;
		H.data[s]=H.data[j];
		s=j; 
	}
	H.data[s]=rc;
} 
void HeapSort(HeadType &H)
{
	int i;
	for(i=H.lenth/2;i>0;i--)
	{
		HeapAdjust(H,i,H.lenth);
	}
	for(i=H.lenth;i>1;i--)
	{
		int temp=H.data[1];
		H.data[1]=H.data[i];
		H.data[i]=temp;
		HeapAdjust(H,1,i-1);
	}
}
