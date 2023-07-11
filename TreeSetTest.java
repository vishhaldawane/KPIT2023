import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		
		ChemicalElement element1 = new ChemicalElement(79,196.97f,"Gold","Au");
		ChemicalElement element2 = new ChemicalElement(47,107.87f,"Silver","Ag");
		ChemicalElement element3 = new ChemicalElement(13,26.982f,"Aluminium","Al");
		ChemicalElement element4 = new ChemicalElement(3,6.938f,"Lithium","Li");
		ChemicalElement element5 = new ChemicalElement(26,55.845f,"Iron","Fe");
		System.out.println("Content is ready....");
		
		
		//ArrayList<ChemicalElement> periodicTable = new ArrayList<ChemicalElement>();
		//LinkedList<ChemicalElement> periodicTable = new LinkedList<ChemicalElement>();
		
		//HashSet<ChemicalElement> periodicTable = new HashSet<ChemicalElement>();
		
		TreeSet<ChemicalElement> periodicTable = new TreeSet<ChemicalElement>();
		System.out.println("Container is ready....");
		
		System.out.println("Trying to add elements....");
		
		System.out.println("Adding 1 element....");
		periodicTable.add(element1); //only ChemicalElement can be added, not anything else
		
		System.out.println("Adding 2 element....");
		periodicTable.add(element2);
		
		System.out.println("Adding 3 element....");
		periodicTable.add(element3);
		
		System.out.println("Adding 4 element....");
		periodicTable.add(element4);
		
		System.out.println("Adding 5 element....");
		periodicTable.add(element5);
		
		System.out.println("ALL elements are added....");
		
		//restricted only to ChemicalElement type iteration
		Iterator<ChemicalElement> iterator = periodicTable.iterator();
		
		while(iterator.hasNext()) {
			ChemicalElement theElement = iterator.next(); //no need of casting
			System.out.println("Element is : "+theElement);
			System.out.println("-----------------------");
		}
		

		
	}
}

// 

class ChemicalElement implements Comparable<ChemicalElement>
{
	int atomicNumber;
	float atomicWeight;
	String atomicName;
	String atomicFormula;
	
	
	@Override
	public int compareTo(ChemicalElement o) { //element1.compareTo(element1)
		System.out.println("Comparing "+atomicNumber+" with "+o.atomicNumber);
		System.out.println("-------------");
		return Integer.compare(o.atomicNumber, atomicNumber);
	}
	
	public ChemicalElement(int atomicNumber, float atomicWeight, String atomicName, String atomicFormula) {
		super();
		this.atomicNumber = atomicNumber;
		this.atomicWeight = atomicWeight;
		this.atomicName = atomicName;
		this.atomicFormula = atomicFormula;
	}
	@Override
	public String toString() { //overridden here | dont have to write showChemicalElement()
		return "ChemicalElement [atomicNumber=" + atomicNumber + ", atomicWeight=" + atomicWeight + ", atomicName="
				+ atomicName + ", atomicFormula=" + atomicFormula + "]";
	}
}


/*





*/
