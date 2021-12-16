package main

import "fmt"

func main() {
	/* var card string = "Ace of Spades"
	card2 := "Three of Hearts"
	fmt.Println(card2)
	card2 = "Jack of Spades"
	fmt.Println(card2)
	fmt.Println(card) */

	cards := []string{newCard(), "Ace of Spades"}

	fmt.Println(cards)

	cards = append(cards, newCard())
	fmt.Println(cards)

	for i, card := range cards {
		fmt.Println(i+1, card)
	}
}

func newCard() string {
	return "Five of Diamonds"
}
