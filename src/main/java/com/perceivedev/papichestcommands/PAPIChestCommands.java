package com.perceivedev.papichestcommands;

import org.bukkit.plugin.java.JavaPlugin;

import com.gmail.filoghost.chestcommands.api.Icon;

public class PAPIChestCommands extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Injected into `" + Icon.inject().getCanonicalName() + "`");
    }

}
