package com.emc.test;

import com.emc.entities.Event;
import com.emc.entities.Organizer;
import com.emc.managers.*;

public class Test {

	public static void main(String args[]) {

//		Organizer organizer = new Organizer();
//		organizer.id = 123;
//		organizer.name = "Apple Inc";
//		System.out.println(organizer);
//		System.out.println(organizer.name);

		// since we make a parameterized constructor in the Event class, this default
		// one wont be created automatically
//		Event event = new Event();
//		event.id = 4567;
//		event.name = "Iphone 100 Launch";
//		event.description = "Grand Launch";

		// this one is a parameterized one, the output remains the same
//		Event event = new Event(4567, "Iphone 100 Launch", "Grand Launch");
//		System.out.println(event.getDescription());

		Organizer organizer = new Organizer();
		organizer.setId(123);
		organizer.setName("Apple Inc");
		System.out.println(organizer);
		System.out.println(organizer.getName());

		Event event = new Event(4567, "Iphone 100 Launch", "Grand Launch");
		System.out.println(event.getDescription());

		// EventManager em = new EventManagerImpl();
		// System.out.println(em.create(4567).getId());
		EventManager em = new EventManagerImpl2();
		System.out.println(em.create(4567).getName());
	}
}
