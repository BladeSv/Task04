package by.epam.javawebtraining.mitrahovich.task04.model.entity;

import by.epam.javawebtraining.mitrahovich.task04.model.logic.strategy.Strategy;

public class Item implements Treatment {
	private String content;

	public Item() {

	}

	public void parsing(String text) {
		content = text;
	}

	public String collect() {

		return content;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return content;
	}

	public void setStategy(Strategy strategy) {
		// TODO Auto-generated method stub

	}

}
