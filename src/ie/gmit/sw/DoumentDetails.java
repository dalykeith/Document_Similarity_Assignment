package ie.gmit.sw;
 
import java.util.Set;

public class DoumentDetails {
 
	String documentTitle;

	Set<String> shingles;
 
	/**
	 * @return the documentTitle
	 */
	public String getDocumentTitle() {
		return documentTitle;
	}
	/**
	 * @param documentTitle the documentTitle to set
	 */
	public void setDocumentTitle(String documentTitle) {
		this.documentTitle = documentTitle;
	}

	/**
	 * @return the shingles
	 */
	public Set<String> getShingles() {
		return shingles;
	}
	/**
	 * @param shingles the shingles to set
	 */
	public void setShingles(Set<String> shingles) {
		this.shingles = shingles;
	}
	public DoumentDetails(  String documentTitle,  Set<String> shingles) {
	 
		this.documentTitle = documentTitle;
	 
		this.shingles = shingles;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return documentTitle;
	}
	

}
