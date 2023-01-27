public class Greeter {
    Formality formality;

    public Greeter() {
        this.formality = null;
    }

    public Greeter(Formality formality) {
        this.formality = formality;
    }

    public String greet() {
        if (formality == null) return "Hello.";
        return this.formality.greet();
    }
}
