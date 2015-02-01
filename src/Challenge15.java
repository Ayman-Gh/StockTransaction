// Ayman Alghamdi

//OK. Ozgur Aktunc
public class Challenge15 {

	public static void main(String[] args) {

		int customers = 12467;
		double ENcoustm = .14 * customers; // customers who are drink Energy
											// Drinks
		double CitrusFlavCus = .64 * ENcoustm; // customers who prefer citrus
												// flavored energy drinks

		System.out
				.printf("A soft drink company recently surveyed %d approximately "
						+ "%f surveyed purchase.\n Of those customers who purchase energy drinks, "
						+ "approximately %f prefer citrus flavored energy drinks.",
						customers, ENcoustm, CitrusFlavCus);
	}
}
