package ie.gmit.sw;

import java.util.ArrayList;
 
public class CompareDocumentFacade {
	 
	CompareDocument compareDocument = new CompareDocument();
	Shingles shingles = new Shingles();
	/**
	 * @param documentTitle String
	 * @param content String
	 * @return ArrayList<ComparisionResult>
	 */
	public ArrayList<ComparisionResult> comapareTwoDoucument(String documentTitle,String content1,String documentTitle2,String content2){
		DoumentDetails doumentDetails1 = new  DoumentDetails(documentTitle,  Shingles.parsed_constituentShingles(content1));
		DoumentDetails doumentDetails2 = new  DoumentDetails(documentTitle2, Shingles.parsed_constituentShingles(content2));
		 
		ArrayList<ComparisionResult> arrayListComparisionResult = compareDocument.compareDocumentWithDocumentsSet(doumentDetails1,doumentDetails2);
		for (ComparisionResult comparisionResult : arrayListComparisionResult) {
			System.out.println(comparisionResult.toString()); 
		}
		return arrayListComparisionResult;
	}
	
	public static void main(String[] args) {
		/*CompareDocumentFacade obj=new CompareDocumentFacade();
		String line1="a a a b b b c c c";
		String line2="a a a b b b u u u e e e";
		String line3="a a a b b b u u u e e e";
		String line4="a a a b b b u u u e e e q q q";
		String line5="a a a b b b u u u e e e o o o q q q";
		try {
			obj.comapareAndSaveDoucument("Doc1", line1);
			obj.comapareAndSaveDoucument("Doc2", line2);
			obj.comapareAndSaveDoucument("Doc4", line4);
			obj.comapareAndSaveDoucument("Doc5", line5);
			List<ComparisionResult> arrayListComparisionResult=obj.getAllCompasionResult();
			for (ComparisionResult comparisionResult : arrayListComparisionResult) {
				System.out.println(comparisionResult.getDocumentTitle()+" vs "+comparisionResult.getComapredDocumentTitle()+" = "+comparisionResult.getResult());
			}		
		} catch (Exception e) {
			e.printStackTrace();
		}*/
	
	}
}
