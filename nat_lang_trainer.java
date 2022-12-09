import java.util.HashMap;

// To use this trainer, create a 'train' method with the text you want to use
// then use the 'getFrequency' method to see the frequency of a specific word

public class NaturalLanguageTrainer {
  // A map to store the frequency of each word in the training data
  private HashMap<String, Integer> wordFrequencies;

  public NaturalLanguageTrainer() {
    // Initialize the word frequencies map
    this.wordFrequencies = new HashMap<String, Integer>();
  }

  public void train(String text) {
    // Split the text into an array of words
    String[] words = text.split(" ");

    // Iterate over the words and update their frequencies
    for (String word : words) {
      if (this.wordFrequencies.containsKey(word)) {
        // If the word already exists in the map, increment its frequency
        this.wordFrequencies.put(word, this.wordFrequencies.get(word) + 1);
      } else {
        // Otherwise, add the word to the map with a frequency of 1
        this.wordFrequencies.put(word, 1);
      }
    }
  }

  public int getFrequency(String word) {
    // Return the frequency of the given word
    if (this.wordFrequencies.containsKey(word)) {
      return this.wordFrequencies.get(word);
    } else {
      // If the word doesn't exist in the map, return 0
      return 0;
    }
  }
}
