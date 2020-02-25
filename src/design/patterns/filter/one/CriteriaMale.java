package design.patterns.filter.one;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person>  malePersons = new ArrayList<>();
        for(Person p: persons){
            if(p.getGender().equalsIgnoreCase("male")){
                malePersons.add(p);
            }
        }

        return malePersons;
    }
}
