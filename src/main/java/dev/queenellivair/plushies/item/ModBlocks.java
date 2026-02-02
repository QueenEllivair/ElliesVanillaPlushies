package dev.queenellivair.plushies.item;

import dev.queenellivair.plushies.ElliesVanillaPlushies;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.*;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

@SuppressWarnings("unused")
public class ModBlocks {


    public ModBlocks(AbstractBlock.Settings settings) {
    }

    public static Block register(Block block, String name, boolean shouldRegisterItem) {
        // Register the block and its item.
        Identifier id = new Identifier(ElliesVanillaPlushies.MOD_ID, name);

        // Sometimes, you may not want to register an item for the block.
        // Eg: if it's a technical block like `minecraft:air` or `minecraft:end_gateway`
        if (shouldRegisterItem) {
            BlockItem blockItem = new BlockItem(block, new Item.Settings());
            Registry.register(Registries.ITEM, id, blockItem);
        }

        return Registry.register(Registries.BLOCK, id, block);
    }


    public static final RegistryKey<ItemGroup> CUSTOM_ITEM_GROUP_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), new Identifier(ElliesVanillaPlushies.MOD_ID, "item_group"));
    public static final ItemGroup CUSTOM_ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModBlocks.FOX_PLUSH))
            .displayName(Text.translatable("itemGroup.plushies"))
            .build();

    public static final Block FOX_PLUSH = register(
            new Plushie(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOL).nonOpaque()),
            "fox_plush",
            true
    );

    public static final Block BEE_PLUSH = register(
            new Plushie(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOL).nonOpaque()),
            "bee_plush",
            true
    );

    public static final Block BAT_PLUSH = register(
            new Plushie(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOL).nonOpaque()),
            "bat_plush",
            true
    );

    public static void initialize() {

        }
    }

