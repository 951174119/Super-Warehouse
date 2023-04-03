#include<stdio.h>
#include<stdlib.h>
#include<string.h>
typedef struct {
    char no[11];   //10位学号
    char name[20]; //姓名
    int score;     //成绩
}Student;
typedef struct LNode{
     Student data;       //数据域
     struct LNode  *next;   //指针域
}LNode,*LinkList;   
bool Init(LinkList &L); 	//链表初始化 
bool Isempty(LinkList L);	//判空 
bool Traverse(LinkList L);	//遍历 
LinkList NameFind(LinkList L,char s[20]); 	//按姓名查找 
LinkList Find(LinkList L,int n); //按位置查找
LinkList Insert(LinkList &L,int n,Student A); //插入学生信息
LinkList Del(LinkList &L,int n); //删除
int Length(LinkList L);//求表长 
LinkList noSort(LinkList &L,int n); //按学号排序 n=1时递增   n=0时递减 
LinkList scoreSort(LinkList &L,int n);//按成绩排序 n=1时递增   n=0时递减 
