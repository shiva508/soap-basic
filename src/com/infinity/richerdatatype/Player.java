package com.infinity.richerdatatype;

public class Player {
private String name;
private String nikename;
public Player(String name, String nikename) {
	super();
	this.name = name;
	this.nikename = nikename;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getNikename() {
	return nikename;
}
public void setNikename(String nikename) {
	this.nikename = nikename;
}
@Override
public String toString() {
	return "Player [name=" + name + ", nikename=" + nikename + "]";
}

}
