package interfaces;

public interface PersistenceConnection {

	/**
	 * Skaber forbindelse til en database manager.
	 */
	public void connect();
	
	/**
	 * Lukker forbindelsen.
	 */
	public void disconnect();
	
	/**
	 * Udf�rer alle �ndringer siden den sidste commit/rollback.
	 */
	public void commit();
	
	/**
	 * Skaber et nyt savepoint med et navn og returnerer et nyt savepoint objekt.
	 */
	public void setSavepoint(String name);
		
	/**
	 * Fortryder alle �ndringer siden den sidste commit/savepoint.
	 */
	public void rollback();
	
}
