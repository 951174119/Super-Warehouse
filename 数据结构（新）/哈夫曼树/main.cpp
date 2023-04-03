#include"HF.h"
int main()
{
	int n=26;
	HuffmanCode HC;
	HC = (HuffmanCode) malloc((n + 1) * sizeof(char *));
	FILE*p1=fopen("SourceFile.txt","r");
	FILE*p2=fopen("Code.txt","w");
	FILE*p3=fopen("ResultFile.txt","w");
	printf("读取文件并统计出现的字符及其出现的频率\n");
	int *a;
	a=(int*)malloc(26*sizeof(int));
	for(int i=0;i<26;i++)
	{
		a[i]=0;
	}
	Sta(a,p1);
	HuffmanTree H;
	printf("初始化哈夫曼树\n");
	HuffmanCoding(H,a,n);
	printf("建造哈夫曼树\n");
	InitHT(H,n);
	printf("建立哈夫曼编码表并将编码表保存在文件中\n");
	fclose(p1);
	FILE*p6=fopen("SourceFile.txt","r");
	Extract(HC,n,H,p2,a);
	printf("根据哈夫曼编码表将文件中的字符转换成相应的编码文件\n");
	Coding(HC,p6,p3);

	fclose(p2);
	fclose(p3);
	FILE*p4=fopen("01.txt","r");
	FILE*p5=fopen("字符.txt","w");	
	printf("根据哈夫曼表翻译01文件");
	Decoding(H,p4,p5,n);
	fclose(p4);
	fclose(p5);
}
