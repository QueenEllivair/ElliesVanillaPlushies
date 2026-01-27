package dev.queenellivair.plushies;

import dev.queenellivair.plushies.item.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.impl.client.indigo.renderer.render.BlockRenderContext;
import net.minecraft.client.render.RenderLayer;

public class ElliesVanillaPlushiesClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BAT_PLUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BEE_PLUSH, RenderLayer.getCutout());
	}
}