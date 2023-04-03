#include<stdio.h>
void merge(int* nums1, int nums1Size, int m, int* nums2, int nums2Size, int n){
int i=m,j=n,x;
while(i-1>=0){
    nums1[m+j-1]=nums1[i-1];
    nums1[i]=0;
    j--;
    i--;
}
for(i=n,j=0,x=0;i<nums1Size&&j<nums2Size;x++)
{
 if(nums1[i]<=nums2[j])
    {
        nums1[x]=nums1[i];

        i++;
    }
    else
    {
        nums1[x]=nums2[j];

        j++;
    }
}
if(i=nums1Size)
{
  while(x<nums1Size)
    {
        nums1[x]=nums2[j];
        j++;
    }
}
else{
    while(x<nums1Size)
    {
        nums1[x]=nums1[i];
        i++;
    }
}
}
int main(){
	int* nums1; 
	int nums1Size=3,m=5; 
	int* nums2;
	int nums2Size=2,n=2;
	int i,j;
	for(i=0;i<5;i++)
	{
		if(i<3)
		scanf("%d",&nums1[i]);
		else
		nums1[i]=0;
	}
		for(i=0;i<2;i++)
	scanf("%d",&nums2[i]);
	merge( nums1,  nums1Size,  m, nums2, nums2Size,  n);
	for(i=0;i<5;i++)
	printf("%d",nums1[i]);
	return 0;
}
