package org.uva.devoxx.cfp.domain;

import org.fornax.cartridges.sculptor.framework.domain.LeafProperty;
import org.fornax.cartridges.sculptor.framework.domain.PropertiesCollection;
import org.fornax.cartridges.sculptor.framework.domain.Property;

import org.uva.devoxx.cfp.domain.SujetProperties.SujetProperty;

/**
 * This generated interface defines property names for all
 * attributes and associatations in
 * {@link org.uva.devoxx.cfp.domain.Presentation}.
 * <p>
 * These properties are useful when building
 * criteria with {@link org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteriaBuilder},
 * which can be used with findByCondition Repository operation.
 */
public class PresentationProperties {
    private static final PresentationPropertiesImpl<Presentation> sharedInstance =
        new PresentationPropertiesImpl<Presentation>(Presentation.class);

    private PresentationProperties() {
    }

    public static Property<Presentation> id() {
        return sharedInstance.id();
    }

    public static Property<Presentation> createdDate() {
        return sharedInstance.createdDate();
    }

    public static Property<Presentation> createdBy() {
        return sharedInstance.createdBy();
    }

    public static Property<Presentation> lastUpdated() {
        return sharedInstance.lastUpdated();
    }

    public static Property<Presentation> lastUpdatedBy() {
        return sharedInstance.lastUpdatedBy();
    }

    public static Property<Presentation> version() {
        return sharedInstance.version();
    }

    public static Property<Presentation> format() {
        return sharedInstance.format();
    }

    public static Property<Presentation> audience() {
        return sharedInstance.audience();
    }

    public static Property<Presentation> langue() {
        return sharedInstance.langue();
    }

    public static SujetProperty<Presentation> sujet() {
        return sharedInstance.sujet();
    }

    /**
     * This class is used for references to {@link org.uva.devoxx.cfp.domain.Presentation},
     * i.e. nested property.
     */
    public static class PresentationProperty<T>
        extends PresentationPropertiesImpl<T> implements Property<T> {
        private static final long serialVersionUID = 1L;

        public PresentationProperty(String parentPath, String additionalPath,
            Class<T> owningClass) {
            super(parentPath, additionalPath, owningClass);
        }
    }

    protected static class PresentationPropertiesImpl<T>
        extends PropertiesCollection {
        private static final long serialVersionUID = 1L;
        Class<T> owningClass;

        PresentationPropertiesImpl(Class<T> owningClass) {
            super(null);
            this.owningClass = owningClass;
        }

        PresentationPropertiesImpl(String parentPath, String additionalPath,
            Class<T> owningClass) {
            super(parentPath, additionalPath);
            this.owningClass = owningClass;
        }

        public Property<T> id() {
            return new LeafProperty<T>(getParentPath(), "id", false, owningClass);
        }

        public Property<T> createdDate() {
            return new LeafProperty<T>(getParentPath(), "createdDate", false,
                owningClass);
        }

        public Property<T> createdBy() {
            return new LeafProperty<T>(getParentPath(), "createdBy", false,
                owningClass);
        }

        public Property<T> lastUpdated() {
            return new LeafProperty<T>(getParentPath(), "lastUpdated", false,
                owningClass);
        }

        public Property<T> lastUpdatedBy() {
            return new LeafProperty<T>(getParentPath(), "lastUpdatedBy", false,
                owningClass);
        }

        public Property<T> version() {
            return new LeafProperty<T>(getParentPath(), "version", false,
                owningClass);
        }

        public Property<T> format() {
            return new LeafProperty<T>(getParentPath(), "format", false,
                owningClass);
        }

        public Property<T> audience() {
            return new LeafProperty<T>(getParentPath(), "audience", false,
                owningClass);
        }

        public Property<T> langue() {
            return new LeafProperty<T>(getParentPath(), "langue", false,
                owningClass);
        }

        public SujetProperty<T> sujet() {
            return new SujetProperty<T>(getParentPath(), "sujet", owningClass);
        }
    }
}
