package hw7Abstraction;

public interface University {
	
	// Interface cannot have constructor because we cannot instantiate them.
	/* public University() {
		}
	 */

	public void classSize();
	public abstract void playGround();
	public String teacher ();
}
