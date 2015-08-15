package com.wjb.observer_impl;
import java.util.ArrayList;

import com.wjb.weather_interface.Observer;
import com.wjb.weather_interface.Observable;

/**
 * 注册、删除、通知操作让超类Observable代劳
 * pull从可观察者上拉取数据
 * @author hp
 *
 */
public class WeatherData extends Observable{			

	private float temperature = 0;							//温度
	private float humidity = 0;								//湿度
	private float pressure = 0;								//压力
	private boolean changed = false;
	
	public WeatherData(){ }
	
	public void measurementsChanged(){						//当气象站得到更新观测值时，我们通知观测值
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();								//设置数据后调用更新数据的方法，
	}
		
	public float getTemperature(){
		return temperature;
	}
	
	public float getHumidity(){
		return humidity;
	}
	
	public float getPressure(){
		return pressure;
	}
}
