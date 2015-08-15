package com.wjb.weather_interface;

import java.util.ArrayList;

public class Observable {
	private ArrayList<Observer> observers = new ArrayList<Observer>();	//��Ź۲��ߵ���������
	private boolean changed=false;
	
	public void addObserver(Observer o){					//ע��۲���
		observers.add(o);					
	}
	
	public void deleteObserver(Observer o){					//ɾ���۲���
		int i = observers.indexOf(o);
		if(i >= 0){
			observers.remove(i);
		}
	}
	
	public void setChanged(){
		changed=true;
	}
	
	public void notifyObservers(Object arg){		    	//���۲��߰���������Ϣ
		for(int i = 0; i < observers.size(); i++){
			Observer observer = (Observer)observers.get(i);
			observer.update(this, arg);                     //�ڹ۲����ж��壨������CurrentConditionsDisplay�У�
															//���ɹ۲��ߵĶ����͸��۲��ߣ��۲���ͨ���ö�������ȡ����
		}
	}
	
	public void notifyObservers(){							//������Ϣ���۲���
		notifyObservers(null);
	}
}
