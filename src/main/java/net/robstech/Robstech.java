package net.robstech;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Robstech implements ModInitializer {

    public static final Block TIN_ORE = new Block(FabricBlockSettings.of(Material.METAL).hardness(4.0f));
    public static final Item TIN_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    
    @Override
    public void onInitialize() {
        Registry.register(Registry.BLOCK, new Identifier("robstech", "tin_ore"), TIN_ORE);
        Registry.register(Registry.ITEM, new Identifier("robstech", "tin_ore"), new BlockItem(TIN_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("robstech", "tin_ingot"), TIN_INGOT);
    }

}