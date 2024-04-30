package Programacao_Sistemas.Associacao_de_classes.ex004;

public class HumanBeing {
    private String name;
    private int age;
    private Heart heart;
    private Lungs lungs;

    public HumanBeing(Heart heart, Lungs lungs) {
        this.heart = heart;
        this.lungs = lungs;
    }

    public HumanBeing() {
        this.lungs = lungs;
        this.heart = heart;
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void showData(){
        System.out.print("-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.printf("\nName : %s",name);
        System.out.printf("\nAge : %d",age);
        System.out.print("\n-=-=-=-=-=-=-=-=-=-=-=-\n");
        System.out.printf("Heart beat average : %d beats per minute ",heart.getBpm());
        System.out.printf("\nLungs volume : %d Liters",lungs.getVolume());

    }
}

