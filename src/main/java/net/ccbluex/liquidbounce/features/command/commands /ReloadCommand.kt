/*
 * SilenceClient Hacked Client
 * A free open source mixin-based injection hacked client for Minecraft using Minecraft Forge by LiquidBounce.
 * https://github.com/ZNmRtClient/SilenceClient/
 */
package net.ccbluex.liquidbounce.features.command.commands

import net.ccbluex.liquidbounce.FDPClient
import net.ccbluex.liquidbounce.features.command.Command
import net.ccbluex.liquidbounce.features.command.CommandManager
import net.ccbluex.liquidbounce.features.module.modules.misc.Insult
import net.ccbluex.liquidbounce.ui.cape.GuiCapeManager
import net.ccbluex.liquidbounce.ui.font.Fonts

class ReloadCommand : Command("reload", emptyArray()) {
    /**
     * Execute commands with provided [args]
     */
    override fun execute(args: Array<String>) {
        alert("Reloading...")
        alert("§c§lReloading commands...")
        SilenceClient.commandManager = CommandManager()
        SilenceClient.commandManager.registerCommands()
        SilenceClient.isStarting = true
        SilenceClient.isLoadingConfig = true
        SilenceClient.scriptManager.disableScripts()
        SilenceClient.scriptManager.unloadScripts()
        for (module in SilenceClient.moduleManager.modules)
            SilenceClient.moduleManager.generateCommand(module)
        alert("§c§lReloading scripts...")
        SilenceClient.scriptManager.loadScripts()
        SilenceClient.scriptManager.enableScripts()
        alert("§c§lReloading fonts...")
        Fonts.loadFonts()
        alert("§c§lReloading modules...")
        SilenceClient.configManager.load(SilenceClient.configManager.nowConfig, false)
        Insult.loadFile()
        GuiCapeManager.load()
        alert("§c§lReloading accounts...")
        SilenceClient.fileManager.loadConfig(SilenceClient.fileManager.accountsConfig)
        alert("§c§lReloading friends...")
        SilenceClient.fileManager.loadConfig(SilenceClient.fileManager.friendsConfig)
        alert("§c§lReloading xray...")
        SilenceClient.fileManager.loadConfig(SilenceClient.fileManager.xrayConfig)
        alert("§c§lReloading HUD...")
        SilenceClient.fileManager.loadConfig(SilenceClient.fileManager.hudConfig)
        alert("Reloaded.")
        SilenceClient.isStarting = false
        SilenceClient.isLoadingConfig = false
        System.gc()
    }
}
