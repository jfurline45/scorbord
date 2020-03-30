package dev.JAYJAYTEE.TestPlugin.Events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.MapInitializeEvent;
import org.bukkit.map.MapRenderer;

public class map1Event implements Listener {

    @EventHandler
    public void onMapInitialize(MapInitializeEvent event){
        for (MapRenderer mr : event.getMap().getRenderers()) event.getMap().removeRenderer(mr);

        
    }

}
