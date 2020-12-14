package dev.lone.EpicBackpacks.API;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.inventory.Inventory;
import org.jetbrains.annotations.NotNull;

public class EpicBackpackPersonalCloseEvent extends PlayerEvent
{
    public EpicBackpackPersonalCloseEvent(Player owner, Player viewer, Inventory gui)
    {
        super(viewer);
        throw new NotActuallyEpicBackpacksException();
    }

    @NotNull
    public HandlerList getHandlers()
    {
        throw new NotActuallyEpicBackpacksException();
    }

    @NotNull
    public static HandlerList getHandlerList()
    {
        throw new NotActuallyEpicBackpacksException();
    }

    public Player getViewer()
    {
        throw new NotActuallyEpicBackpacksException();
    }

    public Player getOwner()
    {
        throw new NotActuallyEpicBackpacksException();
    }

    public Inventory getGui()
    {
        throw new NotActuallyEpicBackpacksException();
    }
}