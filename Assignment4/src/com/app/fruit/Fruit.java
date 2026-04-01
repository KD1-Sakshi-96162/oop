package com.app.fruit;

public abstract class Fruit {
String color;
double weight;
String name;
boolean isFresh;
public Fruit() {
	
}
public Fruit(String color, double weight, String name) {
	this.color = color;
	this.weight = weight;
	this.name = name;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public double getWeight() {
	return weight;
}
public void setWeight(double weight) {
	weight = weight;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public boolean isFresh() {
	return isFresh;
}
public void setFresh(boolean isFresh) {
	this.isFresh = isFresh;
}

@Override
public String toString() {
	return "Fruit [color=" + color + ", weight=" + weight + ", name=" + name + ", isFresh=" + isFresh + "]";
}
public abstract String taste();

}
