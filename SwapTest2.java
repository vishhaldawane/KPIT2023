import java.util.LinkedList;

import com.mysongs.Song;

public class SwapTest2 {
	public static void main(String[] args) {
		

		//LinkedList ll = new LinkedList();
		
		
		//means a sac is now dedicated only to hold Rice, so that it is a Rice's sac
		AnyPair<Integer> np = new AnyPair<Integer>(10, 20);
		np.printPair();
		np.swap();
		np.printPair();
		
		System.out.println("------------");
		Song s1 = new Song("My Heart Will Go On","Celine D","Titanic",1994);
		Song s2 = new Song("I want it that way","Backstreet Boys","Millenium",1998);
	
		AnyPair<Song> songPair = new AnyPair<Song>(s1, s2);
		songPair.printPair();
		songPair.swap();
		songPair.printPair();
		
		//What if two different BankAcccounts / Flights/ Employees / Students
	}
	
}

class AnyPair<T> // A generic class for any unknown data type
{
	T i;
	T j;
	
	AnyPair(T x, T y) {
		i = x;
		j = y;
	}	
	void printPair() {
		System.out.println("i "+i);
		System.out.println("j "+j);
	}	
	void swap() { 
		System.out.println("swapping..."); //swapping FIELDS, global i and j
		T temp = i;
		i = j;
		j=temp;
	}
}

/*
class NumberPair
{
	int i;
	int j;
	
	NumberPair(int x, int y) {
		i = x;
		j = y;
	}
	
	void printPair() {
		System.out.println("i "+i);
		System.out.println("j "+j);
	}
	
	void swap() { 
		System.out.println("swapping..."); //swapping FIELDS, global i and j
		int temp = i;
		i = j;
		j=temp;
	}
	
}


class SongPair // FlightPair, EmployeePair, StudentPair
{
	Song i; //DATA
	Song j;
	
	SongPair(Song x, Song y) { //LOGIC1
		i = x;
		j = y;
	}
	
	void printPair() { //LOGIC2
		System.out.println("i "+i); //toString would print the song details
		System.out.println("j "+j);
	}
	
	void swap() { //LOGIC3
		System.out.println("swapping..."); //swapping FIELDS, global i and j
		Song temp = i;
		i = j;
		j=temp;
	}
	
}
*/