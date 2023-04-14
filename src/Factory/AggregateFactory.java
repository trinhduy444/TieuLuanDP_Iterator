package Factory;

import Aggregate.Aggregate;
import Model.Student;
import Enum.*;
import Aggregate.*;
public class AggregateFactory {
    public static Aggregate<Student> createAggregate(TypeList typeList){
        if(typeList == TypeList.MAP) {
            return new StudentMap();
        }
        else
            return new StudentList();

    }
}
