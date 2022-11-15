package com.udemy.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	/*
	 * @Autowired
	 * 
	 * @Qualifier("randomFortuneService")
	 */
	FortuneService fortuneServ;

	/*
	 * @Autowired public TennisCoach(FortuneService fortune) { super(); this.fortune
	 * = fortune; }
	 */

	@Autowired
	public TennisCoach(@Qualifier("randomFortuneService")FortuneService fortune) {
		super();
		this.fortuneServ = fortune;
	}

	@Override
	public String getDailyWorkout() {

		return "practice backhand volley";
	}

	public FortuneService getFortuneServ() {
		return fortuneServ;
	}

	public void setFortuneServ(FortuneService fortuneServ) {
		this.fortuneServ = fortuneServ;
	}

	@Override
	public String getDailyFortune() {
		return fortuneServ.getFortune();
	}

}
