package by.epam.javawebtraining.mitrahovich.task04.controller;

import by.epam.javawebtraining.mitrahovich.task04.io.WorkerTextFile;
import by.epam.javawebtraining.mitrahovich.task04.model.entity.Item;
import by.epam.javawebtraining.mitrahovich.task04.model.entity.ItemConteinerTemp;
import by.epam.javawebtraining.mitrahovich.task04.model.parser.Parser;
import by.epam.javawebtraining.mitrahovich.task04.model.parser.ParserParagraph;
import by.epam.javawebtraining.mitrahovich.task04.model.parser.ParserText;
import by.epam.javawebtraining.mitrahovich.task04.model.parser.ParserWord;

public class Controller {

	public Controller() {

	}

	public void run() {
		String text = WorkerTextFile.read();
		System.out.println(text);
		Parser parserText = new ParserText();
		Parser parserParagraph = new ParserParagraph();
		Parser parserWord = new ParserWord();
		Item conteiner3 = new ItemConteinerTemp(parserWord, new Item());
		Item conteiner2 = new ItemConteinerTemp(parserParagraph, conteiner3);
		Item conteiner1 = new ItemConteinerTemp(parserText, conteiner2);

		System.out.println();
		conteiner1.parsing(text);
		System.out.println();

		System.out.println(conteiner1);
	}

}
