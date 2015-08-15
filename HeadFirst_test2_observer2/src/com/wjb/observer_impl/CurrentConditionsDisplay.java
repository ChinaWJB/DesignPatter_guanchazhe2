package com.wjb.observer_impl;
import com.wjb.weather_interface.*;

/**
 * �˲�������WeatherData������ʾ��ǰ�۲�ֵ
 * Ŀǰ״���Ĳ��棨����һ�����棬��һ���۲��ߣ�
 * @author hp
 * 
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement{
	private float temperature=0;
	private float humidity=0;
	
	public CurrentConditionsDisplay(Observable observable){
		observable.addObserver(this);						//ֻ�ǰ��Լ���ӵ�������������																//Ҫע�����һ���۲��߻����ࣨ����壩
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
