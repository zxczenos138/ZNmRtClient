package net.ccbluex.liquidbounce.features.macro

import net.ccbluex.liquidbounce.FDPClient

class Macro(val key: Int, val command: String) {
    fun exec() {
        SilenceClient.commandManager.executeCommands(command)
    }
}
