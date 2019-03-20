package by.epam.javawebtraining.mitrahovich.task04.model.parser;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class ParserText extends Parser {

	/**
	 * @param parserType
	 */
	public ParserText() {
		super(ParserType.TEXT);
	}

	@Override
	public String[] parse(String text) {
		if (text != null && text.length() > 1) {

			Pattern p = Pattern.compile("(\t|\n)");
			// Pattern p = Pattern.compile("(\t|\n)[A-ZА-Я]");
			// Pattern p = Pattern.compile("[.]");
			// LinkedList<String> temp = new
			// LinkedList<String>(Arrays.asList(p.split(text)));
			// temp.addFirst("\t");

			String[] temp = p.split(text);

			ArrayList<String> tempList = new ArrayList<>();
			for (int i = 0; i < temp.length; i++) {

				if (temp[i].length() != 1) {
					System.out.println(i);
					tempList.add("\t");
					tempList.add(temp[i]);
				}

			}

			return tempList.toArray(new String[tempList.size()]);
		}
		return null;

	}

}
