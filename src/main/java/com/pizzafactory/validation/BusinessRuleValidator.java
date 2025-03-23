package com.pizzafactory.validation;

import com.pizzafactory.model.Pizza;

public interface BusinessRuleValidator {
    void validate(Pizza pizza);
}
