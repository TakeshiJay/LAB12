/** Creates a zombie type of monster */
public class Zombie extends Monster {
	/** Constructs a vampire with its name and hp. */
	public Zombie() {
		super("Zombie", 7);
	}

	/**
	 * Determines the zombie's attack damage.
	 * 
	 * @return int the damage amount
	 */
	@Override
	public int attack() {
		return 5;
	}
}