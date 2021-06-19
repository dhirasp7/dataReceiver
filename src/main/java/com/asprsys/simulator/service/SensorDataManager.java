package com.asprsys.simulator.service;

import java.util.Date;
import java.util.List;

import com.asprsys.simulator.model.TemperatureSensor;

public interface SensorDataManager {

	public List<TemperatureSensor> findDataByName(String sensorName);

	public TemperatureSensor findDataById(long id);

	public TemperatureSensor saveData(String sensorName, String classification, String dateString, String value);

	/*
	 * find sensor data with id
	 * find senor data for name
	 * find sensor data by classification
	 * save sensor data
	 * 
	 */

}
