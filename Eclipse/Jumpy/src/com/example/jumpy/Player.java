package com.example.jumpy;

import java.util.ArrayList;

import android.content.ClipData.Item;

public class Player
{
	private int id;
	private String name;
	private int coins;
	
	private Inventory inventory;
	
	public Player(int id, String name, int coins, Inventory inventory)
	{
		this.id = id;
		this.name = name;
		this.coins = coins;
		this.inventory = inventory;
	}

	public int getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public int getCoins()
	{
		return coins;
	}

	public Inventory getInventory()
	{
		return inventory;
	}
	
	public void setInventory(Inventory inventory)
	{
		this.inventory = inventory;
	}
	
}
