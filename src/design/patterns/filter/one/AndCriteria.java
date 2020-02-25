package design.patterns.filter.one;

import java.util.List;

public class AndCriteria implements Criteria {
    private Criteria firstCriteria;
    private Criteria secondCriteria;

    public AndCriteria(Criteria c1, Criteria c2){
        firstCriteria = c1;
        secondCriteria = c2;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firsCriteriaPersons = firstCriteria.meetCriteria(persons);
        return secondCriteria.meetCriteria(firsCriteriaPersons);
    }
}
