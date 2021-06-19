package com.asprsys.simulator.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asprsys.simulator.db.TemperatureSensorRepository;
import com.asprsys.simulator.model.TemperatureSensor;
import com.asprsys.simulator.service.SensorDataManager;

@Service
public class SensorDataManagerImpl implements SensorDataManager {
	@Autowired
	private TemperatureSensorRepository temperatureSensorRepository;
    private static SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
    private static final Logger LOGGER =
    	      LoggerFactory.getLogger(SensorDataManagerImpl.class);
	@Override
	public List<TemperatureSensor> findDataByName(String sensorName) {
		return temperatureSensorRepository.findAll();
	}
	@Override
	public TemperatureSensor findDataById(long id) {
		return temperatureSensorRepository.findById(id).get(); //since findById() is optional value we make a call to get()
	}
	@Override
	public TemperatureSensor saveData(String sensorName, String classification, String dateString, String value) {
		Date date = new Date();
		try {
			date = formatter.parse(dateString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			LOGGER.error(e.getMessage());
		}
		TemperatureSensor temperatureSensor = new TemperatureSensor(sensorName, classification, date, value);
		return temperatureSensorRepository.save(temperatureSensor); //since findById() is optional value we make a call to get()
	}	

}
