package com.java.util;

import javax.persistence.AttributeConverter;

import com.java.model.CardIssued;

public class CardIssuedConverter implements AttributeConverter<CardIssued, Character> {

	public Character convertToDatabaseColumn(CardIssued card) {
		if (card == null) {
			return null;
		}

		return card.getType();
	}

	public CardIssued convertToEntityAttribute(Character type) {
		if (type == null ) {
			return null;
		}

		return CardIssued.fromType(type);
	}

}
