package org.black_ixx.bossshop.events;

import org.black_ixx.bossshop.BossShop;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class BSReloadedEvent extends Event {

	private static final HandlerList handlers = new HandlerList();


	private BossShop plugin;



	public BSReloadedEvent(BossShop plugin) {
		this.plugin=plugin;
	}


	public BossShop getBossShop(){
		return plugin;
	}
	



	public static HandlerList getHandlerList() {
		return handlers;
	}

	@Override
	public HandlerList getHandlers() {
		return handlers;
	}

}