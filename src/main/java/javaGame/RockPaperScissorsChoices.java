package javaGame;

public enum RockPaperScissorsChoices {
    ROCK,PAPER,SCISSORS;

    public boolean beats(RockPaperScissorsChoices computerChoice) {
        return (this == ROCK && computerChoice == SCISSORS) ||
                (this == PAPER && computerChoice == ROCK) ||
                (this == SCISSORS && computerChoice == PAPER);
    }
}
