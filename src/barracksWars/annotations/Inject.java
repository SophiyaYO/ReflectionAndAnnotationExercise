package barracksWars.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // казваме му, че има значение по време на runtime
@Target(ElementType.FIELD) //
public @interface Inject {

}
