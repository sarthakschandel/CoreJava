package com.emc.managers;

import com.emc.entities.Event;

public class EventManagerImpl implements EventManager {

	@Override
	public Event create(long id) {
		return new Event(id, null, null);
	}

}
