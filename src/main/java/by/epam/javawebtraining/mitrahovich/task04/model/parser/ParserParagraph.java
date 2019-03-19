package by.epam.javawebtraining.mitrahovich.task04.model.parser;

import java.util.regex.Pattern;

public class ParserParagraph extends Parser {

	/**
	 * @param parserType
	 */
	public ParserParagraph() {
		super(ParserType.PARAGRAPH);

	}

	@Override
	public String[] parse(String text) {
		if (text != null && text != "") {

			Pattern p = Pattern.compile("");
			return p.split(text);
		}
		return null;

	}

}
