/*
 * SilenceClient Hacked Client
 * A free open source mixin-based injection hacked client for Minecraft using Minecraft Forge by LiquidBounce.
 * https://github.com/ZNmRtClient/SilenceClient/
 */
package net.ccbluex.liquidbounce.features.module.modules.misc

import net.ccbluex.liquidbounce.features.module.Module
import net.ccbluex.liquidbounce.features.module.ModuleCategory
import net.ccbluex.liquidbounce.event.EventTarget
import net.ccbluex.liquidbounce.event.WorldEvent

object MemoryFix : Module(name = "MemoryFix",  category = ModuleCategory.MISC, defaultOn = false) {
    override fun onEnable() {
        Runtime.getRuntime().gc()
    }
    
    @EventTarget
    fun onWorld(event: WorldEvent) {
        Runtime.getRuntime().gc()
    }
}
