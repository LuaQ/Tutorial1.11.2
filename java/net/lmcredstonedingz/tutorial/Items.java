package net.lmcredstonedingz.tutorial;

import net.lmcredstonedingz.tutorial.item.ItemTutorial;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Items {

	public static ItemTutorial itemTutorial;
	public static String itemTutorialName = "tutorial_item";
	
	public static void init() {

		itemTutorial = new ItemTutorial();
		itemTutorial.setRegistryName(new ResourceLocation(Tutorial.RESOURCE_PREFIX + itemTutorialName));
		GameRegistry.register(itemTutorial);
	}
	
	@SideOnly(Side.CLIENT)
	public static void initClient(ItemModelMesher mesher) {

		ModelResourceLocation model = new ModelResourceLocation(Tutorial.RESOURCE_PREFIX + itemTutorialName);
		ModelLoader.registerItemVariants(itemTutorial, model);
		mesher.register(itemTutorial, 0, model);
	}
}
