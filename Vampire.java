/** Creates a vampire type of monster */
public class Vampire extends Monster {
	/** Constructs a vampire with its name and hp. */
	public Vampire() {
		super("Vampire", 10);
	}

	/**
	 * Determines the vampire's attack damage.
	 * 
	 * @return int the damage amount
	 */
	@Override
	public int attack() {
		return 8;
	}
}