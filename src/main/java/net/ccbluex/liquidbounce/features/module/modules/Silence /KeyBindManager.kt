/*
 * SilenceClient Hacked Client
 * A free open source mixin-based injection hacked client for Minecraft using Minecraft Forge by LiquidBounce.
 * https://github.com/ZNmRtClient/SilenceClient/
 */
package net.ccbluex.liquidbounce.features.module.modules.client

import net.ccbluex.liquidbounce.FDPClient
import net.ccbluex.liquidbounce.features.module.Module
import net.ccbluex.liquidbounce.features.module.ModuleCategory
import org.lwjgl.input.Keyboard

object KeyBindManager : Module("KeyBindManager", category = ModuleCategory.CLIENT, keyBind = Keyboard.KEY_RMENU, canEnable = false, defaultOn = false) {
    override fun onEnable() {
        mc.displayGuiScreen(SilenceClient.keyBindManager)
    }
}
