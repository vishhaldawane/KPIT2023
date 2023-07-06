
public class ArrayTest {
	public static void main(String[] args) {
		
		int score[]= {10,20,30,40,50}; //number of initializers is the size of the array
		
		int marks[] = new int[6];// size is specified here
		
		for (int i = 3; i < 5; i++) {
			System.out.println("Score : "+score[i]); //referring index
		}
		
		System.out.println("-------");
		
		//lower bound is always 0
		//higher bound is as per the array size
		
		for (int i : score) { //iterates each value of marks, from 0 to last
			System.out.println("i is : "+i); //indexless way
		}
		
		marks[0]=98;
		marks[1]=88;
		marks[2]=92;
		marks[3]=96;
		marks[4]=91;
		marks[5]=90;
		System.out.println("------------");
		for (int i = 0; i < marks.length; i++) {
			System.out.println("marks : "+marks[i]); //referring index
		}
		
		
	}
}
