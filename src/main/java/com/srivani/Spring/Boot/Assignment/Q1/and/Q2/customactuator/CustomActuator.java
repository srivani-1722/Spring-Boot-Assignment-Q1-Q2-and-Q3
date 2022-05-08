package com.srivani.Spring.Boot.Assignment.Q1.and.Q2.customactuator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;
@Component
public class CustomActuator implements HealthIndicator {

	@Override
	public Health health() {
		// TODO Auto-generated method stub
		return Health.down().build();
	}

}
