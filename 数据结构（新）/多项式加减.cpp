#include<stdio.h>
#include<stdlib.h>
Polynomial PolyAdd(Polynomial P1,Polynomial P2)//Polynomial 多项式 
{
	Polynomial front,real,temp;
	int sum;
	rear=(Polynomial)malloc(sizeof(struct PolyNode));
	front=rear;
	while(P1&&P2)
	switch(Compare(P1->expon,P1->expon))
	{
		case 1:
			Attach(P1->coef,P1->expon,&rear);
			P1=P1->link;
			break;
		case -1:
			Attach(P2->coef,P2->expon,&rear);
			P2=P2->link;
			break;
		case 0:
			sum=P1->coef+P2->coef;
			if(sum)Attach(sum,P1->expon,&rear);
			P1=P1->link;
			P2=P2->link;
			break;
	}
	for(;P1;P1=P1->link)Attach(P1->coef,P1->expon,&rear);
	for(;P2;P2=P2->link)Attach(P2->coef,P2->expon,&rear);
	rear->link=NULL;
	temp=front;
	front=front->link;
	free(temp);
	return front;
 } 
 void Attach(int c,int e,Polynomial*pRear)
 {
 	Polynomial P;
 	P=(Polynomial)malloc(sizeof(struct PolyNode));
 	P->coef=c;//对新结点赋值 
 	P->expon=e;
 	P->link=NULL;
 	(*pRear)->link=p;
 	*pRear=P;//修改 pRear值 
 }
