
public class Species extends Genus {
	private String speciesName;
	private String commonName;
	private String sound;
	
	public Species(String gName, String sName, String cName, String noise)
	{
		super(gName);
		speciesName=sName;
		commonName=cName;
		sound=noise;
	}
	
	public String toString()
	{
		return super.toString()+" "+speciesName+" also known as "+commonName+" makes the sound "+getSound()+".";
	}
	
	public String getSound()
	{
		return sound;
	}
}
