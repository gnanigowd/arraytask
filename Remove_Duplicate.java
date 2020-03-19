package mentor_questions;

public class Remove_Duplicate {

	public static void main(String[] args) {
		int list[] = {2,2,2,3,4,4,4,5,6,6,6,7,7,7,8,9,};
		int list1 [] =new int [list.length];
		int var = 0;
		for (int i = 0;i<list.length-1;i++) {
			if (list[i]!=list[i+1]) {
				list1[var]=list[i];
				var=var+1;
				System.out.println(list[var]=list[i]);
				
			}
		}
		System.out.println(list[var]=list[list.length-1]);

}
}

