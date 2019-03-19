package by.epam.javawebtraining.mitrahovich.task04.model.logic.strategy;

import by.epam.javawebtraining.mitrahovich.task04.model.parser.Parser;
import by.epam.javawebtraining.mitrahovich.task04.model.parser.ParserType;

public class Strategy1 implements Strategy {

	public Strategy1() {

	}

	public String process(Parser parser, String content) {
		StringBuilder sb = new StringBuilder();

		if (parser.getParserType() == ParserType.PARAGRAPH) {

		}
		return null;
	}

}