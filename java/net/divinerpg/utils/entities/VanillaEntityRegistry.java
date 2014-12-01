package net.divinerpg.utils.entities;

import net.divinerpg.entities.vanilla.EntityAncientEntity;
import net.divinerpg.entities.vanilla.EntityAridWarrior;
import net.divinerpg.entities.vanilla.EntityAyeracoBlue;
import net.divinerpg.entities.vanilla.EntityAyeracoGreen;
import net.divinerpg.entities.vanilla.EntityAyeracoPurple;
import net.divinerpg.entities.vanilla.EntityAyeracoRed;
import net.divinerpg.entities.vanilla.EntityAyeracoYellow;
import net.divinerpg.entities.vanilla.EntityBabyCrab;
import net.divinerpg.entities.vanilla.EntityCaveCrawler;
import net.divinerpg.entities.vanilla.EntityCaveclops;
import net.divinerpg.entities.vanilla.EntityEnthralledDramcryx;
import net.divinerpg.entities.vanilla.EntityCrab;
import net.divinerpg.entities.vanilla.EntityCyclops;
import net.divinerpg.entities.vanilla.EntityDesertCrawler;
import net.divinerpg.entities.vanilla.EntityEnderSpider;
import net.divinerpg.entities.vanilla.EntityEnderTriplets;
import net.divinerpg.entities.vanilla.EntityEnderWatcher;
import net.divinerpg.entities.vanilla.EntityFrost;
import net.divinerpg.entities.vanilla.EntityGlacon;
import net.divinerpg.entities.vanilla.EntityHellPig;
import net.divinerpg.entities.vanilla.EntityHellSpider;
import net.divinerpg.entities.vanilla.EntityIceMan;
import net.divinerpg.entities.vanilla.EntityJackOMan;
import net.divinerpg.entities.vanilla.EntityJungleBat;
import net.divinerpg.entities.vanilla.EntityJungleDramcryx;
import net.divinerpg.entities.vanilla.EntityKingCrab;
import net.divinerpg.entities.vanilla.EntityKingOfScorchers;
import net.divinerpg.entities.vanilla.EntityMiner;
import net.divinerpg.entities.vanilla.EntityNetherWatcher;
import net.divinerpg.entities.vanilla.EntityRainbour;
import net.divinerpg.entities.vanilla.EntityRotatick;
import net.divinerpg.entities.vanilla.EntityScorcher;
import net.divinerpg.entities.vanilla.EntityShark;
import net.divinerpg.entities.vanilla.EntityTheEye;
import net.divinerpg.entities.vanilla.EntityWhale;
import net.divinerpg.entities.vanilla.EntityWildFire;
import net.divinerpg.entities.vanilla.projectile.EntityBowheadAnchor;
import net.divinerpg.entities.vanilla.projectile.EntityCaveRock;
import net.divinerpg.entities.vanilla.projectile.EntityCorruptedBullet;
import net.divinerpg.entities.vanilla.projectile.EntityCrabAnchor;
import net.divinerpg.entities.vanilla.projectile.EntityCyclopsianStaff;
import net.divinerpg.entities.vanilla.projectile.EntityDeath;
import net.divinerpg.entities.vanilla.projectile.EntityDivineArrow;
import net.divinerpg.entities.vanilla.projectile.EntityEnderTripletFireball;
import net.divinerpg.entities.vanilla.projectile.EntityFrostShot;
import net.divinerpg.entities.vanilla.projectile.EntityGhastCannon;
import net.divinerpg.entities.vanilla.projectile.EntityGoldenFury;
import net.divinerpg.entities.vanilla.projectile.EntityKingOfScorchersShot;
import net.divinerpg.entities.vanilla.projectile.EntityMaelstorm;
import net.divinerpg.entities.vanilla.projectile.EntityModSnowball;
import net.divinerpg.entities.vanilla.projectile.EntityScorcherShot;
import net.divinerpg.entities.vanilla.projectile.EntityScythe;
import net.divinerpg.entities.vanilla.projectile.EntitySharkAnchor;
import net.divinerpg.entities.vanilla.projectile.EntityShuriken;
import net.divinerpg.entities.vanilla.projectile.EntityVileStorm;
import net.divinerpg.entities.vanilla.projectile.EntityWatcherShot;
import net.divinerpg.utils.Util;

public class VanillaEntityRegistry {

	public static void init(){
		Util.registerProjectile(EntityScythe.class, "Scythe");
		Util.registerProjectile(EntityShuriken.class, "Shuriken");
		Util.registerProjectile(EntityVileStorm.class, "VileStorm");
		Util.registerProjectile(EntityModSnowball.class, "Snowball");
		Util.registerProjectile(EntityDeath.class, "Death");
		Util.registerProjectile(EntityCyclopsianStaff.class, "CyclopsianStaff");
		Util.registerProjectile(EntityKingOfScorchersShot.class, "KOSShot");
		Util.registerProjectile(EntityCaveRock.class, "CaveRock");
		Util.registerProjectile(EntityWatcherShot.class, "WatcherShot");
		Util.registerProjectile(EntityMaelstorm.class, "Maelstorm");
		Util.registerProjectile(EntityFrostShot.class, "FrostShot");
		Util.registerProjectile(EntityScorcherShot.class, "ScorcherShot");
		Util.registerProjectile(EntityCrabAnchor.class, "CrabAnchor");
		Util.registerProjectile(EntitySharkAnchor.class, "SharkAnchor");
		Util.registerProjectile(EntityBowheadAnchor.class, "BowheadAnchor");
		Util.registerProjectile(EntityGoldenFury.class, "GoldenFury");
		Util.registerProjectile(EntityCorruptedBullet.class, "CorruptedBullet");
		Util.registerProjectile(EntityGhastCannon.class, "GhastCannon");
		Util.registerProjectile(EntityDivineArrow.class, "DivineArrow");
		Util.registerProjectile(EntityEnderTripletFireball.class, "TripletFireball");

		Util.registerDivineRPGMob(EntityEnderWatcher.class, "EnderWatcher");		
		Util.registerDivineRPGMob(EntityCrab.class, "Crab");
		Util.registerDivineRPGMob(EntityBabyCrab.class, "BabyCrab");
		Util.registerDivineRPGMob(EntityMiner.class, "UndeadMiner");
		Util.registerDivineRPGMob(EntityKingCrab.class, "KingCrab");
		Util.registerDivineRPGMob(EntityDesertCrawler.class, "DesertCrawler");
		Util.registerDivineRPGMob(EntityCaveCrawler.class, "CaveCrawler");
		Util.registerDivineRPGMob(EntityJungleDramcryx.class, "JungleDramcryx");
		Util.registerDivineRPGMob(EntityCyclops.class, "Cyclops");
		Util.registerDivineRPGMob(EntityCaveclops.class, "Caveclops");
		Util.registerDivineRPGMob(EntityAncientEntity.class, "AncientEntity");
		Util.registerDivineRPGMob(EntityWhale.class, "Whale");
		Util.registerDivineRPGMob(EntityHellSpider.class, "HellSpider");
		Util.registerDivineRPGMob(EntityScorcher.class, "Scorcher");
		Util.registerDivineRPGMob(EntityEnderSpider.class, "EnderSpider");
		Util.registerDivineRPGMob(EntityEnderTriplets.class, "EnderTriplets");
		Util.registerDivineRPGMob(EntityAridWarrior.class, "AridWarrior");
		Util.registerDivineRPGMob(EntityAyeracoBlue.class, "AyeracoBlue");
		Util.registerDivineRPGMob(EntityAyeracoGreen.class, "AyeracoGreen");
		Util.registerDivineRPGMob(EntityAyeracoPurple.class, "AyeracoPurple");
		Util.registerDivineRPGMob(EntityAyeracoRed.class, "AyeracoRed");
		Util.registerDivineRPGMob(EntityAyeracoYellow.class, "AyeracoYellow");
		Util.registerDivineRPGMob(EntityEnthralledDramcryx.class, "EnthralledDramcryx");
		Util.registerDivineRPGMob(EntityTheEye.class, "TheEye");
		Util.registerDivineRPGMob(EntityFrost.class, "Frost");
		Util.registerDivineRPGMob(EntityIceMan.class, "IceMan");
		Util.registerDivineRPGMob(EntityKingOfScorchers.class, "KingOfScorchers");
		Util.registerDivineRPGMob(EntityRainbour.class, "Rainbour");
		Util.registerDivineRPGMob(EntityRotatick.class, "Rotatick");
		Util.registerDivineRPGMob(EntityShark.class, "Shark");
		Util.registerDivineRPGMob(EntityNetherWatcher.class, "TheWatcher");
		Util.registerDivineRPGMob(EntityWildFire.class, "WildFire");
		Util.registerDivineRPGMob(EntityGlacon.class, "Glacon");
		Util.registerDivineRPGMob(EntityJackOMan.class, "JackOMan");
		Util.registerDivineRPGMob(EntityJungleBat.class, "JungleBat");
		Util.registerDivineRPGMob(EntityHellPig.class, "HellPig");

	}
}
