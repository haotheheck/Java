package cs265;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.DataProvider;
import cs265.CS265_Lab_W05.WeatherPrediction;
import cs265.CS265_Lab_W05.Sky;

public class DataProvider5 {


	//test data 
	private static Object[][] weatherPrediction = new Object[][] {
		// id, variable1, variable2, ... variableN, expected
  
        { "5",4, Sky.Clear},
        {"2", 20 , Sky.Mixed},
        {"1", -20, Sky.Cloudy},

	};


	

	@DataProvider(name = "weatherPrediction")
	public Object[][] getWeatherPrediction() {
		return weatherPrediction;
		
	///	System.out.print(weatherPrediction);
	}


	@Test(dataProvider = "weatherPrediction")
	public void test1(String id, int temperature, Sky sky) {
		 return ;
	}
	

}