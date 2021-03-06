package gov.nih.nci.po.util;

import org.hibernate.validator.ValidatorClass;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Used to validate that the scoper is unique for the given player, ignoring NULLIFIED records.
 * 
 * @author smatyas
 */
@Documented
@ValidatorClass(UniquePlayerScoperIdentifierValidator.class)
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface UniquePlayerScoperIdentifier {
    /**
     * get the message.
     */
    String message() default "{validator.uniquePlayerScoperIdentifier}";
}
