package cs265;

public class CS265_Lab_W05 {
	
	/** Defines the visual property of the sky */
	enum Sky {Cloudy, Mixed, Clear};
	
	/** Defines the various categories of weather prediction, including an error */
	enum WeatherPrediction {Rainy, Sunny, Error};
	
	/** The method is part of a Weather Prediction Service to reliably predict Irish weather. 
	 * The specification states the following:
	 * 
	 * The temperature is expressed in Celsius and simplified to full degrees (e.g. 10 for 10 degrees 
	 * Celsius, or -5 for minus 5 degrees Celsius). 
	 * The sky parameter is obtained from another service that interprets the looks of the sky 
	 * (either by an AI using a webcam-based image, or by a low-payed employee looking out of the 
	 * window all day and regularly pressing a button).
	 * Temperatures under -15 degrees are not possible and result in an Error weather prediction.
	 * If the sky is Cloudy or Mixed, the prediction is always Rainy
	 * If the temperature is less than +15 degrees, the prediction is Rainy.
	 * If the Sky is Clear and the temperature is +15 degrees or more, the prediction is Sunny. 
	 * 
	 * @param variable1 The temperature in degrees Celsius
	 * @param sky The visual property of the sky
	 * @return The prediction of the weather
	 */
	public static WeatherPrediction predictWeather(int variable1, Sky sky){
		return WeatherPrediction.Rainy; // works well for Ireland!
	}
	
	/** Defines the type of airline ticket that the customer holds */
	enum TicketType {Economy, Business, First};
	
	/** 
	 * The method is used by an airline booking system to automatically determine the amount of insurance 
	 * travelers must pay for their ticket. The following rules apply:
	 * 
	 * Travelers can bring a maximum of two pieces of equipment --- a maximum of one piece of sports 
	 * equipment and a maximum of one piece of musical equipment.
	 * The standard cost for one piece of equipment --- either sports or music equipment --- is �10 each. This 
	 * means, if they only bring one piece of equipment, the standard price of the insurance is �10; if they bring 
	 * two, the standard price is �20.
	 * If they bring no equipment, then standard insurance fee is 5�, but Business and First Class Travelers 
	 * do not need to pay for this. Both Business and First Class Travelers pay �0 in that case.
	 * Business Travelers get 50% discount on the total amount if they have any equipment.
	 * First Class Travelers have their insurance included. They always pay �0 regardless if they have 
	 * nothing, or any combination of equipment. 
	 * 
	 * @param sportsEquipment True if the traveler brings one piece of sports equipment
	 * @param musicEquipment True if the traveler brings one piece of music equipment
	 * @param ticketType The type of airline ticket that this customer holds (as defined by TicketType)
	 */
	public static int equipmentInsurance(boolean sportsEquipment, boolean musicEquipment, TicketType ticketType){
		int insurance;
		if (sportsEquipment && musicEquipment){
			insurance = 20;
		} else {
			if (sportsEquipment || musicEquipment){
				insurance = 10;
			} else {
				if (ticketType == TicketType.Business || ticketType == TicketType.First){
					insurance = 0;
				} else {
					insurance = 5;
				}
				
			}
		}
		if (ticketType == TicketType.First){
			insurance = 0;
		} else if (ticketType == TicketType.Business){
			insurance /= 2;
		}
		return insurance;
	}
	
}