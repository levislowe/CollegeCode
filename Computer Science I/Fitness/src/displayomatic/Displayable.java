package displayomatic;

import java.awt.*;
import java.util.*;

public interface Displayable {
	public int getTotalCalories();
	public int getHealthLevel();
	public int getNumberOfItems();
	public ArrayList<Color> getColorList();
	public ArrayList<String> getNameList();
}
