package com.wjb.observer_test;
import com.wjb.observer_impl.CurrentConditionsDisplay;
import com.wjb.observer_impl.WeatherData;


public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentDisplay =
				new CurrentConditionsDisplay(weatherData);	//首先，将观察者注册到主题上
//		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
//		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		
		weatherData.setMeasurements(89, 67, 34);			//然后，对观察者插入数据，发布数据
		weatherData.setMeasurements(78, 56, 12);
		weatherData.setMeasurements(76, 36, 58);
	}
}
