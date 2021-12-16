package main

import "fmt"

// Create a new type: deck, a slice of strings

type deck []string

func newDeck() deck {
	cards := deck{}

	cardSuits := []string{"Spades", "Diamonds", "Hearts", "Clubs"}
	cardValues := []string{"Ace", "Two", "Three", "Four"}

	for _, suit := range cardSuits {
		for _, value := range cardValues {
			cards = append(cards, value+" of "+suit)
		}
	}

	return cards
}

// Receiver is usually referred to as one or two letters,
// such as deck -> d
// or a value type for screenWidth could be called sw, etc.

func (d deck) print() {
	for i, card := range d {
		fmt.Println(i+1, card)
	}
}
