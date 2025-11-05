import java.util.ArrayList;
/**
 * 
 * 
 */
public class SharedData 
{
	/**
	 * array - ArrayList of numbers
	 * winArray - arrays that number was found in
	 * flag - indicator number found
	 * b - target number
	 */
	private ArrayList<Integer> array = new ArrayList<>();
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	/**This is the the class constructor setting array and target number data
	 * @param array - original array
	 * @param b - target number
	 */ 
	public SharedData(ArrayList<Integer> array, int b) {
		
		this.array = array;
		this.b = b;
	}

	/**
	 * getter
	 * @return win array
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	/**
	 * This is a setter to updated the winArray
	 * @param winArray
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/**This is a getter
	 * @return original array
	 */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	/**
	 * This is a getter
	 * @return target number
	 */
	public int getB() 
	{
		return b;
	}

	/**
	 * getter for flag
	 * @return Flag that indicates if number found
	 */
	public boolean getFlag() 
	{
		return flag; 
	}

	/**
	 * This is a setter
	 * @param flag -   Updating its value if target found
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
