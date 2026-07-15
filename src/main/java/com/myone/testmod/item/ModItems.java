package com.myone.testmod.item;

import com.myone.testmod.Testmod;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Testmod.MODID);

    public static final DeferredItem<SwordItem> BISHMUTH = ITEMS.register("bismuth_sword",
            () -> new SwordItem(Tiers.GOLD, new Item.Properties().attributes(
                    SwordItem.createAttributes(Tiers.GOLD, 36, -2.4f)
            )));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }
}
