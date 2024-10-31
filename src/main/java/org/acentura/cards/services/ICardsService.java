package org.acentura.cards.services;

import org.acentura.cards.response.CardsResponse;

public interface ICardsService {
    /**
     *
     * @param mobileNumber - Mobile Number of the Customer
     */
    void createCard(String mobileNumber);

    /**
     *
     * @param mobileNumber - Input mobile Number
     *  @return Card Details based on a given mobileNumber
     */
    CardsResponse fetchCard(String mobileNumber);

    /**
     *
     * @param cardsResponse - CardsResponse Object
     * @return boolean indicating if the update of card details is successful or not
     */
    boolean updateCard(CardsResponse cardsResponse);

    /**
     *
     * @param mobileNumber - Input Mobile Number
     * @return boolean indicating if the delete of card details is successful or not
     */
    boolean deleteCard(String mobileNumber);
}
