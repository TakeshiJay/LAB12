/**
 * Speed class is a subclass of monsterDecorator which allows the monster to
 * have the Speed ability while also raising HP and Attack points
 */
public class Speed extends MonsterDecorator {
	/**
	 * Speed method is the constructor that creates a new name string for the
	 * monster and while also adding healthpoints
	 * 
	 * @param m is the monster that is passed in from the users choice of monsters
	 *          in the main
	 */
	public Speed(Monster m) {
		super(m, "Speed " + m.getName(), m.getHP() + 7);
	}

	/**
	 * Adds monsters initial damage to the Speeds attack damage.
	 * 
	 * @return int the damage amount
	 */
	@Override
	public int attack() {
		return (6 + super.attack());
	}
}