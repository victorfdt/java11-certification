package nl.victorfdt.annotations;

import java.lang.annotation.Repeatable;

@Repeatable(Risks.class)
public @interface Risk {
    String danger();
    String description() default "";
}
