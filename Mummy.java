/** Creates a mummy type of monster */
public class Mummy extends Monster {
	/** Constructs a mummy with its name and hp. */
	public Mummy() {
		super("Mummy", 5);
	}

	/**
	 * Determines the mummy's attack damage.
	 * 
	 * @return int the damage amount
	 */
	@Override
	public int attack() {
		return 4;
	}
}