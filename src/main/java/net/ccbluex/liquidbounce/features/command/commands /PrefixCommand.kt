/*
 * SilenceClient Hacked Client
 * A free open source mixin-based injection hacked client for Minecraft using Minecraft Forge by LiquidBounce.
 * https://github.com/ZNmRtClient/SilenceClient/
 */
package net.ccbluex.liquidbounce.features.command.commands

import net.ccbluex.liquidbounce.FDPClient
import net.ccbluex.liquidbounce.features.command.Command

class PrefixCommand : Command("prefix", emptyArray()) {
    /**
     * Execute commands with provided [args]
     */
    override fun execute(args: Array<String>) {
        if (args.size <= 1) {
            chatSyntax("prefix <character>")
            return
        }

        val prefix = args[1]

        if (prefix.length > 1) {
            alert("§cPrefix can only be one character long!")
            return
        }

        SilenceClient.commandManager.prefix = prefix.single()
        SilenceClient.fileManager.saveConfig(SilenceClient.fileManager.specialConfig)

        alert("Successfully changed command prefix to '§8$prefix§3'")
    }
}
