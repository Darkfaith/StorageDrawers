package com.jaquadro.minecraft.storagedrawers.config;

import com.jaquadro.minecraft.storagedrawers.StorageDrawers;
import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.IConfigElement;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;

import java.util.ArrayList;
import java.util.List;

public class ModConfigGui extends GuiConfig
{
    public ModConfigGui (GuiScreen parent) {
        super(parent, getConfigElements(), StorageDrawers.MOD_ID, false, false, "Storage Drawers Configuration");
    }

    private static List<IConfigElement> getConfigElements () {
        List<IConfigElement> list = new ArrayList<IConfigElement>();

        for (ConfigManager.ConfigSection section : StorageDrawers.config.sections)
            list.add(new ConfigElement(section.getCategory()));

        return list;
    }

}
