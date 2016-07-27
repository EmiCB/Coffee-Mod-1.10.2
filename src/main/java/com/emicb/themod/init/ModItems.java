package com.emicb.themod.init;

import com.emicb.themod.item.ItemCoffee;
import com.emicb.themod.item.ItemTM;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems 
{
	public static final ItemTM coffee = new ItemCoffee();
	public static void init()
	{
		GameRegistry.registerItem(coffee, "coffee");
	}
}
