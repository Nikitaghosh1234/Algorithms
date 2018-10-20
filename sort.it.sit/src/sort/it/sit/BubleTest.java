package sort.it.sit;

public class BubleTest {

	public BubleTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]a= {"niki","anjali","piyu"};
		String temp;
		// TODO Auto-generated method stub
for(int i=0;i<a.length;i++) {
	for(int j=0;j<a.length-1-i;j++) {
		if(a[j].compareTo(a[j+1])>0) {
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
