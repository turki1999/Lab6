import java.util.ArrayList;


public class AnyCorrectChoiceQuestion extends Question
{
    private ArrayList<String> choices;
    private ArrayList<Integer> correctChoices;
    private int counter = 0;
    private int answerNum = 0;


    public AnyCorrectChoiceQuestion()
    {
        choices = new ArrayList<String>();
        correctChoices = new ArrayList<Integer>();
    }
    public void addChoice(String choice, boolean correct)
    {
        choices.add(choice);
        answerNum++;
        if(correct)
        {
            correctChoices.set(counter, answerNum);
            counter++;
        }
    }

    public void display()
    {
        // Display the question text
        super.display();
        // Display the answer choices
        for (int i = 0; i < choices.size(); i++)
        {
            int choiceNumber = i + 1;
            System.out.println(choiceNumber + ": " + choices.get(i));
        }
    }


    // check the index between the response and our original answers, only one correspondence is needed.

    public boolean checkAnswer(int response)
    {
        for(int i = 0; i <= correctChoices.size() - 1; i++)
        {
            if(response == correctChoices.get(i))
            {
                return true;
            }
        }

        return false;
    }
}
