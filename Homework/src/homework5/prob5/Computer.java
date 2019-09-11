package homework5.prob5;

public class Computer implements Cloneable{
	private String manufacturer;
	private String processor;
	private int ramSize;
	private double processorSpeed;
	public Computer(String manufacturer, String processor, int ramSize, double processorSpeed)
	{
		this.manufacturer = manufacturer;
		this.processor = processor;
		this.ramSize = ramSize;
		this.processorSpeed = processorSpeed;
	}
	
	public int getRamSize()
	{
		return ramSize;
	}
	public void setRamSize(int ramSize)
	{
		this.ramSize = ramSize;
	}
	public double getProcessorSpeed()
	{
		return this.processorSpeed;
	}
	public double computerPower()
	{
		return this.ramSize * this.processorSpeed;
	}
	
	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("Manufacturer: ");
		sb.append(this.manufacturer + "\n");
		
		sb.append("Processor: ");
		sb.append(this.processor+ "\n");
		
		sb.append("Ram: ");
		sb.append(this.ramSize + "\n");
		
		sb.append("Speed: ");
		sb.append(this.processorSpeed+ "\n");
		return sb.toString();
	}
	
	@Override
	public boolean equals(Object c)
	{
		if(c == null) return false;
		if(c.getClass() != Computer.class) return false;
		Computer cmp = (Computer)c;
		return this.manufacturer.equalsIgnoreCase(cmp.manufacturer) && this.processor.equalsIgnoreCase(cmp.processor) 
				&& this.processorSpeed == cmp.processorSpeed && this.ramSize == cmp.ramSize;
	}
	@Override
	public int hashCode()
	{
		int result = 17;
		result = 31 * result + this.manufacturer.hashCode();
		result = 31 * result + this.processor.hashCode();
		long l = Double.doubleToLongBits(this.processorSpeed);
		result = 31 * result + (int)(l^(l>>>32));
		result = 31 * result + ramSize;
		return result;
	}
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return (Object)super.clone();
	}
}
