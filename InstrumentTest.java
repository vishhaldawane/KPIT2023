
public class InstrumentTest {
	public static void main(String[] args) {
		
		//Object slicing

		Instrument g = new Guitar();
		g.use(); 		//Instrument
		g.play();		//MusicalInstrument
		g.tuneStrings();//StringBasedMusicalInstrument
		g.pluck();      //Guitar
	}
}

interface Instrument //pure abstract
{
	void use(); //by default it is public and abstract
}

abstract class MusicalInstrument implements Instrument
{
	abstract void play();
}
abstract class StringBasedMusicalInstrument extends MusicalInstrument
{
	abstract void tuneStrings();
}
class Guitar extends StringBasedMusicalInstrument 
{
	public void use() {
		System.out.println("Guitar is being used...");
	}
	void tuneStrings() {
		System.out.println("Tuning the guitar strings....");
	}
	void play() {
		System.out.println("Playing guitar.....");
	}
	void pluck() {
		System.out.println("Plucking the strings of the guitar....");
	}
}
class Violin extends StringBasedMusicalInstrument 
{
	

	public void use() {
		System.out.println("Violin is being used...");
	}
	void tuneStrings() {
		System.out.println("Tuning the Violin strings....");
	}
	void play() {
		System.out.println("Playing Violin .....");
	}
	void bowing() {
		System.out.println("Bowing the strings of the violin....");
	}
}
