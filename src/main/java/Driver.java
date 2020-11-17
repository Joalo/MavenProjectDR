import org.joda.time.LocalDate;
import java.util.Date;
import java.util.ArrayList;

public class Driver {



    public void StudentsinModule(Student STU , Module mods){

if (STU.getMODULES().contains(mods))
{
    return;
}
        else{

            ArrayList<Student> holder = mods.returnStudent();
            ArrayList<Module> stuinmods = STU.getMODULES();
            holder.add(STU);
            stuinmods.add(mods);
            mods.setSTUDENTLIST(holder);
            STU.setMODULES(stuinmods);

}

    }

    public void CoursesinModule(){


    }

    public void StudentsinCourse(){


    }

    public void ModulesinCourse(){


    }


    public static void main(String args[]) {


    }


}
