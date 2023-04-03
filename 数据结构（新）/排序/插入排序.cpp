//≤Â»Î≈≈–Ú 
#define MAXSIZE 20
typedef struct
{
	int data[MAXSIZE];
	int lenth;
}SqList;
//÷±Ω”≤Â»Î≈≈–Ú
void InsertSort(SqList &L)
{
	int i,j;
	for(i=2;i<=L.lenth;i++)
	{
		if(L.data[i]<L.data[i-1])
		{
			L.data[0]=L.data[i];
			for(j=i-1;L.data[0]<L.data[j];j--)
				L.data[j+1]=L.data[j];
		}
		L.data[j]=L.data[0];
	}
} 
//’€∞Î≤Â»Î≈≈–Ú 
void BInsertSort(SqList &L)
{
	int i,j,left,right;
	for(i=2;i<=L.lenth;i++)
	{
		L.data[0]=L.data[i];
		left=1;
		right=i-1;
		while(left<=right)
		{
			j=(left+right)/2;
			if(L.data[0]<L.data[j])
				right=j-1;
			else left=j+1;
		}
		for(j=i-1;j>right;j--)
			L.data[j+1]=L.data[j];
		L.data[right+1]=L.data[0];
	}
} 
 
