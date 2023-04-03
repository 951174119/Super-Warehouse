#include"HF.h"
void Sta(int *a,FILE *p)
{
	char x;
	while(x!=EOF) 
	{
		x=fgetc(p); 
		int A=x;
		if(x>=97)
			a[A-97]+=1;
		else
			a[A-65]+=1;
	}
}
bool Select(HuffmanTree &H,int &s1,int &s2,int n)
{
	int min1=Max,min2=Max;
	int temp1=Max,temp2=Max;
	for(int i=1;i<2*n-1;i++)
	{
		if(H[i].weight!=0)
		{
		
		if(H[i].parent==0)
		{
			if(H[i].weight<temp2)
			{
				if(H[i].weight<temp1)
				{
					min2=min1;
					temp2=temp1;
					min1=i;
					temp1=H[i].weight;
				}
				else
				{
					temp2=H[i].weight;
					min2=i;
				}

			}
		}
	}
	}
	s1=(min1<min2)?min1:min2;
	s2=(min1<min2)?min2:min1;
	if(s2==Max)
		return false;
	return true;
}
void HuffmanCoding(HuffmanTree &H,int *a,int n)
{
	H=(HuffmanTree)malloc((2*n)*sizeof(HTNode));
	int i=1;
	for(i=1;i<=n;i++)
	{
		H[i].weight=a[i-1];
		H[i].LChild=0;
		H[i].parent=0;
		H[i].RChild=0;
	}
	for(;i<n*2;i++)
	{
		H[i].weight=0;
		H[i].LChild=0;
		H[i].parent=0;
		H[i].RChild=0;
	}
}
void InitHT(HuffmanTree &H,int n)
{
	int s1,s2;
	for(int i=n+1;i<2*n;i++)
	{
		if(Select(H,s1,s2,n))
	{
		H[s1].parent=i;
		H[s2].parent=i;
		H[i].weight=H[s1].weight+H[s2].weight;
		H[i].LChild=s1;
		H[i].RChild=s2;
	}
	else return;
	}
}
void Extract(HuffmanCode &HC,int n,HuffmanTree H,FILE *p,int *a)
{
	char *cd;
	cd = (char*) malloc(n*sizeof(char));
	int c;
	int f;	
	cd[n-1]='\0';
	for(int i=1;i<=n;i++)
	{
		int start=n-1;

		for(c=i,f=H[i].parent;f!=0;c=f,f=H[f].parent)
		{	
			if(H[f].LChild==c)
				cd[--start]='0';
			else cd[--start]='1';
			
		}
		HC[i]=(char*)malloc((n-start)*sizeof(char));
		strcpy(HC[i],&cd[start]);
	}
	free(cd); 
	for(int q=1;q<n+1;q++)
	{
		fprintf(p,"%c:%s\n",q+96,HC[q]);
		fputs("\n",p);
	}
}
void Coding(HuffmanCode &H,FILE *p1,FILE *p2)
{
	char x;
	int n;
	x=fgetc(p1);
	while(x!=EOF)
	{
		int q=x-96;
		fprintf(p2,"%s",H[q]);
		x=fgetc(p1);
	}
}
void Decoding(HuffmanTree &H,FILE *p1,FILE *p2,int n)
{
	char x;
	int p;
	int i;
	while(x!=EOF)
	{
		for(i=2*n-1;H[i].LChild!=0&&H[i].RChild!=0&&x!=EOF;)
		{
			x=fgetc(p1);
			if(x=='0')
				i=H[i].LChild;
			else if(x=='1')
				i=H[i].RChild;
		}
		char A=96+i;
		fprintf(p2,"%c",A);
	}
}






















