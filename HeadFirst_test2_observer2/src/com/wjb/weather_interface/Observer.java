package com.wjb.weather_interface;

public interface Observer {
	public void update(Observable obs, Object arg);//观察者更新消息
}
