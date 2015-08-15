package com.wjb.weather_interface;

import java.util.ArrayList;

public class Observable {
	private ArrayList<Observer> observers = new ArrayList<Observer>();	//存放观察者的数组链表
	private boolean changed=false;
	
	public void addObserver(Observer o){					//注册观察者
		observers.add(o);					
	}
	
	public void deleteObserver(Observer o){					//删除观察者
		int i = observers.indexOf(o);
		if(i >= 0){
			observers.remove(i);
		}
	}
	
	public void setChanged(){
		changed=true;
	}
	
	public void notifyObservers(Object arg){		    	//给观察者挨个发布消息
		for(int i = 0; i < observers.size(); i++){
			Observer observer = (Observer)observers.get(i);
			observer.update(this, arg);                     //在观测者中定义（本例在CurrentConditionsDisplay中）
															//将可观察者的对象传送给观察者，观察者通过该对象自行取数据
		}
	}
	
	public void notifyObservers(){							//发布消息给观察者
		notifyObservers(null);
	}
}
