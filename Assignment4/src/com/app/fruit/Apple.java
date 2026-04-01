package com.app.fruit;

public class Apple extends Fruit{
public Apple(String color,double weight,String name) {
	super(color,weight,name);
}
@Override
public String taste() {
	return "sweet and sour";
}
}

