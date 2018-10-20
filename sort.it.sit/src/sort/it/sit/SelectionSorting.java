package sort.it.sit;

public class SelectionSorting {

	public SelectionSorting() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]a= {90,34,10,54,5};
int min;int temp=0;
for(int i=0;i<a.length;i++)
{
	min=i;
	for(int j=i+1;j<a.length;j++)
	{
		if(a[j]<a[min])
		{
			min=j;
		}
		temp=a[i];
		a[i]=a[min];
		a[min]=temp;
	}
}
for(int i=0;i<a.length;i++) {
	System.out.print(a[i]+" ");
}
	}

}
