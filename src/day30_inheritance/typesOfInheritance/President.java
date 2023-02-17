package day30_inheritance.typesOfInheritance;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class President extends Person {

    private LocalDate electDate;

    public President(String name, char gender, LocalDate DOB, LocalDate electDate) {
        super(name, gender, DOB);
        setElectDate(electDate);
    }

    public LocalDate getElectDate() {
        return electDate;
    }

    public void setElectDate(LocalDate electDate) {
        this.electDate = electDate;
    }

    public void lie(){
        System.out.println(getName()+" is lying");
    }
}
