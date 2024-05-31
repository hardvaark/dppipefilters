
class Pipe {
    public Filtre filtre;
    private Pipe nextPipe;

    public Pipe(Filtre filtre) {
        this.filtre = filtre;
    }

    public void setNextPipe(Pipe nextPipe) {
        this.nextPipe = nextPipe;
    }

    public void process(String input) {
        String output = filtre.process(input);
        if (nextPipe != null) {
            nextPipe.process(output);
        } else {
            System.out.println(output);
        }
    }
}
