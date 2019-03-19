package by.epam.javawebtraining.mitrahovich.task04.model.entity;

import by.epam.javawebtraining.mitrahovich.task04.model.logic.strategy.Strategy;

public interface Treatment extends Cloneable {
	void parsing(String text);

	String collect();

	void setStategy(Strategy strategy);
}
