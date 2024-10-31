package org.acentura.cards.mapper;

import org.acentura.cards.response.CardsResponse;
import org.acentura.cards.entity.Cards;

public class CardsMapper {

    public static CardsResponse mapToCardsDto(Cards cards, CardsResponse cardsResponse) {
        cardsResponse.setCardNumber(cards.getCardNumber());
        cardsResponse.setCardType(cards.getCardType());
        cardsResponse.setMobileNumber(cards.getMobileNumber());
        cardsResponse.setTotalLimit(cards.getTotalLimit());
        cardsResponse.setAvailableAmount(cards.getAvailableAmount());
        cardsResponse.setAmountUsed(cards.getAmountUsed());
        return cardsResponse;
    }

    public static Cards mapToCards(CardsResponse cardsResponse, Cards cards) {
        cards.setCardNumber(cardsResponse.getCardNumber());
        cards.setCardType(cardsResponse.getCardType());
        cards.setMobileNumber(cardsResponse.getMobileNumber());
        cards.setTotalLimit(cardsResponse.getTotalLimit());
        cards.setAvailableAmount(cardsResponse.getAvailableAmount());
        cards.setAmountUsed(cardsResponse.getAmountUsed());
        return cards;
    }

}
