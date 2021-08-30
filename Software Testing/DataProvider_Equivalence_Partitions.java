package cs265;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.DataProvider;

public class DataProvider_Template {

	// test data
	private static Object[][] testData = new Object[][] {
			// id, variable1, variable2, ... variableN, expected
			{"1", "weed", "seed" , 1},
			{"2", "creep", "peep" , 2 },
			{"3", "steal" , "real", 2},
			{"4", "rub", "tub", 1 },
			{"5", "coop", "poop", 1},
			{"6", "steal" , "real", 2 },
	};

	@DataProvider(name = "data")
	public Object[][] getTestData() {
		return testData;
	}

	@Test(dataProvider = "data")
	public void test(String id, String variable1, String variable2, int expected) {
		 assertEquals(CS265_Lab_W03.editDistance(variable1, variable2),expected);
	}
}
