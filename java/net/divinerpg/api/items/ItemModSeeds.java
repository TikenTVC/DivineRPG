package net.divinerpg.api.items;

import net.divinerpg.Reference;
import net.divinerpg.helper.config.ConfigurationHelper;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.divinerpg.helper.utils.LangRegistry;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemModSeeds extends ItemSeeds {
	
	public ItemModSeeds(String name, Block block) {
		super(block, Blocks.farmland);
		setUnlocalizedName(name);
		setTextureName(Reference.PREFIX + name);
		setCreativeTab(DivineRPGTabs.utility);
		GameRegistry.registerItem(this, name);
		LangRegistry.addItem(this);
		if(ConfigurationHelper.showItemsBetter) setFull3D();
	}
}