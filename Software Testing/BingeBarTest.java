package cs265;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.DataProvider;

public class BingeBarTest {

	// test data
	private static Object[][] testData = new Object[][] {
		// id,		TCI,	cocktail, 	nonAlc, 	student,	happyHour, 	expected
		{"T2.1",	"DT1",	true,		true,		true,		true,		9},
		{"T2.2",	"DT2",	true,		true,		true,		false,		18},
		{"T2.3",	"DT3",	true,		true,		false,		true,		18},
		{"T2.4",	"DT4",	true,		true,		true,		false,		18},
		{"T2.5",	"DT5",	true,		false,		true,		true,		4},
		{"T2.6",	"DT6",	true,		false,		true,		false,		8},
		{"T2.7",	"DT7",	true,		false,		false,		true,		8},
		{"T2.8",	"DT8",	true,		false,		false,		false,		8},
		{"T2.9",	"DT9",	false,		true,		true,		true,		5},
		{"T2.10",	"DT10",	false,		true,		true,		false,		10},
		{"T2.11",	"DT11",	false,		true,		false,		true,		10},
		{"T2.12",	"DT12",	false,		true,		false,		false,		10}

	};

	@DataProvider(name = "data")
	public Object[][] getTestData() {
		return testData;
	}

	@Test(dataProvider = "data")
	public void test(String id, String tci, boolean cocktail, boolean nonAlc, boolean student, boolean happyHour, int expected) {
		assertEquals(BingeBar.getPrice(cocktail, nonAlc, student, happyHour), expected);
	}
}