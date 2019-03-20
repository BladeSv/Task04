package by.epam.javawebtraining.mitrahovich.task04.model.entity;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import by.epam.javawebtraining.mitrahovich.task04.model.logic.strategy.Strategy;
import by.epam.javawebtraining.mitrahovich.task04.model.parser.Parser;

public abstract class ItemConteiner implements Treatment {
	private static Logger logger = Logger.getRootLogger();
	private String content = "";
	private List<Treatment> conteiner;
	private Parser parser;
	private Strategy strategy;
	private ItemConteiner next;

	public ItemConteiner() {

	}

	/**
	 * @param parser
	 * @param next
	 */
	public ItemConteiner(Parser parser, ItemConteiner next) {
		super();
		this.parser = parser;
		this.next = next;
		conteiner = new ArrayList<Treatment>();
	}

	public ItemConteiner(ItemConteiner itemConteiner) {
		super();
		this.parser = itemConteiner.getParser();
		this.next = itemConteiner.getNext();
		conteiner = new ArrayList<Treatment>();
	}

	public Parser getParser() {
		return parser;
	}

	public void setParser(Parser parser) {
		this.parser = parser;
	}

	public ItemConteiner getNext() {
		return next;
	}

	public void setNext(ItemConteiner next) {
		this.next = next;
	}

	public abstract void parsing(String text);

	public String collect() {
		return strategy.process(this.parser, this.content);

	}

	@Override
	public String toString() {

		return conteiner.toString();
	}

	public void setStategy(Strategy strategy) {
		this.strategy = strategy;
		for (Treatment t : conteiner) {

			t.setStategy(strategy);
		}

	}

}
