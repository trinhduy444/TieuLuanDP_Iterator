package Factory;

import Enum.TypeList;
import Inter.Aggregate;
import Inter.Iterator;
import Model.Student;
import ConcreteAggregate.*;
public class AggregateFactory {

    public static Iterator<Student> createAggregate(TypeList typeList){
        if(typeList == TypeList.MAP) {
            return new StudentMap();
        }
        else
            return new StudentList();

    }
}
