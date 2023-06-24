/*
 * SilenceClient Hacked Client
 * A free open source mixin-based injection hacked client for Minecraft using Minecraft Forge by LiquidBounce.
 * https://github.com/ZNmRtClient/SilenceClient/
 */

package net.ccbluex.liquidbounce.features.special

import net.ccbluex.liquidbounce.utils.MinecraftInstance

object UUIDSpoofer : MinecraftInstance() {
    var spoofId: String? = null

    @JvmStatic
    fun getUUID(): String = (if (spoofId == null) mc.session.playerID else spoofId!!).replace("-", "")
}
