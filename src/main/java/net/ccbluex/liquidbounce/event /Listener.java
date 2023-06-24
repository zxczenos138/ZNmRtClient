/*
 * SilenceClient Hacked Client
 * A free open source mixin-based injection hacked client for Minecraft using Minecraft Forge by LiquidBounce.
 * https://github.com/ZNmRt/SilenceClient/
 */
package net.ccbluex.liquidbounce.event;

@FunctionalInterface
public interface Listener<Event> {
    void call(Event event);
}
