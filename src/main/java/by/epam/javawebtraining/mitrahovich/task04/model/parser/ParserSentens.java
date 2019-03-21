package by.epam.javawebtraining.mitrahovich.task04.model.parser;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class ParserWord extends Parser {

	public ParserWord() {
		super(ParserType.WORD);
	}

	@Override
	public String[] parse(String text) {
		if (text != null && text.length() > 1) {

			Pattern p = Pattern.compile(" ");
			String[] temp = p.split(text);
			ArrayList<String> tempList = new ArrayList<>();
			for (int i = 0; i < temp.length; i++) {
				if (temp[i].length() != 1) {
					System.out.println(i);
					tempList.add(temp[i]);
					tempList.add(" ");

				}

			}

			return tempList.toArray(new String[tempList.size()]);

		}
		return null;

	}
}
