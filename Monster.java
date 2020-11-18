/** Monster class creates the monster's base background */
public abstract class Monster {
	/** name is the instance variable of the monsters name */
	private String name;
	/** hp is the healthpoints instance variable of the monster */
	private int hp;

	/**
	 * constructor that initializes the monsters information
	 * 
	 * @param n  name of the monster
	 * @param hp healthpoints of the monster
	 *
	 */
	public Monster(String n, int hp) {
		name = n;
		this.hp = hp;
	}

	/**
	 * getter method that returns the monsters healthpoints
	 * 
	 * @return healthpoints of monster
	 */
	public int getHP() {
		return this.hp;
	}

	/**
	 * getter method that returns the monsters name
	 * 
	 * @return name of the monster
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Abstract method that will be extended for each type of monster and attack
	 * will be added to.
	 * 
	 * @return attackpoints of the monster
	 */
	public abstract int attack();
}