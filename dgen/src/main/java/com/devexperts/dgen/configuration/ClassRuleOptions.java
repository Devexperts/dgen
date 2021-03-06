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
 * Options for {@link ClassRule class rule}.
 */
public class ClassRuleOptions {

    public static final ClassRuleOptions EMPTY = new ClassRuleOptions(null, true);

    private final DescriptionRetrieveStrategy descriptionRetrieveStrategy;
    private final boolean annotateClass;

    public ClassRuleOptions(DescriptionRetrieveStrategy descriptionRetrieveStrategy, boolean annotateClass) {
        this.descriptionRetrieveStrategy = descriptionRetrieveStrategy;
        this.annotateClass = annotateClass;
    }

    public DescriptionRetrieveStrategy getDescriptionRetrieveStrategy() {
        return descriptionRetrieveStrategy;
    }

    public boolean isAnnotateClass() {
        return annotateClass;
    }
}
