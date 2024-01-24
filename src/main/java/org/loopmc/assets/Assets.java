package org.loopmc.assets;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import net.ornithemc.osl.entrypoints.api.ModInitializer;

public class Assets implements ModInitializer {

    public static final Logger LOGGER = LogManager.getLogger("Loop Assets");

    @Override
    public void init() {
        LOGGER.info("Your assets are now not broken!");
    }
}
