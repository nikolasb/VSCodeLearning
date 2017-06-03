public class Animal{
    private String name;
    private int age;
    private String breed;

    public Animal(String name, int age, String breed){
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public void changeName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void changeAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public changeBreed(string breed){
        this.breed = breed;
    }

    public String getBreed(){
        return breed;
    }
}