package by.epam.javawebtraining.mitrahovich.task04.model.entity;

import by.epam.javawebtraining.mitrahovich.task04.model.parser.Parser;

public class TextConteiner extends ItemConteiner {

	public TextConteiner() {

	}

	/**
	 * @param parser
	 * @param next
	 */
	public TextConteiner(Parser parser, ItemConteiner next) {
		super(parser, next);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void parsing(String text) {

	}

}
