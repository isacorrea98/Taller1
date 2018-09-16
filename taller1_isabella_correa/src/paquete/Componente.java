package paquete;

import processing.core.PApplet;

public class Componente {
	
	protected PApplet app;
	protected int x;
	protected int y;
	protected int radio;
	protected int r;
	protected int g;
	protected int b;
	protected int estado;
	
	
	public Componente(PApplet app1, int x1, int y1) {
		
		app=app1;
		x=x1;
		y=y1;
		
	}
	
	public void setRadio (int radio1) {
		
		radio=radio1;
	}
	
	public void setR (int r1) {
		r=r1;
	}
	
	public void setG (int g1) {
		
		g=g1;
	}
	
public void strB (int b1) {
		
		b=b1;
	}

public void setEstado (int estado1) {
	
	estado=estado1;
}

public  int getRadio () {
	
	return radio;
}

public  int getR () {
	
	return r;
}
public  int getG () {
	
	return g;
}

public  int getB () {
	
	return b;
}
	
public  int getEstado () {
	
	return estado;
}

public PApplet getApp() {
	return app;
}

public void setApp(PApplet app) {
	this.app = app;
}

public int getX() {
	return x;
}

public void setX(int x) {
	this.x = x;
}

public int getY() {
	return y;
}

public void setY(int y) {
	this.y = y;
}

public void setB(int b) {
	this.b = b;
}
	

}
