package com.emicb.themod;

import com.emicb.themod.resource.Resource;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = Resource.MOD_ID, name = Resource.MOD_NAME, version = Resource.VERSION)

public class TheMod 
{
	@Mod.Instance("TheMod")
	public static TheMod instance;
	
	@Mod.EventHandler
	public void PreInit(FMLPreInitializationEvent event)
	{
		
	}
	
	@Mod.EventHandler
	public void Init(FMLInitializationEvent event)
	{
		
	}
	
	@Mod.EventHandler
	public void PostInit(FMLPostInitializationEvent event)
	{
		
	}
}
