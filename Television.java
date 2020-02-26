
public class Television {
	final String MANUFACTURER; //brand of television
	final int SCREEN_SIZE;  //size of television
	int volume = 0, channel = 0;  //volume and channels
	boolean powerOn;  //power turn on and off
	
	
	//pass data manufacturer and size of television
	//initializing the power is off, volume is 20, and channel sets to 2
	public Television(String manufacturer, int size)
	{
	   this.MANUFACTURER = manufacturer;
	   this.SCREEN_SIZE = size;
	   powerOn = false;
	   volume = 20;
	   channel = 2;
	}
	/**
	 * the volume is 20 
	 * @param volume
	 */
	public void setVolume(int volume) 
	{
		this.volume = volume;
	}
	/**
	 * get the volume of television
	 * @return volume
	 */
	public int getVolume() 
	{
		return volume;
	}

	/**
	 * change the channel of television
	 * @param channel
	 */
	public void setChannel(int channel) 
	{
		this.channel = channel;	
	}
	/**
	 * get the channel of television
	 * @return channel
	 */
	public int getChannel() 
	{
		return channel;
	}

	
    /**
     * get the brand of television
     * @return MANUFACTURER
     */
	public String getMANUFACTURER() 
	{
		return MANUFACTURER;
	}
    /**
     * get the size of television
     * @return SCREEN_SIZE
     */
	public int getSCREEN_SIZE() 
	{
		return SCREEN_SIZE;
	}
    
	/**
	 * turn on the television
	 */
    public void power()
    {
    	powerOn = !powerOn;
    }
    /**
     * increasing the volume by 1
     */
    public void increaseVolume()
    {
    	volume += 1;
    }
    /**
     * decreasing the volume by 1
     */
	public void decreaseVolume()
	{
		volume -= 1;
	}
	

}
