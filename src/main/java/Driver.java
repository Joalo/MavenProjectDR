import org.joda.time.LocalDate;
import java.util.Date;
import java.util.ArrayList;

public class Driver {






    public static void main(String[] args)
    {
        Driver MPDR = new Driver();

        ArrayList<Course> cours = new ArrayList<Course>();
        ArrayList<Student> STUS = new ArrayList<Student>();

        Module Biomed_technology = new Module("information_retreival","CT101" ,new ArrayList<Student>(), new ArrayList<Course>() );
        Module Software_Engineering = new Module("Software Engineering","BT500" ,new ArrayList<Student>(), new ArrayList<Course>() );
        Module Cryptography = new Module("Cryptography","CT900" ,new ArrayList<Student>(), new ArrayList<Course>() );
        Module Database_Systems = new Module("Database_Systems","CT540" ,new ArrayList<Student>(), new ArrayList<Course>() );

        Course BCT = new Course("BCT", new ArrayList<Student>(), new ArrayList<Module>(),new LocalDate("2018-05-05"),new LocalDate("2019-05-05"));
        Course BCS = new Course("BCS", new ArrayList<Student>(), new ArrayList<Module>(),new LocalDate("2018-05-05"),new LocalDate("2019-05-05"));

        cours.add(BCT);
        cours.add(BCS);

        Student Joshua = new Student(new LocalDate("1999-05-25"),"21","Joshua Mwenya", 17344276 ,null, new ArrayList<Module>() );
        Student Mapalo = new Student(new LocalDate("1998-11-24"),"22","Mapalo Mwenya", 17622285 ,null, new ArrayList<Module>() );

        Biomed_technology.addStudent(Joshua, Biomed_technology);
        Database_Systems.addStudent(Mapalo, Database_Systems);
        Database_Systems.addStudent(Joshua, Database_Systems);
        Cryptography.addStudent(Joshua, Cryptography);
        Software_Engineering.addStudent(Joshua, Software_Engineering );

        Biomed_technology.ModuleinCourse(Biomed_technology,BCS );
        Database_Systems.ModuleinCourse(Database_Systems, BCT );
        Database_Systems.ModuleinCourse(Database_Systems, BCS);
        Cryptography.ModuleinCourse(Cryptography, BCT );
        Software_Engineering.ModuleinCourse(Software_Engineering, BCT );


            for (Course cour : cours) {
                System.out.print("Course Name: " + cour.getCourseName() + "\n");

                System.out.println("Course modules");

                for (Module mod : cour.returnModule()) {
                    System.out.print(mod.getMODNAME() + "\n");

                    for (Student STU : mod.returnStudent()) {
                        if (!STUS.contains(STU)) {
                            STUS.add(STU);
                        }
                    }
                }

                System.out.println("-------------------");

            }

            System.out.println("-------------------");
            System.out.println("Students\n");

            for (Student STU : STUS) {
                System.out.println("username:" + STU.USERNAME(STU.getNAME(), STU.getAGE()));

                System.out.println("Assigned Modules:");
                for (Module mod : STU.returnModule()) {
                    System.out.println(mod.getMODNAME() + "");
                }

            }

        }



}
