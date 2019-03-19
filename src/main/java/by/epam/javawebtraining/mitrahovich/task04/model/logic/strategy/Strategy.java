package by.epam.javawebtraining.mitrahovich.task04.model.logic.strategy;

import by.epam.javawebtraining.mitrahovich.task04.model.parser.Parser;

public interface Strategy {

	String process(Parser parser, String content);
}
