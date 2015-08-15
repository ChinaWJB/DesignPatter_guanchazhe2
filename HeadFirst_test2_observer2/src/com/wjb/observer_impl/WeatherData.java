package com.wjb.observer_impl;
import java.util.ArrayList;

import com.wjb.weather_interface.Observer;
import com.wjb.weather_interface.Observable;

/**
 * ע�ᡢɾ����֪ͨ�����ó���Observable����
 * pull�ӿɹ۲�������ȡ����
 * @author hp
 *
 */
public class WeatherData extends Observable{			

	private float temperature = 0;							//�¶�
	private float humidity = 0;								//ʪ��
	private float pressure = 0;								//ѹ��
	private boolean changed = false;
	
	public WeatherData(){ }
	
	public void measurementsChanged(){						//������վ�õ����¹۲�ֵʱ������֪ͨ�۲�ֵ
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();								//�������ݺ���ø������ݵķ�����
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
