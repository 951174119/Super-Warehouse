#include"HF.h"
int main()
{
	int n=26;
	HuffmanCode HC;
	HC = (HuffmanCode) malloc((n + 1) * sizeof(char *));
	FILE*p1=fopen("SourceFile.txt","r");
	FILE*p2=fopen("Code.txt","w");
	FILE*p3=fopen("ResultFile.txt","w");
	printf("��ȡ�ļ���ͳ�Ƴ��ֵ��ַ�������ֵ�Ƶ��\n");
	int *a;
	a=(int*)malloc(26*sizeof(int));
	for(int i=0;i<26;i++)
	{
		a[i]=0;
	}
	Sta(a,p1);
	HuffmanTree H;
	printf("��ʼ����������\n");
	HuffmanCoding(H,a,n);
	printf("�����������\n");
	InitHT(H,n);
	printf("���������������������������ļ���\n");
	fclose(p1);
	FILE*p6=fopen("SourceFile.txt","r");
	Extract(HC,n,H,p2,a);
	printf("���ݹ�����������ļ��е��ַ�ת������Ӧ�ı����ļ�\n");
	Coding(HC,p6,p3);

	fclose(p2);
	fclose(p3);
	FILE*p4=fopen("01.txt","r");
	FILE*p5=fopen("�ַ�.txt","w");	
	printf("���ݹ���������01�ļ�");
	Decoding(H,p4,p5,n);
	fclose(p4);
	fclose(p5);
}
