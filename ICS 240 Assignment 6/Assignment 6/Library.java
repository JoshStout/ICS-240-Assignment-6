/**
 * 
 * Invariants:
 * 1 - the state of the library is stored in an instance variable called state.
 * 2 - the branch name of the library is stored in an instance variable called branch.
 * 3 - the city of the library is stored in an instance variable called city.
 * 4 - the zip of the library is stored in an instance variable called zip.
 * 5 - the county of the library is stored in an instance variable called county.
 * 6 - the square feet of the library is stored in an instance variable called squareFeet.
 * 7 - the hours open for the library is stored in an instance variable called hoursOpen.
 * 8 - the weeks open for the library is stored in an instance variable called weeksOpen.
 *
 */
public class Library implements Comparable<Library> {
	private String state;
	private String branch;
	private String city;
	private String zip;
	private String county;
	private int squareFeet;
	private int hoursOpen;
	private int weeksOpen;
	
	/**
	 * Constructor for [Library] class.
	 * @param state - the state of the library
	 * @param branch - the branch name of the library
	 * @param city - the city of the library
	 * @param zip - the zip of the library
	 * @param county - the county of the library
	 * @param squareFeet - the square feet of the library
	 * @param hoursOpen - the hours open for the library
	 * @param weeksOpen - the weeks open for the library
	 */
	public Library(String state, String branch, String city, String zip, String county,int squareFeet, int hoursOpen, int weeksOpen) {
		this.state = state;
		this.branch = branch;
		this.city = city;
		this.zip = zip;
		this.county = county;
		this.squareFeet = squareFeet;
		this.hoursOpen = hoursOpen;
		this.weeksOpen = weeksOpen;
	}
	
	/**
	 * Accessor method to get the state.
	 * @return - a String representation of the state.
	 */
	public String getState() {
		return state;
	}
	
	/**
	 * Accessor method to get the branch name.
	 * @return - a String representation of the branch name.
	 */
	public String getBranch() {
		return branch;
	}
	
	/**
	 * Accessor method to get the city.
	 * @return - a String representation of the city.
	 */
	public String getCity() {
		return city;
	}
	
	/**
	 * Accessor method to get the zip.
	 * @return - a String representation of the zip.
	 */
	public String getZip() {
		return zip;
	}
	
	/**
	 * Accessor method to get the county.
	 * @return - a String representation of the county.
	 */
	public String getcounty() {
		return county;
	}
	
	/**
	 * Access method to get the square feet.
	 * @return - an int representing the square feet
	 */
	public int getSquareFeet() {
		return squareFeet;
	}
	
	/**
	 * Access method to get the hours open.
	 * @return - an int representing the hours open.
	 */
	public int getHoursOpen() {
		return hoursOpen;
	}
	
	/**
	 * Access method to get the weeks open.
	 * @return - an in representing the weeks open.
	 */
	public int getWeeksOpen() {
		return weeksOpen;
	}
	
	/**
	 * Modifier method to set the state.
	 * @param state - a String representation of the state.
	 */
	public void setState(String state) {
		this.state = state;
	}
	
	/**
	 * Modifier method to set the branch name.
	 * @param branch - a String representation of the branch name.
	 */
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	/**
	 * Modifier method to set the city.
	 * @param city - a String representation of the city.
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
	/**
	 * Modifier method to set the zip.
	 * @param zip - a String representation of the zip.
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	/**
	 * Modifier method to set the county.
	 * @param count - a String representation of the county.
	 */
	public void setcounty(String count) {
		this.county = count;
	}
	
	/**
	 * Modifier method to set the square feet.
	 * @param sqfeet - a int representing the square feet.
	 */
	public void setSquareFeet(int sqfeet) {
		this.squareFeet = sqfeet;
	}
	
	/**
	 * Modifier method to set the hours open.
	 * @param hrsOpen - an int representing the hours open.
	 */
	public void setHoursOpen(int hrsOpen) {
		this.hoursOpen = hrsOpen;
	}
	
	/**
	 * Modifier method to set the weeks open.
	 * @param weeksOpen - an int representing the weeks open.
	 */
	public void setWeeksOpen(int weeksOpen) {
		this.weeksOpen = weeksOpen;
	}
	
	/**
	 * A method to override the equals by compare the branch names only
	 * and is case insensitive.
	 * @param obj - a [Library] object to be compared.
	 * @return - a boolean value representing if the two [Library] objects are equal.
	 */
	@Override
	public boolean equals(Object obj) {
		Library other = (Library) obj;
		return this.branch.equalsIgnoreCase(other.branch);
	}
	
	/**
	 * A method to override the compareTo method by comparing [Library] objects
	 * using the branch names only, case insensitive.
	 * @param o - a [Library] object to be compared.
	 * @return - an int representing the difference of the two [Library] objects, zero if equal.
	 */
	@Override
	public int compareTo(Library o) {
		Library obj = (Library) o;
		return this.getBranch().compareToIgnoreCase(obj.getBranch());
	}
	
	/**
	 * A toString override method.
	 * @return - a String representation of the [Library] object.
	 */
	@Override 
	public String toString() {
		String output = "";
		output += state;
		output += "\t";
		output += branch;
		output += "\t";
		output += city;
		output += "\t";
		output += zip;
		output += "\t";
		output += county;
		output += "\t";
		output += squareFeet;
		output += "\t";
		output += hoursOpen;
		output += "\t";
		output += weeksOpen;
		output += "\t";
		return output;	
	}
	

}
