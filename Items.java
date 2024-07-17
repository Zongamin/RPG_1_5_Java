package game;

public class Items 
{
	private double weight;
		
	public double getWeight(double weight, double counter) 
	{
		this.weight = weight;
		
		double realWeight = this.weight * counter;
		return realWeight;
	}
}

class HealthPoition
{
	private double weight = 0.25;
}
