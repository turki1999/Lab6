public class Lab7Ex5 {

    public static void main(String[] args)

    {

        Question q = new Question();

        q.setText("Who was the inventor of Java?");

        q.setAnswer("James Gosling");

        boolean result = q.checkAnswer("Andrew Gosling");

    }

}



class Question

{

    private String text;

    private String answer;



    public Question()

    {

        text = "";

        answer = "";

    }



    public void setText(String questionText)

    {

        text = questionText;

    }



    public void setAnswer(String correctResponse)

    {

        answer = correctResponse;

    }



    public boolean checkAnswer(String response)

    {

        return response.equals(answer);

    }



}