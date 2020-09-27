import com.fasterxml.jackson.databind.JsonNode;

/**
 *
 */
public class EventFeature {

    private String label;

    private Integer cWord;



    public EventFeature(JsonNode masterNode, JsonNode canditNode, String label) {
        this.label = label;

    }


}
