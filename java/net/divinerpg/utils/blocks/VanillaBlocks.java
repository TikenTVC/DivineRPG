package net.divinerpg.utils.blocks;

import net.divinerpg.api.blocks.BlockMod;
import net.divinerpg.api.blocks.BlockModLeaves;
import net.divinerpg.api.blocks.BlockModLog;
import net.divinerpg.api.blocks.BlockModSpawner;
import net.divinerpg.api.blocks.BlockModTorch;
import net.divinerpg.api.blocks.BlockStatue;
import net.divinerpg.blocks.vanilla.BlockAcceleron;
import net.divinerpg.blocks.vanilla.BlockAltarOfCorruption;
import net.divinerpg.blocks.vanilla.BlockAyeracoBeam;
import net.divinerpg.blocks.vanilla.BlockBoneChest;
import net.divinerpg.blocks.vanilla.BlockDivineBricks;
import net.divinerpg.blocks.vanilla.BlockDivineTable;
import net.divinerpg.blocks.vanilla.BlockLamp1;
import net.divinerpg.blocks.vanilla.BlockLamp2;
import net.divinerpg.blocks.vanilla.BlockLightFence;
import net.divinerpg.blocks.vanilla.BlockMushroom;
import net.divinerpg.blocks.vanilla.BlockSteel;
import net.divinerpg.blocks.vanilla.BlockTar;
import net.divinerpg.blocks.vanilla.BlockTomato;
import net.divinerpg.blocks.vanilla.MobPumpkin;
import net.divinerpg.blocks.vanilla.VanillaBlock;
import net.divinerpg.client.render.block.model.ModelAncientStatue;
import net.divinerpg.client.render.block.model.ModelAyeracoStatue;
import net.divinerpg.client.render.block.model.ModelDensosStatue;
import net.divinerpg.client.render.block.model.ModelDexStatue;
import net.divinerpg.client.render.block.model.ModelDramixStatue;
import net.divinerpg.client.render.block.model.ModelKingStatue;
import net.divinerpg.client.render.block.model.ModelSoulStatue;
import net.divinerpg.client.render.block.model.ModelTwilightStatue;
import net.divinerpg.client.render.block.model.ModelVamacheronStatue;
import net.divinerpg.client.render.block.model.ModelWatcherStatue;
import net.divinerpg.utils.items.VanillaItemsOther;
import net.divinerpg.utils.material.EnumBlockType;
import net.divinerpg.utils.tabs.DivineRPGTabs;
import net.minecraft.block.Block;

public class VanillaBlocks {

	//Harvest Levels
	private static int WOOD_GOLD = 0, STONE = 1, IRON = 2, DIAMOND = 3;  
	
	public static Block rupeeOre;
	public static Block arlemiteOre;
	public static Block realmiteOre;
	public static Block bloodgemOre;
	public static Block netheriteOre;

	public static Block rupeeBlock;
	public static Block arlemiteBlock;
	public static Block realmiteBlock;
	public static Block bloodgemBlock;
	public static Block netheriteBlock;

	public static Block spiderPumpkin;
	public static Block enderPumpkin;
	public static Block creeperPumpkin;
	public static Block skeletonPumpkin;
	public static Block blazePumpkin;
	public static Block zombiePumpkin;
	public static Block frostPumpkin;
	public static Block cyclopsPumpkin;
	public static Block ghastPumpkin;
	public static Block glaconPumpkin;
	public static Block enderWatcherPumpkin;
	public static Block jungleSpiderPumpkin;
	public static Block hellSpiderPumpkin;
	
	public static Block aquaTorch;
	public static Block skeletonTorch;

	public static Block checker;
	public static Block rainbowWool;
	public static Block crate;
	public static Block blueStone;
	public static Block purpleStone;

	public static Block blueVane;
	public static Block cyanVane;
	public static Block purpleVane;
	public static Block redVane;
	public static Block yellowVane;

	public static Block divineRock;
	public static Block divineCraftingTable;
	public static Block acceleron;
	public static Block tar;

	public static Block dyeBlockWhite;
	public static Block dyeBlockBlack;
	public static Block dyeBlockBrown;
	public static Block dyeBlockRed;
	public static Block dyeBlockGreen;
	public static Block dyeBlockBlue;
	public static Block dyeBlockYellow;
	public static Block dyeBlockGray;
	public static Block dyeBlockLightGray;
	public static Block dyeBlockOrange;
	public static Block dyeBlockLightGreen;
	public static Block dyeBlockLightBlue;
	public static Block dyeBlockCyan;
	public static Block dyeBlockPink;
	public static Block dyeBlockPurple;
	public static Block dyeBlockMagenta;
	
	public static Block fancyWool;
	public static Block dirtBlock;
	public static Block soulSandBlock;
	public static Block sandBlock;
	
	public static Block steel;
	public static Block divineBricks;
	public static Block lamp1;
	public static Block lamp2;
	public static Block milkStone;
	
	public static Block lightFenceBlue;
    public static Block lightFenceRed;
    public static Block lightFenceGreen;
    public static Block lightFenceBlueOn;
    public static Block lightFenceRedOn;
    public static Block lightFenceGreenOn;
    
    public static Block ayeracoBeamBlue;
    public static Block ayeracoBeamGreen; 
    public static Block ayeracoBeamRed;
    public static Block ayeracoBeamYellow; 
    public static Block ayeracoBeamPurple; 

	public static BlockStatue KingStatue;
	public static BlockStatue AncientStatue;
	public static BlockStatue AyeracoStatue;
	public static BlockStatue TDemonStatue;
	public static BlockStatue VamacheronStatue;
	public static BlockStatue DensosStatue;
	public static BlockStatue DexStatue;
	public static BlockStatue DramixStatue;
	//public static BlockStatue ParasectaStatue;
	public static BlockStatue SoulFiendStatue;
	public static BlockStatue WatcherStatue;
	
	public static Block tomato;
	public static Block mushroom;
	
	public static Block eucalyptusWood;
	public static Block eucalyptusPlank;
	public static Block divineWood;
	public static Block divinePlank;
	public static Block divineLeaves;
	public static Block divineMossystone;
	public static Block divineMobSpawner;
	
	public static Block altarOfCorruption;
	public static Block boneChest;
	
	public static void init() {
		rupeeOre            = new VanillaBlock(EnumBlockType.ROCK, "rupeeOre", 3.0F, DIAMOND);
		arlemiteOre         = new VanillaBlock(EnumBlockType.ROCK, "arlemiteOre", 3.0F, DIAMOND);
		realmiteOre         = new VanillaBlock(EnumBlockType.ROCK, "realmiteOre", 3.0F, IRON);
		bloodgemOre         = new VanillaBlock(EnumBlockType.ROCK, "bloodgemOre", 3.0F, DIAMOND).setDropItem(VanillaItemsOther.bloodgem);
		netheriteOre        = new VanillaBlock(EnumBlockType.ROCK, "netheriteOre", 3.0F, DIAMOND).setDropItem(VanillaItemsOther.netheriteIngot);

		rupeeBlock          = new VanillaBlock(EnumBlockType.ROCK, "rupeeBlock", 3.0F, DIAMOND);
		arlemiteBlock       = new VanillaBlock(EnumBlockType.ROCK, "arlemiteBlock", 3.0F, DIAMOND);
		realmiteBlock       = new VanillaBlock(EnumBlockType.ROCK, "realmiteBlock", 3.0F, IRON);
		bloodgemBlock       = new VanillaBlock(EnumBlockType.ROCK, "bloodgemBlock", 3.0F, DIAMOND);
		netheriteBlock      = new VanillaBlock(EnumBlockType.ROCK, "netheriteBlock", 3.0F, DIAMOND);

		spiderPumpkin       = new MobPumpkin().setName("spiderPumpkin");
		enderPumpkin        = new MobPumpkin().setName("enderPumpkin");
		creeperPumpkin      = new MobPumpkin().setName("creeperPumpkin");
		skeletonPumpkin     = new MobPumpkin().setName("skeletonPumpkin");
		blazePumpkin        = new MobPumpkin().setName("blazePumpkin");
		zombiePumpkin       = new MobPumpkin().setName("zombiePumpkin");
		frostPumpkin        = new MobPumpkin().setName("frostPumpkin");
		cyclopsPumpkin      = new MobPumpkin().setName("cyclopsPumpkin");
		ghastPumpkin        = new MobPumpkin().setName("ghastPumpkin");
		glaconPumpkin       = new MobPumpkin().setName("glaconPumpkin");
		enderWatcherPumpkin = new MobPumpkin().setName("enderWatcherPumpkin");
		jungleSpiderPumpkin = new MobPumpkin().setName("jungleSpiderPumpkin");
		hellSpiderPumpkin   = new MobPumpkin().setName("hellSpiderPumpkin");
		
		aquaTorch			= new BlockModTorch("aquaTorch", "blueFlame");
		skeletonTorch		= new BlockModTorch("skeletonTorch", "blackFlame");

		checker             = new VanillaBlock(EnumBlockType.WOOL, "checker", 0.5F, WOOD_GOLD);
		rainbowWool         = new VanillaBlock(EnumBlockType.WOOL, "rainbowWool", 0.5F, WOOD_GOLD);
		crate               = new VanillaBlock(EnumBlockType.WOOD, "crate", 1.0F, WOOD_GOLD);
		blueStone           = new VanillaBlock(EnumBlockType.ROCK, "blueStone", 1.0F, WOOD_GOLD);
		purpleStone         = new VanillaBlock(EnumBlockType.ROCK, "purpleStone", 1.0F, WOOD_GOLD);

		blueVane            = new VanillaBlock(EnumBlockType.ROCK, "blueVane", 2.0F, STONE);
		cyanVane            = new VanillaBlock(EnumBlockType.ROCK, "cyanVane", 2.0F, STONE);
		purpleVane          = new VanillaBlock(EnumBlockType.ROCK, "purpleVane", 2.0F, STONE);
		redVane             = new VanillaBlock(EnumBlockType.ROCK, "redVane", 2.0F, STONE);
		yellowVane          = new VanillaBlock(EnumBlockType.ROCK, "yellowVane", 2.0F, STONE);

		divineRock          = new VanillaBlock(EnumBlockType.ROCK, "divineRock", 1.5F, STONE);
		divineCraftingTable = new BlockDivineTable();
		acceleron		  	  = new BlockAcceleron();
		tar 				  = new BlockTar();

		dyeBlockWhite 	  = new VanillaBlock(EnumBlockType.ROCK, "dyeBlock", 1.5F, WOOD_GOLD);
		dyeBlockBlack 	  = new VanillaBlock(EnumBlockType.ROCK, "blackDyeBlock", 1.5F, WOOD_GOLD);
		dyeBlockBrown 	  = new VanillaBlock(EnumBlockType.ROCK, "brownDyeBlock", 1.5F, WOOD_GOLD);
		dyeBlockRed   	  = new VanillaBlock(EnumBlockType.ROCK, "redDyeBlock", 1.5F, WOOD_GOLD);
		dyeBlockGreen 	  = new VanillaBlock(EnumBlockType.ROCK, "greenDyeBlock", 1.5F, WOOD_GOLD);
		dyeBlockBlue  	  = new VanillaBlock(EnumBlockType.ROCK, "blueDyeBlock", 1.5F, WOOD_GOLD);
		dyeBlockYellow	  = new VanillaBlock(EnumBlockType.ROCK, "yellowDyeBlock", 1.5F, WOOD_GOLD);
		dyeBlockGray  	  = new VanillaBlock(EnumBlockType.ROCK, "grayDyeBlock", 1.5F, WOOD_GOLD);
		dyeBlockLightGray   = new VanillaBlock(EnumBlockType.ROCK, "lightGrayDyeBlock", 1.5F, WOOD_GOLD);
		dyeBlockOrange   	  = new VanillaBlock(EnumBlockType.ROCK, "orangeDyeBlock", 1.5F, WOOD_GOLD);
		dyeBlockLightGreen  = new VanillaBlock(EnumBlockType.ROCK, "lightGreenDyeBlock", 1.5F, WOOD_GOLD);
		dyeBlockLightBlue   = new VanillaBlock(EnumBlockType.ROCK, "lightBlueDyeBlock", 1.5F, WOOD_GOLD);
		dyeBlockCyan   	  = new VanillaBlock(EnumBlockType.ROCK, "cyanDyeBlock", 1.5F, WOOD_GOLD);
		dyeBlockPink        = new VanillaBlock(EnumBlockType.ROCK, "pinkDyeBlock", 1.5F, WOOD_GOLD);
		dyeBlockPurple   	  = new VanillaBlock(EnumBlockType.ROCK, "purpleDyeBlock", 1.5F, WOOD_GOLD);
		dyeBlockMagenta     = new VanillaBlock(EnumBlockType.ROCK, "magentaDyeBlock", 1.5F, WOOD_GOLD);
		
		fancyWool 		  = new VanillaBlock(EnumBlockType.WOOL, "fancyWool", 0.5F, WOOD_GOLD);
		dirtBlock 		  = new VanillaBlock(EnumBlockType.DIRT, "dirtBlock", 1.5F, WOOD_GOLD);
		soulSandBlock       = new VanillaBlock(EnumBlockType.DIRT, "soulSandBlock", 1.5F, WOOD_GOLD);
		sandBlock 		  = new VanillaBlock(EnumBlockType.DIRT, "sandBlock", 1.5F, WOOD_GOLD);
		
		steel       		  = new BlockSteel();
		divineBricks        = new BlockDivineBricks();
		lamp1				  = new BlockLamp1();
		lamp2				  = new BlockLamp2();
		milkStone			  = new VanillaBlock(EnumBlockType.ROCK, "milkStone", 1.5F, WOOD_GOLD).setResistance(10F);
		
		lightFenceBlue 	  = new BlockLightFence(false, "blueFence", 0.5F);
	    lightFenceRed 	  = new BlockLightFence(false, "redFence", 0.5F);
	    lightFenceGreen 	  = new BlockLightFence(false, "greenFence", 0.5F);
	    lightFenceBlueOn 	  = new BlockLightFence(true, "blueFenceOn", 0.5F);
	    lightFenceRedOn 	  = new BlockLightFence(true, "redFenceOn", 0.5F);
	    lightFenceGreenOn   = new BlockLightFence(true, "greenFenceOn", 0.5F);
	    
	    ayeracoBeamBlue 	  = new BlockAyeracoBeam("ayeracoBeamBlue", "Blue");
	    ayeracoBeamGreen 	  = new BlockAyeracoBeam("ayeracoBeamGreen", "Green"); 
	    ayeracoBeamRed 	  = new BlockAyeracoBeam("ayeracoBeamRed", "Red");
	    ayeracoBeamYellow   = new BlockAyeracoBeam("ayeracoBeamYellow", "Yellow"); 
	    ayeracoBeamPurple   = new BlockAyeracoBeam("ayeracoBeamPurple", "Purple"); 

		KingStatue 	  = new BlockStatue("kingOfScorchersStatue", new ModelKingStatue());
		AncientStatue = new BlockStatue("ancientEntityStatue", new ModelAncientStatue());
		AyeracoStatue = new BlockStatue("ayeracoStatue", new ModelAyeracoStatue());
		TDemonStatue  = new BlockStatue("twilightDemonStatue", new ModelTwilightStatue());
		VamacheronStatue= new BlockStatue("vamacheronStatue", new ModelVamacheronStatue());
		DensosStatue  = new BlockStatue("densosStatue", new ModelDensosStatue());
		DexStatue 	  = new BlockStatue("dexStatue", new ModelDexStatue());
		DramixStatue  = new BlockStatue("dramixStatue", new ModelDramixStatue());
		//ParasectaStatue = new BlockStatue("parasectaStatue", new ModelParasecta());
		SoulFiendStatue = new BlockStatue("soulFiendStatue", new ModelSoulStatue());
		WatcherStatue = new BlockStatue("theWatcherStatue", new ModelWatcherStatue());
		
		tomato			  = new BlockTomato("tomatoPlant");
		mushroom			  = new BlockMushroom("mushroomPlant");
		
		eucalyptusWood	  = new BlockModLog("eucalyptusLog");
		eucalyptusPlank	  = new BlockMod(EnumBlockType.WOOD, "eucalyptusPlanks", true, DivineRPGTabs.blocks);
		divineWood	  	  = new BlockModLog("divineLog");
		divinePlank	  	  = new BlockMod(EnumBlockType.WOOD, "divinePlanks", true, DivineRPGTabs.blocks);
		divineLeaves	  	  = new BlockModLeaves("divineLeaves", 0.3F);
		divineMossystone	  = new BlockMod("divineMossystone", 0.5F);
		divineMobSpawner	  = new BlockModSpawner("divineSpawner", "null", "divineSpawner");
		
		altarOfCorruption	  = new BlockAltarOfCorruption("altarOfCorruption");
		boneChest			  = new BlockBoneChest("boneChest");
	}
}