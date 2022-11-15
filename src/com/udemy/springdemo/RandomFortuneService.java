package com.udemy.springdemo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		String[] data = { "Good luck", "Bad Luck", "No Luck to you" };
		int index = new Random().nextInt(data.length);
		return data[index];
	}

}
