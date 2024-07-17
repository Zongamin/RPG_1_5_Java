package game;

public class Enemy 
{
	// Characteristics
	
	private String name;
	
	public double health;
	public double realHealth;
	public double mana;
	public double realMana;
	public double exp;
	public double realExp;
	public double capacity;
	public double realCapacity;
	
	// Attributes
	
	public double strength;
	public double intelligence;
	public double dexterity;
	public double endurance;
	public double luck;
	
	// Inventory
	
	public double gold;
	public double scrap;
	public double aluminum;
	public double copper;
	public double greenHerbs;
	public double blueHerbs;
	public double healthPoition;
	public double manaPotion;
	public double regenPoition;
	public double weapon;
	public double armor;
	
	// Statistic
	
	public boolean permaDeath = false;
	public double healing;
	public double burning;
	public double frozen;
	public double poisoned;
		
	// Methoden
	
	public void setName(String name) 
	{
		this.name = name;
		return;
	}
	
	public String getName() 
	{
		return this.name;
	}
	
}
