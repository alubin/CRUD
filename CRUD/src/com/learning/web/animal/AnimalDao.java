package com.learning.web.animal;

import java.util.HashMap;
import java.util.Map;

public class AnimalDao {

	public static AnimalDao instance = new AnimalDao();

	private Map<String, Animal> animals = new HashMap<String, Animal>();

	private AnimalDao() {

		//pumping-in some default data
		animals.put("1", new Animal("1", "Lion", "Wild"));
		animals.put("2", new Animal("2", "Crocodile", "Wild"));

	}

	public Map<String, Animal> getAnimals() {
		return animals;
	}


}
