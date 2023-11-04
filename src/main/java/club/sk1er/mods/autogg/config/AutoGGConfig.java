package club.sk1er.mods.autogg.config;

import gg.essential.vigilance.Vigilant;
import gg.essential.vigilance.data.Property;
import gg.essential.vigilance.data.PropertyType;

import java.io.File;

@SuppressWarnings("FieldMayBeFinal")
public class AutoGGConfig extends Vigilant {
    @Property(
        type = PropertyType.SWITCH, name = "AutoGG",
        description = "Entirely toggles AutoGG",
        category = "General", subcategory = "General"
    )
    private boolean autoGGEnabled = true;

    @Property(
        type = PropertyType.SWITCH, name = "Casual AutoGG",
        description = "Enable AutoGG for things that don't give Karma such as Skyblock Events.",
        category = "General", subcategory = "General"
    )
    private boolean casualAutoGGEnabled;

    @Property(
        type = PropertyType.SWITCH, name = "Anti GG",
        description = "Remove GG messages from chat.",
        category = "General", subcategory = "Miscellaneous"
    )
    private boolean antiGGEnabled;

    @Property(
        type = PropertyType.SWITCH, name = "Anti Karma",
        description = "Remove Karma messages from chat.",
        category = "General", subcategory = "Miscellaneous"
    )
    private boolean antiKarmaEnabled;

    @Property(
        type = PropertyType.SLIDER, name = "Delay",
        description = "Delay after the game ends to say the message.\n§eMeasured in seconds.",
        category = "General", subcategory = "General",
        max = 5
    )
    private int autoGGDelay = 1;

    @Property(
        type = PropertyType.TEXT, name = "Phrase",
        description = "Choose what message is said on game completion.",
        category = "General", subcategory = "General"
    )
    private String autoGGPhrase = "gg";

    @Property(
        type = PropertyType.SWITCH, name = "Second Message",
        description = "Enable a secondary message to send after your first GG.",
        category = "General", subcategory = "Secondary Message"
    )
    private boolean secondaryEnabled;

    @Property(
        type = PropertyType.TEXT, name = "Phrase",
        description = "Send a secondary message sent after the first GG message.",
        category = "General", subcategory = "Secondary Message"
    )
    private String autoGGPhrase2 = "Have a good day :D";

    @Property(
        type = PropertyType.SLIDER, name = "Second Message Delay",
        description = "Delay between the first & second end of game messages.\n§eMeasured in seconds.",
        category = "General", subcategory = "Secondary Message",
        max = 5
    )
    private int secondaryDelay = 1;

    public AutoGGConfig() {
        super(new File("./config/autogg.toml"));
        initialize();
    }

    public boolean isModEnabled() {
        return autoGGEnabled;
    }

    public boolean isCasualAutoGGEnabled() {
        return casualAutoGGEnabled;
    }

    public boolean isAntiGGEnabled() {
        return antiGGEnabled;
    }

    public boolean isAntiKarmaEnabled() {
        return antiKarmaEnabled;
    }

    public int getAutoGGDelay() {
        return autoGGDelay;
    }

    public String getAutoGGPhrase() {
        return autoGGPhrase;
    }

    public boolean isSecondaryEnabled() {
        return secondaryEnabled;
    }

    public String getAutoGGPhrase2() {
        return autoGGPhrase2;
    }

    public int getSecondaryDelay() {
        return secondaryDelay;
    }

    public void setAutoGGDelay(int autoGGDelay) {
        this.autoGGDelay = autoGGDelay;
    }

    public void setSecondaryDelay(int secondaryDelay) {
        this.secondaryDelay = secondaryDelay;
    }
}
