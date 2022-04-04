package bubble;

public class NewSort {

	public static void main(String[] args) {
		int myarr[] = {12,3,45,67,89,8,7,65};
		for (int i = 0; i < 8; i++) {
			for (int j = i; j < 8; j++) {
				if (myarr[i] > myarr[j]) {
					int temp;
					temp = myarr[i];
					myarr[i] = myarr[j];
					myarr[j] = temp;
				}
			}
		}
		for (int i = 0; i < 8; i++) {
			System.out.println(myarr[i]);
		}
	}

}
