//链表逆转算法
//单链表的逆转
Ptr Reverse(Ptr head,int K)
{
	cnt=1
	new=head->next;
	old=new->next;
	while(cnt<K){
		tmp=old->next;
		old->next=new;
		new=old;
		old=tmp;
		cnt++;
	}
	head->next->next=old;
	return new;
 } 
