package gay.balls.templatemod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import gay.balls.templatemod.TemplateMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item PALEFOX = registerItem("palefox", new Item(new FabricItemSettings()));
    public static final Item STRESSBALL = registerItem("stressball", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientsItemGroup(FabricItemGroupEntries entries) {
        entries.add(PALEFOX);
        entries.add(STRESSBALL);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TemplateMod.MOD_ID, name), item);
    }
    public static void registerItems() {
        TemplateMod.LOGGER.info("Gay Balls....");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientsItemGroup);
    }
}
