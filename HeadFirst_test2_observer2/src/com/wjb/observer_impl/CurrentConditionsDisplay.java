package com.wjb.observer_impl;
import com.wjb.weather_interface.*;

/**
 * 此布告板根据WeatherData对象显示当前观测值
 * 目前状况的布告（其中一个布告，或一个观察者）
 * @author hp
 * 
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement{
	private float temperature=0;
	private float humidity=0;
	
	public CurrentConditionsDisplay(Observable observable){
		observable.addObserver(this);						//只是把自己添加到了数组链表中																//要注册的是一个观察者或子类（布告板）
	}
	
	public void update (Observable obs, Object arg){
		if(obs instanceof WeatherData){
			WeatherData weatherData = (WeatherData) obs;
			temperature = weatherData.getTemperature();
			humidity = weatherData.getHumidity();
			display();
		}
	}
	
	public void display(){
		System.out.println("Current conditions: " + temperature + "F deprees and " + humidity + "% humidity" );
	}
	
}
