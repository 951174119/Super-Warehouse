//������ת�㷨
//���������ת
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
