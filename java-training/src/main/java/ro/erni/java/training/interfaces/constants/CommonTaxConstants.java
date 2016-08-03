package ro.erni.java.training.interfaces.constants;

import java.math.BigDecimal;

/**
 * @author cara
 *
 *Implementing a constant interface causes this implementation detail to leak into the class's exported API. It
is of no consequence to the users of a class that the class implements a constant
interface. In fact, it may even confuse them. Worse, it represents a commitment: if
in a future release the class is modified so that it no longer needs to use the constants,
it still must implement the interface to ensure binary compatibility. If a
nonfinal class implements a constant interface, all of its subclasses will have their
namespaces polluted by the constants in the interface.
 */

public interface CommonTaxConstants {
    
    public static final String MAIN_KANTON_NAME = "Zuerich";
 
    public static final String HAUPT_KANTON_NAME = "Thurgau";
    
    public static final String FREMD_SYSTEM_ID = "HRA";

    public static final BigDecimal TAXATION_PERCENT = new BigDecimal("21.05");
    
    public static final String TAX_TYPE = "ELM";
    
    public static final String DOCUMENT_TYPE = "SDEC";
    
    public static final String HAUPT_KANTON_NAME = "Thu";
    
    public static final String FREMD_SYSTEM_ID = "HRA";

}
