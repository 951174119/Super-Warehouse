#include<stdio.h>
#include<stdlib.h>
#include<string.h>
typedef struct {
    char no[11];   //10λѧ��
    char name[20]; //����
    int score;     //�ɼ�
}Student;
typedef struct LNode{
     Student data;       //������
     struct LNode  *next;   //ָ����
}LNode,*LinkList;   
bool Init(LinkList &L); 	//�����ʼ�� 
bool Isempty(LinkList L);	//�п� 
bool Traverse(LinkList L);	//���� 
LinkList NameFind(LinkList L,char s[20]); 	//���������� 
LinkList Find(LinkList L,int n); //��λ�ò���
LinkList Insert(LinkList &L,int n,Student A); //����ѧ����Ϣ
LinkList Del(LinkList &L,int n); //ɾ��
int Length(LinkList L);//��� 
LinkList noSort(LinkList &L,int n); //��ѧ������ n=1ʱ����   n=0ʱ�ݼ� 
LinkList scoreSort(LinkList &L,int n);//���ɼ����� n=1ʱ����   n=0ʱ�ݼ� 
