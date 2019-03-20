package by.epam.javawebtraining.mitrahovich.task04.model.entity;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import by.epam.javawebtraining.mitrahovich.task04.model.logic.strategy.Strategy;
import by.epam.javawebtraining.mitrahovich.task04.model.parser.Parser;

public class ItemConteinerTemp extends Item {
	private static Logger logger = Logger.getRootLogger();
	private String content = "";
	private List<Treatment> conteiner;
	private Parser parser;
	private Strategy strategy;
	private Item next;

	public ItemConteinerTemp() {

	}

	/**
	 * @param parser
	 * @param next
	 */
	public ItemConteinerTemp(Parser parser, Item next) {
		super();
		this.parser = parser;
		this.next = next;
		conteiner = new ArrayList<Treatment>();
	}

	public ItemConteinerTemp(Item itemConteiner) {
		super();
		this.parser = itemConteiner.getParser();
		this.next = itemConteiner.getNext();
		conteiner = new ArrayList<Treatment>();

	}

	public void parsing(String text) {
		logger.trace("parser=" + parser.getClass().getSimpleName() + ", text to parse=" + text);
		if (text != null && text != "") {
			content = text;
			String[] str = parser.parse(text);
			logger.trace(parser.getClass().getSimpleName() + " array lehgt:" + str.length);
			if (str != null) {
				for (String s : str) {
					logger.trace("parser=" + parser.getClass().getSimpleName() + ", text after parse=" + s);
					Item temp = null;
					if (s != null) {
						try {
							temp = (Item) next.clone();
						} catch (CloneNotSupportedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

						conteiner.add(temp);
						// System.out.println(temp.getClass());
						System.out.println();
						temp.parsing(s);
					}
				}
			}
		}
	}

	public String collect() {
		return strategy.process(this.parser, this.content);

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Treatment t : conteiner) {
			sb.append(t.toString());
		}
		return sb.toString();
	}

	public void setStategy(Strategy strategy) {
		this.strategy = strategy;
		for (Treatment t : conteiner) {

			t.setStategy(strategy);
		}

	}

}
