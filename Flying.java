/**
 * Flying class is a subclass of monsterDecorator which allows the monster to
 * have the flying ability, raising HP and Attack points
 */
public class Flying extends MonsterDecorator {
	/**
	 * Flying is the constructor that adds a new string and healthPoints to the
	 * original monster
	 * 
	 * @param m is the monster that is passed in from the users choice of monsters
	 */
	public Flying(Monster m) {
		super(m, "Flying " + m.getName(), m.getHP() + 5);
	}

	/**
	 * Adds monsters initial damage to the Flying attack damage.
	 * 
	 * @return int the damage amount
	 */
	@Override
	public int attack() {
		return super.attack() + 5;
	}
}