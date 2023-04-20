package structure5;

/**
 * This error is thrown by the Assert class in the event of a failed
 * precondition. Errors are thrown rather than exceptions because
 * failed preconditions are assumed to be an indication of such
 * an egregious program failure that recovery is impossible.
 *
 * @version $Id : FailedPrecondition.java 22 2006-08-21 19:27:26Z bailey $
 * @author, 2001 duane a. bailey
 * @see Assert#pre Assert#pre
 */
class FailedPrecondition extends FailedAssertion
{
    /**
     * The constant serialVersionUID.
     */
    final static long serialVersionUID = 0L;

    /**
     * Constructs an error indicating failure to meet a precondition.
     *
     * @param reason String describing precondition.
     * @post Constructs a new failed precondition
     */
    public FailedPrecondition(String reason)
    {
        super("\nA precondition: " + reason);
    }
}

