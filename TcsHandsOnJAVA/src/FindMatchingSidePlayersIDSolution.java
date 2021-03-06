import java.util.Arrays;
import java.util.Scanner;

public class FindMatchingSidePlayersIDSolution {

	public static void main(String[] args) {
//code to read values
		Players[] players = new Players[4];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < players.length; i++) {
			// System.out.println("Enter the ID:");
			int id = sc.nextInt();
//System.out.println("Enter the Country:");
			String country = sc.next();
//System.out.println("Enter the Side:");
			String side = sc.next();
//System.out.println("Enter the Price:");
			double price = sc.nextDouble();
			players[i] = new Players(id, country, side, price);
		}
//System.out.println("Enter the side for search:");
		String search = sc.next();
		sc.close();
//code to call required method
		Integer[] Playerid = searchPlayerForMatch(players, search);
//code to display the result
		for (int i = 0; i < Playerid.length; i++) {
			System.out.println(Playerid[i]);
		}
	}

	public static Integer[] searchPlayerForMatch(Players[] players, String search) {
//method logic
		Integer[] result = new Integer[0];
		for (int i = 0; i < players.length; i++) {
			if (players[i].getSide().equals(search)) {
				result = Arrays.copyOf(result, result.length + 1);
				result[result.length - 1] = (Integer) (players[i].getId());
			}
		}
		Arrays.sort(result);
		// code to find price, sort and return the sorted array.
		return (result);
	}
}

class Players {
//code to build Player class
	int id;
	String country;
	String side;
	double price;

	Players(int id, String country, String side, double price) {
		this.id = id;
		this.country = country;
		this.side = side;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getSide() {
		return side;
	}

}
