public class Student {
	
	private String name;
	private int[] scores;

	private double averageScore;
	private int totalScore;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

	public void setScores(int[] scores){
		this.scores = scores;

		computeTotalScore();
		computeAverageScore();
	}

	public int[] getScores(){
		return this.scores;
	}

	public double getAverageScore(){
		return this.averageScore;
	}

	public int getTotalScore(){
		return this.totalScore;
	}

	private void computeTotalScore(){
		int sum = 0;
		for(int score : scores){
		 sum += score;
		}
		this.totalScore = sum;
	}

	private void computeAverageScore(){
		this.averageScore = (double) totalScore / scores.length;
	}
} 