package org.fundacionjala.app.quizz.model.validator;

import org.fundacionjala.app.quizz.model.configuration.DateConfiguration;

import java.text.ParseException;
import java.util.List;
import java.util.Locale;

public class UppercaseValidator implements Validator {

    private static final String ERROR_MESSAGE = "The velue must be in Uppercase";

    @Override
    public void validate(String value, String conditionValue, List<String> errors) {
        if(!value.equals(value.toUpperCase())){
            errors.add(ERROR_MESSAGE);
        }
    }
}
