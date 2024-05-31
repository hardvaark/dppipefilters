
public class PipesFiltersDemo {
    public static void main(String[] args) {
        Filtre reader = new LecteurTxt();
        Filtre analyzer = new AnalyseurGrm();
        Filtre checker = new CorrecteurOrtho();
        Filtre formatter = new FormateurTxt();

        Pipe pipe1 = new Pipe(reader);
        Pipe pipe2 = new Pipe(analyzer);
        Pipe pipe3 = new Pipe(checker);
        Pipe pipe4 = new Pipe(formatter);

        pipe1.setNextPipe(pipe2);
        pipe2.setNextPipe(pipe3);
        pipe3.setNextPipe(pipe4);

        pipe1.process("Input text");
    }
}


