package game;

import java.util.*;

public class Player 
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
	public Vector<Double> weapon;
	public Vector<Double> armor;
	
	// Statistic
	
	public boolean roomCleared;
	public boolean specialRoom;
	public boolean permaDeath;
	public double healing;
	public double burning;
	public double frozen;
	public double poisoned;
	public double rooms;
	public double monsters;
	public double bosses;
	
	// Konstruktor
	
	public void initializePlayer()
	{
		
		// Attributes
		
		this.strength = 5;
		this.intelligence = 5;
		this.dexterity = 5;
		this.endurance = 5;
		this.luck = 5;
		this.exp = 1000;
		this.realExp = 0;
		this.capacity = 0;
		this.realCapacity = this.capacity;
		
		// Inventory
		
		this.gold = 10;
		this.scrap = 0;
		this.aluminum = 0;
		this.copper = 0;
		this.greenHerbs = 0;
		this.blueHerbs = 0;
		this.healthPoition = 0;
		this.manaPotion = 0;
		this.regenPoition = 0;
		
		// Statistic
		
		this.roomCleared = false;
		this.specialRoom = false;
		this.permaDeath = false;
		this.healing = 0;
		this.burning = 0;
		this.frozen = 0;
		this.poisoned = 0;
		this.rooms = 0;
		this.monsters = 0;
		this.bosses = 0;
		
		charCalc();
	}
	
	public void charCalc() 
	{
		this.health = (this.strength * 15) + (this.endurance * 5);
		this.realHealth = this.health;
		this.mana = (this.intelligence * 7) + (this.endurance * 3);
		this.realMana = this.mana;
		return;
	}
	
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
