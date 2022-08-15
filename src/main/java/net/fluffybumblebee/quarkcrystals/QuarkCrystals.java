package net.fluffybumblebee.quarkcrystals;

import net.fabricmc.api.ModInitializer;
import net.fluffybumblebee.quarkcrystals.block.QCBlocks;
import net.fluffybumblebee.quarkcrystals.item.QCItems;

public class QuarkCrystals implements ModInitializer {

	@Override public void onInitialize() {
		QCItems.registerItems();
		QCBlocks.registerBlocks();
	}
}
