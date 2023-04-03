#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#define Max 100000
typedef char** HuffmanCode;
typedef struct 
{
	unsigned int weight;
	unsigned int parent,LChild,RChild;
}HTNode,*HuffmanTree;
void Sta(int *a,FILE *p);
bool Select(HuffmanTree &H,int &s1,int &s2,int n);
void HuffmanCoding(HuffmanTree &H,int *a,int n);
void InitHT(HuffmanTree &H,int n);
void Extract(HuffmanCode &HC,int n,HuffmanTree H,FILE *p,int *a);
void Coding(HuffmanCode &H,FILE *p1,FILE *p2);
void Decoding(HuffmanTree &H,FILE *p1,FILE *p2,int n);
