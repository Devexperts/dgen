/*
 * #%L
 * Dgen - Description generator
 * %%
 * Copyright (C) 2015 - 2020 Devexperts, LLC
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */
package com.devexperts.dgen.configuration;

/**
 * Options for {@link FieldRule field rule}.
 */
public class FieldRuleOptions {

    public static final FieldRuleOptions EMPTY = new FieldRuleOptions(null);

    private final DescriptionRetrieveStrategy descriptionRetrieveStrategy;

    public FieldRuleOptions(DescriptionRetrieveStrategy descriptionRetrieveStrategy) {
        this.descriptionRetrieveStrategy = descriptionRetrieveStrategy;
    }

    public DescriptionRetrieveStrategy getDescriptionRetrieveStrategy() {
        return descriptionRetrieveStrategy;
    }
}
