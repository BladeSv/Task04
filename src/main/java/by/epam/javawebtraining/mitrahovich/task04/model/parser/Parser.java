package by.epam.javawebtraining.mitrahovich.task04.model.parser;

public abstract class Parser {
	private ParserType parserType;

	public abstract String[] parse(String text);

	public ParserType getParserType() {
		return parserType;
	}

	public Parser(ParserType parserType) {
		super();
		this.parserType = parserType;
	}

}
