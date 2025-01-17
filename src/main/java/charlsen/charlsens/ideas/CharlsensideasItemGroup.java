package charlsen.charlsens.ideas;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.*;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class CharlsensideasItemGroup implements ModInitializer {
    
    public static final ItemGroup ITEM_GROUP_SECCHESTS = FabricItemGroupBuilder.build(
		new Identifier("charlsensideas", "secchests"),
		() -> new ItemStack(CharlsensideasItems.Secure_Chest_Module));

			public static final ItemGroup ITEM_GROUP_FOOD = FabricItemGroupBuilder.build(
			new Identifier("charlsensideas", "food"),
			() -> new ItemStack(CharlsensideasItems.CHIP));

			public static final ItemGroup ITEM_GROUP_ORES = FabricItemGroupBuilder.build(
			new Identifier("charlsensideas", "ores"),
			() -> new ItemStack(CharlsensideasItems.Bornite));

			public static final ItemGroup ITEM_GROUP_MUSIC = FabricItemGroupBuilder.build(
				new Identifier("charlsensideas", "music"),
				() -> new ItemStack(CharlsensIdeasClientModInitializer.MUSICPLAYER));

	        public static final ItemGroup ITEM_GROUP_NATURE = FabricItemGroupBuilder.build(
			new Identifier("charlsensideas", "nature"),
			() -> new ItemStack(CharlsensideasBlocks.MuddedDirt));

	        public static final ItemGroup ITEM_GROUP_BUILDING_BLOCKS = FabricItemGroupBuilder.build(
			new Identifier("charlsensideas", "building_blocks"),
			() -> new ItemStack(CharlsensideasBlocks.Emil_Block));

	        public static final ItemGroup ITEM_GROUP_TOOLS = FabricItemGroupBuilder.build(
			new Identifier("charlsensideas", "tools"),
			() -> new ItemStack(CharlsensideasTools.Bornite_Pickaxe));

	        @Override
			public void onInitialize() {
    }
}
