import java.util.Arrays;

public class Main {
    public static void main(String[] args){


        University university=new University();
        University university1=new University();
        University university2=new University();

        university.setName("Harvard");
        university.setLocation("Massachusetts City");
        university1.setName("Cambridge");
        university1.setLocation("Cambridge City");
        university2.setName("Stanford");
        university2.setLocation("California State");
        String[] universities= new String[]{university.getName()+"-"+university.getLocation(), university1.getName()+"-"+university1.getLocation(), university2.getName()+"-"+university2.getLocation()};



        School school=new School();
        School school1=new School();
        School school2=new School();
        school.setName("Cambridge School");
        school.setLocation("Cambridge City");
        school1.setName("Oxford School");
        school1.setLocation("Oxford City");
        school2.setName("Silk Road School");
        school2.setLocation("Bishkek City");
        String[] schools= new String[]{school.getName()+"-"+school.getLocation(),school1.getName()+"-"+school1.getLocation(),school2.getName()+"-"+school2.getLocation()};




        Car car=new Car();
        Car car1=new Car();
        Car car2=new Car();
        car.setName("Lexus");
        car.setColor("Black");
        car1.setName("Toyota");
        car1.setColor("White");
        car2.setName("Mercedes");
        car2.setColor("Blue");
        String[] cars= new String[]{car.getName()+"-"+car.getColor(), car1.getName()+"-"+car1.getColor(), car2.getName()+"-"+car2.getColor()};





        Person person=new Person();
        Person person1=new Person();
        Person person2=new Person();
        person.setName("Brad");
        person.setSurname("Pitt");
        person.setProfession("Actor");
        person1.setName("Cristiano");
        person1.setSurname("Ronaldo");
        person1.setProfession("Footballer");
        person2.setName("Khabib");
        person2.setSurname("Nurmagomedov");
        person2.setProfession("Fighter");
        String[] persons= new String[]{person.getName()+" "+person.getSurname()+"-"+person.getProfession(), person1.getName()+" "+person1.getSurname()+"-"+person1.getProfession(), person2.getName()+" "+person2.getSurname()+"-"+person2.getProfession()};

        System.out.println(Arrays.toString(universities));
        System.out.println(Arrays.toString(schools));
        System.out.println(Arrays.toString(cars));
        System.out.println(Arrays.toString(persons));






    }
}