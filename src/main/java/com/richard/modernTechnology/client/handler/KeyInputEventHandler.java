package com.richard.modernTechnology.client.handler;

import com.richard.modernTechnology.client.settings.Keybindings;
import com.richard.modernTechnology.reference.Key;
import com.richard.modernTechnology.utility.LogHelper;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

public class KeyInputEventHandler {

	private static Key getPressedKeybindig(){
		if(Keybindings.charge.isPressed()){
			return Key.CHARGE;
		}else if(Keybindings.release.isPressed()){
			return Key.RELEASE;
		}
		
		return Key.UNKNOWN;
	}
	
	@SubscribeEvent
	public void handleKeyInputEvent(InputEvent.KeyInputEvent event){
		LogHelper.info(getPressedKeybindig());
	}
}
