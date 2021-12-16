package main

func main() {
	/* var card string = "Ace of Spades"
	card2 := "Three of Hearts"
	fmt.Println(card2)
	card2 = "Jack of Spades"
	fmt.Println(card2)
	fmt.Println(card) */

	cards := newDeck()

	cards.print()
}
