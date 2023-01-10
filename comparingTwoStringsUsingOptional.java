import java.util.Optional;

class FuzzyMatchResponse {

  private String score;
  private String tokenThreshold;
  private String matching;
  private String version;
  private String oldMatchPercentage;
  private String shadowMatchPercentage;

  public FuzzyMatchResponse(String matching) {
    this.matching = matching;
  }

  public String getMatching() {
    return matching;
  }

  public String getScore() {
    return score;
  }

  public void setScore(String score) {
    this.score = score;
  }

  public void setMatching(String matching) {
    this.matching = matching;
  }
}

public class comparingTwoStringsUsingOptional {

  public static void main(String[] args){

    FuzzyMatchResponse fuzzyMatchResponse = new FuzzyMatchResponse("false");

    Boolean response = Optional.ofNullable(fuzzyMatchResponse)
        .map(FuzzyMatchResponse::getMatching)
        .map( matching -> matching.equals("true") )
        .orElse(false);

    fuzzyMatchResponse.setScore(new String());

    Boolean response2 = Optional.ofNullable(fuzzyMatchResponse)
        .map(FuzzyMatchResponse::getScore)
        .map( String:: isEmpty)
        .orElse(false);

    System.out.println(response2);

  }
}
