import org.joda.time.LocalDate;
import java.util.Date;
import java.util.ArrayList;

public class Driver {



    public void StudentsinModule(Student STU , Module mods)
    {

        if (STU.returnModule().contains(mods))
        {
            return;
        }
        else
            {
                    ArrayList<Student> holder = mods.returnStudent();
                    ArrayList<Module> modsforSTU = STU.returnModule();
                    holder.add(STU);
                    modsforSTU.add(mods);
                    mods.setSTUDENTLIST(holder);
                    STU.setMODULES(modsforSTU);
            }

    }

    public void CoursesinModule()
    {


    }

    public void StudentsinCourse(Student STU, Course cour)
    {
       ArrayList<Course> courinmods = STU.returnCourse();
       if( courinmods.contains(cour) == true)
       {
           return;
       }
       else
       {
           courinmods.add(cour);
           STU.setCOURSES(courinmods);
       }
    }

    public void ModulesinCourse(Module mods, Course cour)
    {
        if (mods.returnCourse().contains(cour) == true)
        {
            return;
        }
        else
            {
            ArrayList<Course> holder = mods.returnCourse();
            holder.add(cour);
            mods.setCOURSELIST(holder);

            ArrayList<Module> modsincour = cour.returnModule();
            modsincour.add(mods);
            cour.setMODULELIST(modsincour);

            ArrayList<Student> stuinmods = mods.returnStudent();
            ArrayList<Student> stuincour = cour.returnStudent();

            for (Student studentinmod : stuinmods)
            {
                stuincour.add(studentinmod);
            }
            
            cour.setSTUDENTLIST(stuincour);

            for (Student studentincour : stuincour)
            {
                StudentsinCourse(studentincour,cour);
            }

        }


    }


    public static void main(String[] args)
    {


    }


}
