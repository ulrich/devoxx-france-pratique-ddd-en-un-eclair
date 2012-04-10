package org.uva.devoxx.cfp.domain;

import org.fornax.cartridges.sculptor.framework.domain.LeafProperty;
import org.fornax.cartridges.sculptor.framework.domain.PropertiesCollection;
import org.fornax.cartridges.sculptor.framework.domain.Property;

/**
 * This generated interface defines property names for all
 * attributes and associatations in
 * {@link org.uva.devoxx.cfp.domain.Sujet}.
 * <p>
 * These properties are useful when building
 * criteria with {@link org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteriaBuilder},
 * which can be used with findByCondition Repository operation.
 */
public class SujetProperties {
    private SujetProperties() {
    }

    /**
     * This class is used for references to {@link org.uva.devoxx.cfp.domain.Sujet},
     * i.e. nested property.
     */
    public static class SujetProperty<T> extends SujetPropertiesImpl<T>
        implements Property<T> {
        private static final long serialVersionUID = 1L;

        public SujetProperty(String parentPath, String additionalPath,
            Class<T> owningClass) {
            super(parentPath, additionalPath, owningClass);
        }
    }

    protected static class SujetPropertiesImpl<T> extends PropertiesCollection {
        private static final long serialVersionUID = 1L;
        Class<T> owningClass;

        SujetPropertiesImpl(Class<T> owningClass) {
            super(null);
            this.owningClass = owningClass;
        }

        SujetPropertiesImpl(String parentPath, String additionalPath,
            Class<T> owningClass) {
            super(parentPath, additionalPath);
            this.owningClass = owningClass;
        }

        public Property<T> titre() {
            return new LeafProperty<T>(getParentPath(), "titre", true,
                owningClass);
        }

        public Property<T> resume() {
            return new LeafProperty<T>(getParentPath(), "resume", true,
                owningClass);
        }

        public Property<T> theme() {
            return new LeafProperty<T>(getParentPath(), "theme", true,
                owningClass);
        }
    }
}
