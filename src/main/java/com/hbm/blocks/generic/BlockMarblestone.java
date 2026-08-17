package com.hbm.blocks.generic;

import com.hbm.blocks.BlockEnumMulti;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import java.util.Locale;

public class BlockMarblestone extends BlockEnumMulti {

    public BlockMarblestone(Material mat, Class<? extends Enum> theEnum, boolean multiName, boolean multiTexture) {
        super(mat, theEnum, multiName, multiTexture);
    }
@Override
public String getTextureMultiName(Enum num) {
    return this.getTextureName() + "." + num.name().toLowerCase(Locale.US);
}
}