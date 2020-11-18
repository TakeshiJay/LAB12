/**
 * Poison class is a subclass of monsterDecorator which allows the monster to
 * have the Poison ability while also raising HP and Attack points
 */
public class Poison extends MonsterDecorator {
	/**
	 * Poison method is the constructor that creates a new name string and adds
	 * healthPoints to the original monster
	 * 
	 * @param m is the monster that is passed in from the users choice of monsters
	 */
	public Poison(Monster m) {
		super(m, "Poison " + m.getName(), m.getHP() + 3);
	}

	/**
	 * Adds monsters initial damage to the Poison attack damage.
	 * 
	 * @return int the damage amount
	 */
	@Override
	public int attack() {
		return (2 + super.attack());
	}
}