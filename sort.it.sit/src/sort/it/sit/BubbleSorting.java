package sort.it.sit;

public class BubbleSorting {

	public BubbleSorting() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[]a= {38,19,29,5,12};
	int temp;
	// TODO Auto-generated method stub
for(int i=0;i<a.length;i++) {
for(int j=0;j<a.length-1-i;j++) {
	if(a[j]>a[j+1]) {
		temp=a[j];
		a[j]=a[j+1];
		a[j+1]=temp;
	}
}
}

for(int i=0;i<a.length;i++) {
System.out.print(a[i]+" ");	
}

}
}
