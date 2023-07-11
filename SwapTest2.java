import java.util.LinkedList;

import com.mysongs.Song;

class RunAny {
	
	void run(A aRef) {
		
		aRef.foo(); //super class method
		if(aRef instanceof B) {
			B bRef = (B) aRef;   // every Surgeon is a Doctor, but every Doctor is not necessarily to be a Surgeon
			bRef.fun(); // + child class method too
		}

	}
}

public class SwapTest2 {
	public static void main(String[] args) {
		
		A a = new B();
	//	a.foo();
	//	a.fun();
		
		RunAny r = new RunAny();
		r.run(a); //at high level it is A's type, technically it is B (which is also an A)
		
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
	
		
		//b.foo(); // overridden is referred, ie of B's foo invoked
		//a.fun();
		
		if(a instanceof A)
		{
			System.out.println("a is of Type A");
			a.foo();
			
		}
		
		//Runtime Type Identification | Reflection - getClass
		
		System.out.println("---------");
		
		if(a instanceof B) //now a is pointing at B
		{
			System.out.println("b is of Type B");
			a.foo(); //early binding
			
			//a.fun(); //cannot
			B b = (B) a; // 
			b.fun();
		}
	}
}

class A // is A aware of B?
{
	void foo() {}
}
















class B extends A // B is acquiring
{
	void fun() { }
	void foo() { }
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