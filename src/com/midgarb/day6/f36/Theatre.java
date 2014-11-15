package com.midgarb.day6.f36;

public class Theatre {
public static Actor actor;
public static void main(String[] args){	
Theatre t = new Theatre();
 actor = new HappyActor();
 actor.act();
 t.intermission();
 actor.act();
 
}

public void intermission(){
	getSalary();
}
public void getSalary(){
	actor =new SadActor();
}
}
