package com.asprsys.simulator.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asprsys.simulator.model.TemperatureSensor;

public interface TemperatureSensorRepository extends JpaRepository<TemperatureSensor, Long> {

}
