package game;

import java.util.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main
{
	public static void main(String[] args) 
	{
		short roundManager = 0;
		short playerNumber = 1;
		short enemyNumber = 0;
		
		Player[] player = new Player[4];
		
		player[0].setName("Max Mustermann");
		player[1].setName("Maxine Mustermann");
		player[2].setName("Napalm Norbert");
		player[3].setName("Horror Helga");
		
		Enemy[] enemy = new Enemy[5];
		
		enemy[0].setName("Zero 01");
		enemy[1].setName("Zero 02");
		enemy[2].setName("Zero 03");
		enemy[3].setName("Zero 04");
		enemy[4].setName("Zero 05");
		
		System sys = new System();
		
		for (; enemyNumber < 5; enemyNumber++) 
		{
			enemy[enemyNumber].permaDeath = true;
		}
		
		for (short index = 0; index < 4; index++) 
		{
			player[index].initializePlayer();
		}
		
	}
}
