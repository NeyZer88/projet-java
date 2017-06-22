package model;

import java.sql.SQLException;

import model.dao.DataDAO;
import model.dao.LevelsDAO;
import model.element.IElement;
import model.element.motionless.MotionLessElement;
import model.element.motionless.MotionlessElementFactory;

public class Map {
	
	private IElement[][]OnTheMap;
	private int width;
	private int height;
	private int view;
	private int idLevel;
	private int line;

	String elementList;



	
	public int show(int yStart) throws SQLException {
        width = DataDAO.getWidthMap(line);
        height = DataDAO.getHeightMap(line);
      
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
	public void obtainMap() throws SQLException {
		int x;
		int y;
		        for(y = 0; y < height ; y++){

		           for(x = 0; x < width ; x++){
		                this.setOnTheMapXY(MotionlessElementFactory.getFromFileSprite(LevelsDAO.getElement(idLevel, x, y)), x, y);
		            }

		        }
	
		}

	public IElement getOnTheMapXY(final int x, final int y){
		return this.OnTheMap[x][y];
	}
	
	public void setOnTheMapXY(MotionLessElement motionLessElement, int x, int y){
		this.OnTheMap[x][y] = (IElement) motionLessElement;
	}

}
