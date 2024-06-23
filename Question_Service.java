import java.util.Arrays;
import java.util.Scanner;

public class Question_Service {

  Questions[] question = new Questions[5];
  String userAnswer[] = new String[5];
  String options[] = new String[4];

  public Question_Service() {
    question[0] = new Questions(1, "What is the My Name ?", "Kunal", "Vandana", "Matansh", "Kriyaansh", "Matansh");

    question[1] = new Questions(2, "What is the capital of India ?", "Rajesthan", "Kerala", "karnataka", "Delhi",
        "Delhi");

    question[2] = new Questions(3, "Which country is famous for Food ?", "Nepal", "Veitnam", "Bangladesh", "India",
        "India");

    question[3] = new Questions(4, "What is the size of int in byte ?", "2", "5", "6", "4", "4");

    question[4] = new Questions(5, "What is the size of char in byte ?", "2", "4", "1", "8", "2");
  }

  public void playQuiz() {
    int i = 0;
    for (Questions q : question) {
      System.out.println("Question No. " + q.getId());
      System.out.println(q.getQuestion());
      System.out.println(q.getOpt1());
      System.out.println(q.getOpt2());
      System.out.println(q.getOpt3());
      System.out.println(q.getOpt4());
      Scanner sc = new Scanner(System.in);
      userAnswer[i++] = sc.nextLine();
    }

  }

}
