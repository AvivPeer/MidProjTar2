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
	
	/**
	 * This is the the class constructor setting array and target number data
	 * @param array
	 * @param b
	 */
	public SharedData(ArrayList<Integer> array, int b) {
		
		this.array = array;
		this.b = b;
	}

	/**
	 * this function returns the win array
	 * @return
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

	/**This getter returns the main array
	 * @return
	 */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	/**
	 * returns the target number
	 * @return
	 */
	public int getB() 
	{
		return b;
	}

	/**
	 * getter for flag
	 * returns the flag that indicates if number found
	 * @return
	 */
	public boolean getFlag() 
	{
		return flag; 
	}

	/**
	 * setter for flag updating its value if target found
	 * @param flag
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
