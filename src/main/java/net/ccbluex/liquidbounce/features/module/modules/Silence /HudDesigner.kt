/*
 * SilenceClient Hacked Client
 * A free open source mixin-based injection hacked client for Minecraft using Minecraft Forge by LiquidBounce.
 * https://github.com/ZNmRtClient/SilenceClient/
 */
package net.ccbluex.liquidbounce.features.module.modules.client

import net.ccbluex.liquidbounce.features.module.Module
import net.ccbluex.liquidbounce.features.module.ModuleCategory
import net.ccbluex.liquidbounce.ui.client.hud.designer.GuiHudDesigner

object HudDesigner : Module("HudDesigner", category = ModuleCategory.CLIENT, canEnable = false, defaultOn = false) {
    override fun onEnable() {
        mc.displayGuiScreen(GuiHudDesigner())
    }
}
