package gay.balls.templatemod;

import gay.balls.templatemod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TemplateMod implements ModInitializer {
	public static final String MOD_ID = "templatemod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");

		ModItems.registerItems();
	}
}