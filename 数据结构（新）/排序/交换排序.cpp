//Ωªªª≈≈–Ú
#define MAXSIZE 20
typedef struct
{
	int data[MAXSIZE];
	int lenth;
}SqList;
//√∞≈›≈≈–Ú
void BubbleSort(SqList &L)
{
	int i,j,exchange;
	int temp;
	for(i=1;i<L.lenth;i++)
	{
		exchange=0;
		for(j=0;j<L.lenth-i;j++)
		{
			if(L.data[j]>L.data[j+1])
			{
				temp=L.data[j];
				L.data[j]=L.data[j+1];
				L.data[j+1]=temp;
				exchange=1;
			}
		}
		if(exchange==0) return;
	}
} 
//øÏÀŸ≈≈–Ú 
int Partition(SqList &L,int left,int right)
{
	L.data[0]=L.data[left];
	int pivotkey=L.data[left];
	while(left<right)
	{
		while(left<right&&pivotkey<=L.data[right])
			right--;
		L.data[left]=L.data[right];
		while(left<right&&pivotkey>=L.data[left])
			left++;
		L.data[right]=L.data[left];
	}
	L.data[left]=L.data[0];
	return left;
}
void QSort(SqList &L,int left,int right)
{
	if(left<right)
	{
		int pivotkey=Partition(L,left,right);
		QSort(L,left,pivotkey-1);
		QSort(L,pivotkey+1,right);
	}
}



















