package cs265;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;

public class CS265_Lab_W03TestBasic {

	
	@Test
	public void editDistance_basicTest2() {
		 int expectedValue = 4;
		 String text1 = "Software";
		 String text2 = "Hardware";
		 assertEquals(CS265_Lab_W03.editDistance(text1, text2),
		expectedValue);
		 }
	
	@Test
	public void editDistance_basicTest3() {
		 int expectedValue = 3;
		 String text1 = "paula";
		 String text2 = "scarla";
		 assertEquals(CS265_Lab_W03.editDistance(text1, text2),
		expectedValue);
		 }
	
	
	
	@Test
	public void editDistance_basicTest7() {
		 int expectedValue = 3;
		 String text1 = "moldy";
		 String text2 = "scoldy";
		 assertEquals(CS265_Lab_W03.editDistance(text1, text2),
		expectedValue);
		 }


	/*@Test
	public void editDistance_basicTest4() {
		 int expectedValue = 4;
		 String text1 = "pool";
		 String text2 = "fool";
		 assertEquals(CS265_Lab_W03.editDistance(text1, text2),
		expectedValue);
		 }
	
	@Test
	public void editDistance_basicTest5() {
		 int expectedValue = 4;
		 String text1 = "Marijuana is bad";
		 String text2 = "Marijuana is bad";
		 assertEquals(CS265_Lab_W03.editDistance(text1, text2),
		expectedValue);
		 }
*/
}
