package dev.lone.EpicBackpacks.API;

import org.bukkit.plugin.Plugin;

/**
 * The {@link NotActuallyEpicBackpacksException} is thrown whenever someone seems to
 * invoke an API method without actually having EpicBackpacks installed.
 * <p>
 * Remember, this is just a "mock", not the actual EpicBackpacks project.
 *
 * @author TheBusyBiscuit
 */
public class NotActuallyEpicBackpacksException extends UnsupportedOperationException
{
    /**
     * Our generated serial version UID (For serialization).
     */
    private static final long serialVersionUID = -4279938101049189157L;

    /**
     * This creates a new {@link NotActuallyEpicBackpacksException}.
     * Use the actual {@link Plugin} to test your features, not this.
     */
    public NotActuallyEpicBackpacksException()
    {
        super("Error: EpicBackpacks does not seem to be installed. This is just the API reference, not the actual implementation.");
    }
}
