/**
 * A program that constructs different monsters with hp and attack damages.
 * 
 * @author Catherine Bui and Jacob Sunia
 * @version 11/17/20
 */
public class Main {
	/** Creates a monster based on the user's choice */
	public static void main(String[] args) {
		int choice = 0;
		System.out.println("Monster Creator!");

		System.out.println("Choose a base monster: ");
		System.out.println("1. Zombie\n2. Vampire\n3. Mummy");
		choice = CheckInput.getIntRange(1, 3);
		if (choice == 1) {
			Monster m = new Zombie();
            System.out.println(m.getName() + " has " + m.getHP() + 
            " hp, and attacks for " + m.attack() + " damage.");
			display(m);
		} else if (choice == 2) {
			Monster m = new Vampire();
            System.out.println(m.getName() + " has " + m.getHP() + 
            " hp, and attacks for " + m.attack() + " damage.");
			display(m);
		} else if (choice == 3) {
			Monster m = new Mummy();
            System.out.println(m.getName() + " has " + m.getHP() + 
            " hp, and attacks for " + m.attack() + " damage.");
			display(m);
		}
	}

	/**
	 * Displays the ability menu until user quits.
	 * 
	 * @param the base monster that was created
	 */
	public static void display(Monster m) {
		int choice = 0;
		while (choice != 4) {
			System.out.println("Add an ability: ");
			System.out.println("1. Poison\n2. Speed\n3. Flying\n" + "4. Quit");
			choice = CheckInput.getIntRange(1, 4);
			if (choice == 1) {
				m = new Poison(m);
                System.out.println(m.getName() + " has " + m.getHP() + 
                " hp, and attacks for " + m.attack() + " damage.");
			} else if (choice == 2) {
				m = new Speed(m);
                System.out.println(m.getName() + " has " + m.getHP() + 
                " hp, and attacks for " + m.attack() + " damage.");
			} else if (choice == 3) {
				m = new Flying(m);
                System.out.println(m.getName() + " has " + m.getHP() + 
                " hp, and attacks for " + m.attack() + " damage.");
			} else if (choice == 4) {
				System.out.println("Exiting");
			}
		}
	}
}