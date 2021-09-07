package com.ajith.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

	public boolean addsilly(){
		System.out.println(getClass()+" DOING STUFF : ADDING A MEMBERSHIP ACCOUNT ");
		return true;
	}
	public void gotosleep(){
		System.out.println(getClass()+" I'm Going to sleep now... ");
	}
}
