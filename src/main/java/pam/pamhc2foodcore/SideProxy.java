package pam.pamhc2foodcore;

import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import pam.pamhc2foodcore.init.ItemRegistry;

public class SideProxy {
	SideProxy() {
		//ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, Config.CONFIG, "pamhc2foodcore.toml");
		FMLJavaModLoadingContext.get().getModEventBus().addListener(SideProxy::commonSetup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(SideProxy::enqueueIMC);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(SideProxy::processIMC);
		
		FMLJavaModLoadingContext.get().getModEventBus().addGenericListener(Item.class, ItemRegistry::registerAll);
	
		//Config.loadConfig(Config.CONFIG, FMLPaths.CONFIGDIR.get().resolve("pamhc2foodcore.toml").toString());

		MinecraftForge.EVENT_BUS.addListener(SideProxy::serverStarting);
	}

	
	private static void commonSetup(FMLCommonSetupEvent event) {
		Pamhc2foodcore.LOGGER.debug("common setup");
		
	}

	private static void enqueueIMC(final InterModEnqueueEvent event) {
	}

	private static void processIMC(final InterModProcessEvent event) {
	}

	private static void serverStarting(FMLServerStartingEvent event) {
	}

	static class Client extends SideProxy {
		Client() {
			FMLJavaModLoadingContext.get().getModEventBus().addListener(Client::clientSetup);
		}

		private static void clientSetup(FMLClientSetupEvent event) {

		}
	}

	static class Server extends SideProxy {
		Server() {
			FMLJavaModLoadingContext.get().getModEventBus().addListener(Server::serverSetup);

		}

		private static void serverSetup(FMLDedicatedServerSetupEvent event) {

		}
	}

}