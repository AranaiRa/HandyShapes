package com.aranaira.handyshapes;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("handyshapes")
public class HandyShapes {
  public static final Logger LOG = LogManager.getLogger();
  public static final String MODID = "handyshapes";

  public HandyShapes() {
    IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
  }
}
