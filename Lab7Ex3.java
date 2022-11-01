import java.util.ArrayList;


public class NumericQuestion extends Question
// TODO: Specify superclass
{
    private double tolerance;
    // TODO: Provide any needed instance variables
    private double answer;


    public NumericQuestion(double aTolerance)
    {
        this.tolerance = aTolerance;
    }

    public void setAnswer(double number)
    {

        answer = number;
    }

    public boolean checkAnswer(String response)
    {



        Double userresponse = Double.parseDouble(response);
        Double difference = userresponse - answer;
        return (tolerance >= Math.abs(difference));
    }
}