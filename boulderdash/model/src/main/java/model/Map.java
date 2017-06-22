package model;

import javax.lang.model.element.Element;
import model.dao.LevelsDAO;

public class Map {
	private int IElement[][];
	private int width;
	private int height;
	private int view;
	private int quota;
	String elementList;



	
	public int show(int yStart) {
		elementList = LevelsDAO.getElement(idLevel, line, collumn);
		return yStart;
		
	}
	
	public int getWidth() { 
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getView() {
		return view;
	}
	public void setView(int view) {
		this.view = view;
	}
	public int getQuota() {
		return quota;
	}
	public void setQuota(int quota) {
		this.quota = quota;
	}
	public Element getOnTheMapXY(int x, int y){
		return getOnTheMapXY(0, 0);
	}
	public void setOnTheMapXY(int x, int y){
		this.setOnTheMapXY(x, y);
	}

}

