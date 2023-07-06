
public class CricketerTest {
	public static void main(String[] args) {
		/*Cricketer cricketer1 = new Cricketer();
		Cricketer cricketer2 = new Cricketer();
		Cricketer cricketer3 = new Cricketer();
		Cricketer cricketer4 = new Cricketer();
		Cricketer cricketer5 = new Cricketer();
		Cricketer cricketer6 = new Cricketer();*/
		
//		int         score          [] = new  int      [5];
		Cricketer indianCricketTeam[] = new Cricketer[11]; //11 references in one shot
		
		indianCricketTeam[0] = new Cricketer(); //the real instance creation process is here
		indianCricketTeam[1] = new Cricketer(); //the real instance creation process is here
		indianCricketTeam[2] = new Cricketer(); //the real instance creation process is here
		indianCricketTeam[3] = new Cricketer(); //the real instance creation process is here
		indianCricketTeam[4] = new Cricketer(); //the real instance creation process is here
		indianCricketTeam[5] = new Cricketer(); //the real instance creation process is here
			
		indianCricketTeam[0].setCricketerDetails(1, "Virat", 30, 9000);
		indianCricketTeam[1].setCricketerDetails(2, "Sachin", 40, 10000);
		indianCricketTeam[2].setCricketerDetails(3, "Sehvag", 35, 9500);
		indianCricketTeam[3].setCricketerDetails(4, "Dhoni", 39, 7000);
		indianCricketTeam[4].setCricketerDetails(5, "Yuvraj", 38, 8000);
		indianCricketTeam[5].setCricketerDetails(6, "Harbhajan", 33, 3000);
		
		/*for (Cricketer cricketer : indianCricketTeam) {
			cricketer.showCricketerDetails();
		}*/
		
		for (int i = 0; i < 6; i++) {
			indianCricketTeam[i].showCricketerDetails();

		}
		
	}
}

class Cricketer
{
	int rank;
	String cricketerName;
	int age;
	int totalScore;
	
	void setCricketerDetails(int r, String cn, int a, int ts) {
		rank = r;
		cricketerName = cn;
		age = a;
		totalScore = ts;
	}
	void showCricketerDetails() {
		System.out.println("Rank  : "+rank);
		System.out.println("Name  : "+cricketerName);
		System.out.println("Age   : "+age);
		System.out.println("Score : "+totalScore);
		System.out.println("-----------");
	}
}
