/**
 * MonsterDecorator is a abstract class that adds onto monster name, hp, and
 * attack points.
 */
public abstract class MonsterDecorator extends Monster {
	/** Calling the superclasses monster */
	private Monster monster;

	/**
	 * MonsterDecorator is the constructor which the name and healthpoints can be
	 * changed based on the decoration called
	 * 
	 * @param m    the monster type that will be passed in
	 * @param name is the new name of the monster
	 * @param hp   is the new healthpoints that will be allocated to the monster
	 */
	public MonsterDecorator(Monster m, String name, int hp) {
		super(name, hp);
		monster = m;
	}

	/**
	 * attack is our abstract method that is passed from Monster class
	 * 
	 * @return the monsters attack from decorator subclasses
	 */
	@Override
	public int attack() {
		return monster.attack();
	}
}