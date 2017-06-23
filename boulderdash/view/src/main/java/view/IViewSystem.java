package view;
/**
 * interface to display
 * @author VALENTIN
 *
 */
public interface IViewSystem {
	
	public String SpritePath = "";
	
	public String MapPath = "";
	public String displayMessage(String message);
	public String displayMap(String message);
	public void closeAll();
	
}
